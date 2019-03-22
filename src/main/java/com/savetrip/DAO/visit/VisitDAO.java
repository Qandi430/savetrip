package com.savetrip.DAO.visit;

import com.savetrip.DTO.visit.VisitDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VisitDAO {
    List<VisitDTO> tripList(int userNo);
    int createVisit(VisitDTO visitDTO);
    VisitDTO selectByVisitNo(int visitNo);
    int updateTitle(VisitDTO visitDTO);
    int updateContent(VisitDTO visitDTO);
    int updateSdate(VisitDTO visitDTO);
    int updateEdate(VisitDTO visitDTO);
    int updateCcode(VisitDTO visitDTO);
}
