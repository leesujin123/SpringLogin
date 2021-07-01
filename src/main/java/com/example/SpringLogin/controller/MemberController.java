package com.example.springLogin.controller;

import com.example.springLogin.service.MemberService;
import com.example.springLogin.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

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
    public String login(MemberVO vo, Model model, HttpSession session) {
        System.out.println("MemberController.login");
        MemberVO mVo = service.loginCheck(vo);
        session.setAttribute("login", service.loginCheck(vo));

        if(mVo == null) {
            session.setAttribute("errMsg", "로그인 정보가 올바르지 않습니다");
            return "login";
        }else{
            model.addAttribute("vo", mVo);
            return "hello";
        }
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();

        return "redirect:/";
    }
}
