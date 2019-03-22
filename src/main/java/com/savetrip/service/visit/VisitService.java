package com.savetrip.service.visit;

import com.savetrip.DAO.visit.VisitDAO;
import com.savetrip.DTO.visit.VisitDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitService {

    @Autowired
    VisitDAO visitDAO;

    public List<VisitDTO> tripList(int userNo){return visitDAO.tripList(userNo);}
    public int createVisit(VisitDTO visitDTO){return visitDAO.createVisit(visitDTO);}
    public VisitDTO selectByVisitNo(int visitNo){return visitDAO.selectByVisitNo(visitNo);}
    public int updateTitle(VisitDTO visitDTO){return visitDAO.updateTitle(visitDTO);}
    public int updateContent(VisitDTO visitDTO){return visitDAO.updateContent(visitDTO);}
    public int updateSdate(VisitDTO visitDTO){return visitDAO.updateSdate(visitDTO);}
    public int updateEdate(VisitDTO visitDTO){return visitDAO.updateEdate(visitDTO);}
    public int updateCcode(VisitDTO visitDTO){return visitDAO.updateEdate(visitDTO);}
}
