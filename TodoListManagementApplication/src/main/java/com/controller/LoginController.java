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

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
@Scope("session")
@RequestMapping("/login")
public class LoginController {

    private LoginDao loginDao;
    private RegistrationDao registrationDao;


    public LoginController() {
    }

    @Autowired
    public LoginController(LoginDao loginDao,RegistrationDao registrationDao) {
        this.loginDao = loginDao;
        this.registrationDao = registrationDao;
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder)
    {
        StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @RequestMapping("login")
    public String login(Model model)
    {
        model.addAttribute("login",new Login());
        return "login-form";
    }


    @RequestMapping("verify")
    public String validate(@Valid @ModelAttribute("login")Login login, BindingResult bindingResult, HttpSession session)
    {
        if(bindingResult.hasErrors())
        {
            session.setAttribute("error","failed");
//            session.removeAttribute("error");
            return "login-form";
        }
        else
        {
            session.setAttribute("error","success");
            String username = login.getUsername();
            String password = login.getPassword();

            List<Login> logins = loginDao.getAll();
            for (Login myLogin : logins){
                if(myLogin.getUsername().equals(username) && myLogin.getPassword().equals(password))
                {
                    List<Registration> registrations = registrationDao.getAll();
                    for (Registration registration : registrations){
                        if(registration.getUsername().equals(username) && registration.getPassword().equals(password)){
                            session.setAttribute("loginUser", registration);
                            session.setAttribute("username", username);
                            session.setAttribute("userid", registration.getId());
                            session.setAttribute("pageEmail", registration.getEmail());
                            return "redirect:/email/sendEmail";
                        }
                    }
                }
            }
            session.setAttribute("error","failed");
            return "login-form";
        }
    }
}
