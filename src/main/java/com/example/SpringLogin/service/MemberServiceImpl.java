package com.example.springLogin.service;

import com.example.springLogin.mapper.MemberMapper;
import com.example.springLogin.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberMapper mapper;

    @Override
    public MemberVO loginCheck(MemberVO vo) {
        return mapper.loginCheck(vo);
    }
}
