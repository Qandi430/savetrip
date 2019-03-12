package com.savetrip.controller.user;

import com.savetrip.DAO.user.UserDAO;
import com.savetrip.DTO.user.UserDTO;
import com.savetrip.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserDAO userDAO;
//
//    @GetMapping("/create")
//    public UserDTO create(){
//        UserDTO userDTO = new UserDTO();
//        userDTO.setUserEmail("admin@admin.com");
//        userDTO.setUserPassword("1234");
//        userDTO.setUserName("admin");
//        userDTO.setUserGender("M");
//        userService.save(userDTO,"ROLE_ADMIN");
//        return userDTO;
//    }

    @RequestMapping("/loginProcess")
    public @ResponseBody String  openApiReadUser(@PathVariable String userEmail) {
        UserDTO member = userDAO.readUser(userEmail);
        return member.getUsername();
    }


}