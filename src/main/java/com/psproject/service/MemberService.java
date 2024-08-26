package com.psproject.service;

import com.psproject.model.MemberDTO;
import com.psproject.model.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public int joinProcess(MemberDTO memberDTO) {

        String password = bCryptPasswordEncoder.encode(memberDTO.getPassword());

        memberDTO.setPassword(password);

        memberDTO.setRole("ROLE_USER");

        int check = memberMapper.insertMember(memberDTO);

        return check;
    }
}
