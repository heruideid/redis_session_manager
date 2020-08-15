package com.nostalgia.redis_session_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @GetMapping("/test")
    public String test(HttpServletRequest request, Model model) throws IOException {
        List<String> list= (List<String>) request.getSession().getAttribute("list");
        if(list==null){
            list=new ArrayList<>();
        }
        list.add("xxx");
        model.addAttribute("sessionId",request.getSession().getId());
        model.addAttribute("listSize",list.size());
        request.getSession().setAttribute("list",list);
        return "test";
    }
}
