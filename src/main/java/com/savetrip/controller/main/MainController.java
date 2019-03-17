package com.savetrip.controller.main;

import com.savetrip.DTO.user.UserDTO;
import com.savetrip.DTO.visit.VisitDTO;
import com.savetrip.service.main.MainService;
import com.savetrip.service.visit.VisitService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    MainService mainService;

    @Autowired
    VisitService visitService;

    @RequestMapping("/")
    public String main(Principal principal, HttpSession session, Model model){
        UserDTO user = mainService.findUserByEmail(principal.getName());
        session.setAttribute("user", user);
        List<VisitDTO> tripList = visitService.tripList(user.getUserNo());
        int countTrip = tripList.size();
        model.addAttribute("userNo",user.getUserNo());
        model.addAttribute("countTrip",countTrip);
        model.addAttribute("tripList",tripList);
        return "layout/main/main";
    }

}
