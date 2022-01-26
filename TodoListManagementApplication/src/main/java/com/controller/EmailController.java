package com.controller;

import com.model.Email;
import com.model.Login;
import com.model.Registration;
import com.service.TodoAppEmailService;
import com.service.TodoAppEmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private TodoAppEmailServiceImpl todoAppEmailService;

    @RequestMapping("/sendEmail")
    public String sendEmail(Model model){
        model.addAttribute("email",new Email());

        return "send-email-page";
    }

    @RequestMapping("/process-email")
    public String processEmail(@SessionAttribute("myRegister") Registration registration, @ModelAttribute("email") Email email){

        todoAppEmailService.sendEmail(registration.getUsername(),email.getUserEmail()," Check this");

        return "redirect:/todo/list";
    }

}
