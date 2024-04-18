package org.learning.controller;

import org.learning.entity.Users;
import org.learning.repository.UsersRepository;
import org.learning.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UsersController {
    @Autowired
    UsersRepository usersRepository;

    @Autowired
    CommonUtils commonUtils;

    @GetMapping
    public List<Users> getAllUsers(){
        commonUtils.printKachra();
        return usersRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Users> AddUser(@RequestBody Users user){
        commonUtils.printKachra();
        Users addedUser = usersRepository.save(user);
        return new ResponseEntity<>(addedUser, HttpStatus.CREATED);
    }
}
