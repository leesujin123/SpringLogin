package com.example.springLogin.service;

import com.example.springLogin.vo.MemberVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/dispatcher-servlet.xml","file:src/main/webapp/WEB-INF/applicationContext.xml" })
public class MemberServiceTests {

    @Autowired
    MemberService service;

    @Test
    public void loginCheckTest(){
        MemberVO vo = new MemberVO();
        vo.setMemberId("lsj4329");
        vo.setMemberPwd("dltnwls1219");

        MemberVO result = service.loginCheck(vo);
        System.out.println("###");
        System.out.println(result);
    }
}
