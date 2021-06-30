package com.example.springLogin.controller;

import com.example.springLogin.service.MemberService;
import com.example.springLogin.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class MemberController {

    @Autowired
    MemberService service;

    @GetMapping("/login.do")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login.do")
    public String login(MemberVO vo, Model model) {
        System.out.println("MemberController.login");
        MemberVO mVo = service.loginCheck(vo);

        if(mVo == null) {
            return "main";
        }
        model.addAttribute("vo", mVo);
        return "hello";
    }
}
