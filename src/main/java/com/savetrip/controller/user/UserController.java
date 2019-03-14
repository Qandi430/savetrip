package com.savetrip.controller.user;

import com.savetrip.DAO.user.UserDAO;
import com.savetrip.DTO.user.UserDTO;
import com.savetrip.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.tags.Param;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserDAO userDAO;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginByGet(){
        return "layout/user/login";
    }

    @RequestMapping(value="/signUp",method = RequestMethod.GET)
    public String signUp(Model model){
        model.addAttribute("userList",userDAO.readAllUser());
        return "layout/user/signUp";
    }

    @RequestMapping(value="/signUp",method = RequestMethod.POST)
    public String signUpProcess(UserDTO user){
        userService.save(user,"USER");
        return "layout/user/login";
    }

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
