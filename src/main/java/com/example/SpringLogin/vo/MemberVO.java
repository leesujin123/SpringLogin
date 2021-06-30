package com.example.springLogin.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
public class MemberVO {
    private String memberId;
    private String memberPwd;
}
