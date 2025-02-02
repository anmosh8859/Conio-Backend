package com.expanse.Coino.controller;

import com.expanse.Coino.models.User;
import com.expanse.Coino.service.LoginService;
import com.expanse.Coino.service.RegisterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private LoginService lService;

    @Autowired
    private RegisterService rService;

    @GetMapping("/login/{mobileNo}")
    public ResponseEntity<User> loginThroughMobile(@PathVariable("mobileNo") String mobileNo){
        return ResponseEntity.ok(rService.getUser(mobileNo));
    }

    @PostMapping("/register")
    public ResponseEntity registerThroughCredentials(@Valid @RequestBody User user){
        return ResponseEntity.ok(rService.registerUser(user));
    }
}
