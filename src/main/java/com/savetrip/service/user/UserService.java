package com.savetrip.service.user;

import com.savetrip.DAO.user.UserDAO;
import com.savetrip.DTO.user.SecurityUser;
import com.savetrip.DTO.user.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService implements UserDetailsService {

    private static final String ROLE_PREFIX = "ROLE_";

    @Autowired
    UserDAO usersDAO;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        UserDTO userDTO = usersDAO.readUser(userEmail);
        if(userEmail != null){
            userDTO.setAuthorities(makeGrantedAuthority(usersDAO.readAuthorities(userDTO.getUserNo())));
        }
        return new SecurityUser(userDTO);
    }

    private static List<GrantedAuthority> makeGrantedAuthority(List<String> roles){
        List<GrantedAuthority> list = new ArrayList<>();
        roles.forEach(role -> list.add(new SimpleGrantedAuthority(ROLE_PREFIX + role)));
        return list;
    }
}
