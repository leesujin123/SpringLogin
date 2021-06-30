package com.example.springLogin.mapper;

import com.example.springLogin.vo.MemberVO;

public interface MemberMapper {
    MemberVO loginCheck(MemberVO vo);
}
