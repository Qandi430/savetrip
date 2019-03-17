package com.savetrip.service.main;

import com.savetrip.DAO.main.MainDAO;
import com.savetrip.DTO.user.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired
    MainDAO mainDAO;

    public UserDTO findUserByEmail(String userEmal){return mainDAO.findUserByEmail(userEmal);};
}
