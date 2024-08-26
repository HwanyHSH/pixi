package com.psproject.model;

import lombok.Data;

@Data
public class MemberDTO {

    private int member_key;
    private String password;
    private String name;
    private String email;
    private String birth;
    private String gender;
    private String phone;
    private String nickname;
    private String type;
    private String role;
    private String create_date;
    private String update_date;
}
