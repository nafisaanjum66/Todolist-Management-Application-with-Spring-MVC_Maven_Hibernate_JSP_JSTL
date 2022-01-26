package com.controller;

import com.dao.LoginDao;
import com.dao.RegistrationDao;
import com.model.Login;
import com.model.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
@Scope("session")
@RequestMapping("/registration")
public class RegistrationController {
    private RegistrationDao registrationDao;
    private LoginDao loginDao;

    @Autowired
    public RegistrationController(RegistrationDao registrationDao,LoginDao loginDao){this.registrationDao=registrationDao;
        this.loginDao=loginDao;
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder)
    {
        StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @RequestMapping("/list")
    public String list(Model model)
    {
        List<Registration> registrations=registrationDao.getAll();
        model.addAttribute("registrations",registrations);
        model.addAttribute("title","List of Registrations");
        return "registration-list";
    }

    @RequestMapping("create")
    public String create(Model model, HttpSession session)
    {

        if(session.getAttribute("myRegister") != null)
        {

            Registration registration = (Registration) session.getAttribute("myRegister");

            String pageEmail = registration.getEmail();
            session.setAttribute("pageEmail",pageEmail);

                    Login login = new Login(registration.getUsername(),registration.getPassword());
            loginDao.update(login);
        }
        //session.removeAttribute("myRegister");


        model.addAttribute("registration",new Registration());
        model.addAttribute("title","List of Registrations");
        return "registration-create";
    }

/*    @RequestMapping("loginsave")
    public String loginsave(Model model, HttpSession session)
    {

        *//*model.addAttribute("registration",new Registration());
        model.addAttribute("title","List of Registrations");*//*

        if(session.getAttribute("myRegister") != null)
        {
            Registration registration = (Registration) session.getAttribute("myUser");
            Login login = new Login(registration.getUsername(),registration.getPassword());
            loginDao.update(login);
        }
        session.removeAttribute("myRegister");
       // model.addAttribute("user",new User());
        //return "signup";

        return "redirect:/login/login";
    }*/

    @RequestMapping("save")
    public String save(@Valid @ModelAttribute("registration") Registration registration, BindingResult bindingResult,HttpSession session){
        if(bindingResult.hasErrors())
        {

            return "registration-create";
        }
        else {

//            return "redirect:/todo/list";
            session.setAttribute("myRegister", registration);

            registrationDao.update(registration);
            return "redirect:/registration/create";
        }
    }

    @RequestMapping("saveUpdate")
    public String saveUpdate(@Valid @ModelAttribute("todo") Registration registration, BindingResult bindingResult){
        if(bindingResult.hasErrors())
        {

            return "registration-update";
        }
        else {
            registrationDao.update(registration);
            return "redirect:/registration/list";
        }
    }

    @RequestMapping("update")
    public String update(@RequestParam("id") int id, Model model)
    {
        Registration registration=registrationDao.get(id);
        model.addAttribute("registration",registration);
        return "registration-update";
    }

    //    handle to delete
    @RequestMapping("delete")
    public RedirectView deleteTodo(@RequestParam("id") int id, HttpServletRequest request){
        this.registrationDao.delete(id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath() + "/registration/list");
        return redirectView;
    }



}
