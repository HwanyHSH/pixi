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
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/join")
    public String join() {
        return "memberJoin";
    }

    @PostMapping("/joinProc")
    public String joinProc(MemberDTO memberDTO, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();

        int check = memberService.joinProcess(memberDTO);

        if (check > 0) {
            out.println("<script>");
            out.println("alert('회원가입을 완료하였습니다.')");
            out.println("location.href='/login'");
            out.println("</script>");
        } else {
            out.println("<script>");
            out.println("alert('회원가입을 실패하였습니다.')");
            out.println("history.back()");
            out.println("</script>");
        }

        return "login";
    }
}
