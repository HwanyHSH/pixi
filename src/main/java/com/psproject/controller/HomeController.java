package com.psproject.controller;

import com.psproject.model.MemberDTO;
import com.psproject.service.MemberService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class HomeController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

}
