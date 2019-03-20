package com.savetrip.controller.visit;

import com.savetrip.DTO.visit.VisitDTO;
import com.savetrip.service.visit.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;

@Controller
public class VisitController {

    @Autowired
    VisitService visitService;

    @RequestMapping("/createVisit")
    public void createVisit(HttpServletRequest request, HttpServletResponse response) throws IOException {
        VisitDTO visit = new VisitDTO();
        visit.setUserNo(Integer.parseInt(request.getParameter("userNo")));
        visit.setCcode(request.getParameter("ccode"));
        visitService.createVisit(visit);
        //model.addAttribute("visit",visitService.selectByVisitNo(visit.getVisitNo()));
        //return "layout/visit/tripInfo";
        response.sendRedirect("/tripInfo?visitNo="+visit.getVisitNo());
    }

    @RequestMapping("/tripInfo")
    public String tripInfo(HttpServletRequest request,Model model){
        model.addAttribute("visit",visitService.selectByVisitNo(Integer.parseInt(request.getParameter("visitNo"))));
        return "layout/visit/tripInfo";
    }

}
