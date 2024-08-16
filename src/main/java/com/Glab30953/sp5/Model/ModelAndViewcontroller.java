package com.Glab30953.sp5.Model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ModelAndViewcontroller {
    @GetMapping("/showViewPage")
    public String passParametersWithModel(Model model){
    model.addAttribute("message", "Perscholas");
    model.addAttribute("welcomeMessage", "welcome");
    int i = 10;
    model.addAttribute("number", i);
        List<String> list = Arrays.asList("one", "two");
        model.addAttribute("listData", list);
        return "viewPage";
    }


    //Example One - ModelAndView
    @GetMapping("/goToViewPage")
    public ModelAndView passParametersWithModelAndView() {
        String st = "Welcome to the Page";
        ModelAndView modelAndView = new ModelAndView("viewPage_2");

        modelAndView.addObject("message", st);
        modelAndView.addObject("info", "Employee information.");
        return modelAndView;
    }

    //Example Two - ModelAndView
    @GetMapping("/goToUserViewPage")
    public ModelAndView userModelAndView(){
        List<User> listUsers = new ArrayList<User>();
        listUsers.add(new User(1, "Julio", "js@gmail.com"));
        listUsers.add(new User(2, "lio", "lios@gmail.com"));
        listUsers.add(new User(3, "uli", "ulis@gmail.com"));
        listUsers.add(new User(4, "Jul", "juls@gmail.com"));

        ModelAndView modelAndView = new ModelAndView("userdata");

        modelAndView.addObject("userlist", listUsers);
        return modelAndView;
    }

}

