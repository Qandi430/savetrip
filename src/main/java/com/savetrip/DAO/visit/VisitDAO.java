package com.savetrip.DAO.visit;

import com.savetrip.DTO.visit.VisitDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VisitDAO {
    public List<VisitDTO> tripList(int userNo);
    public int createVisit(VisitDTO visitDTO);
}
