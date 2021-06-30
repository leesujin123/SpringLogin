package com.example.springLogin.mapper;

import com.example.springLogin.vo.MemberVO;

public interface MemberMapper {
    int dbCheck();
    MemberVO loginCheck(MemberVO vo);
}
