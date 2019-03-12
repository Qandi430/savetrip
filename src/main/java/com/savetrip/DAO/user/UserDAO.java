package com.savetrip.DAO.user;

import com.savetrip.DTO.user.UserDTO;
import com.savetrip.DTO.user.UserRoleDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDAO {
    public UserDTO readUser(String userEmail);

    public List readAuthorities(int userNo);

    public void insertUser(UserDTO user);

    public void insertRole(UserRoleDTO userRoleDTO);

    public List readAllUser();
}
