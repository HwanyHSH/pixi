package com.psproject.service;

import com.psproject.model.CustomUserDetails;
import com.psproject.model.MemberDTO;
import com.psproject.model.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    MemberMapper memberMapper;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        System.out.println(email);

        MemberDTO memberDTO = memberMapper.findMemberName(email);

        if (memberDTO != null) {
            return new CustomUserDetails(memberDTO);
        }else{
            throw new UsernameNotFoundException(email);
        }

    }

}
