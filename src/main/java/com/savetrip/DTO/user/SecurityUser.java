package com.savetrip.DTO.user;

import org.springframework.security.core.userdetails.User;

public class SecurityUser extends User {

    private static final long serialVersionUID = 1L;

    private String ip;

    public SecurityUser(UserDTO member) {
        super(member.getUserEmail(), member.getPassword(), member.getAuthorities());
    }


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

}
