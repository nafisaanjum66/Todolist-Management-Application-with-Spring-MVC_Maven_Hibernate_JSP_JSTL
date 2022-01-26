package com.controller;

import com.dao.TodoDao;
import com.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoDao todoDao;

    @Autowired
    public TodoController(TodoDao todoDao){this.todoDao=todoDao;}

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder)
    {
        StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @RequestMapping("/list")
    public String list(Model model)
    {
        List<Todo> todos=todoDao.getAll();
        model.addAttribute("todos",todos);
        model.addAttribute("title","List of Todos");
        return "todo-list";
    }
    @RequestMapping("create")
    public String create(Model model)
    {
        //model.addAttribute("categories",bookCategoryService.getCategories());
        model.addAttribute("todo",new Todo());
        return "todo-create";
    }

    @RequestMapping("save")
    public String save(@Valid @ModelAttribute("todo") Todo todo, BindingResult bindingResult){
        if(bindingResult.hasErrors())
        {

            return "todo-create";
        }
        else {
            //todo.setNumberOfAvailableCopies(todo.getNumberOfCopies());
            todoDao.update(todo);
            return "redirect:/todo/list";
        }
    }

    @RequestMapping("saveUpdate")
    public String saveUpdate(@Valid @ModelAttribute("todo") Todo todo, BindingResult bindingResult){
        if(bindingResult.hasErrors())
        {

            return "todo-update";
        }
        else {
            //todo.setNumberOfAvailableCopies(todo.getNumberOfCopies());
            todoDao.update(todo);
            return "redirect:/todo/list";
        }
    }

    @RequestMapping("update")
    public String update(@RequestParam("id") int id, Model model)
    {
        Todo todo=todoDao.get(id);
        model.addAttribute("todo",todo);
        return "todo-update";
    }

    //    handle to delete
    @RequestMapping("delete")
    public RedirectView deleteTodo(@RequestParam("id") int id, HttpServletRequest request){
        this.todoDao.delete(id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath() + "/todo/list");
        return redirectView;
    }




}

