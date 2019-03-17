package com.savetrip.DAO.main;

import com.savetrip.DTO.user.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainDAO {
    public UserDTO findUserByEmail(String userEmal);
}
