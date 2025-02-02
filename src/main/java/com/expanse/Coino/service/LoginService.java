package com.expanse.Coino.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public ResponseEntity<String> userLogin(String mobileNo){
        return new ResponseEntity<String>("Ho gaya login: " + mobileNo, HttpStatus.OK);
    }
}
