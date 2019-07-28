package com.maciejg.SomtehingNew.Controller;

import com.maciejg.SomtehingNew.Entity.UsersEntity;
import com.maciejg.SomtehingNew.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UsersController {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/users")
    public List<UsersEntity> getAllUsers(){
        return usersRepository.findAll();
    }
}
