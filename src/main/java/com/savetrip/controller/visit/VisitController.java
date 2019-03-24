package com.savetrip.controller.visit;

import com.savetrip.DTO.visit.VisitDTO;
import com.savetrip.service.visit.VisitService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        response.sendRedirect("/tripInfo?visitNo="+visit.getVisitNo());
    }

    @RequestMapping("/tripInfo")
    public String tripInfo(HttpServletRequest request,Model model){
        model.addAttribute("visit",visitService.selectByVisitNo(Integer.parseInt(request.getParameter("visitNo"))));
        return "layout/visit/tripInfo";
    }

    @RequestMapping("/updateTitle")
    @ResponseBody
    public int updateTitle(VisitDTO visit){
        return visitService.updateTitle(visit);
    }

    @RequestMapping("/updateContent")
    @ResponseBody
    public int updateContent(VisitDTO visitDTO){
        System.out.println(visitDTO.toString());
        return visitService.updateContent(visitDTO);
    }

    @RequestMapping("/updateSdate")
    @ResponseBody
    public int updateSdate(VisitDTO visitDTO){return visitService.updateSdate(visitDTO);}

    @RequestMapping("/updateEdate")
    @ResponseBody
    public int updateEdate(VisitDTO visitDTO){return visitService.updateEdate(visitDTO);}

    @RequestMapping("/updateCcode")
    @ResponseBody
    public int updateCcode(VisitDTO visitDTO){return visitService.updateCcode(visitDTO);}

    @RequestMapping("/deleteVisit")
    public void deleteVisit(int visitNo,HttpServletResponse response) throws IOException {
        visitService.deleteVisit(visitNo);
        response.sendRedirect("/");
    }
}
