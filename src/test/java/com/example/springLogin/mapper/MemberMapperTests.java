package com.example.springLogin.mapper;

import com.example.springLogin.mapper.MemberMapper;
import com.example.springLogin.vo.MemberVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/dispatcher-servlet.xml","file:src/main/webapp/WEB-INF/applicationContext.xml" })
public class MemberMapperTests {

    @Autowired
    MemberMapper mapper;

    // DB 연결 Check
    @Test
    public void test(){
        int result = mapper.dbCheck();
        System.out.println(result);
    }
}
