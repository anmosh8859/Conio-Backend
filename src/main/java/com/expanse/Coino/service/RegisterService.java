package com.expanse.Coino.service;

import com.expanse.Coino.models.User;
import com.expanse.Coino.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegisterService {

    @Autowired
    UserRepository uRepository;

    public User getUser(String mobileNo){
        return uRepository.findByMobileNo(mobileNo);
    }

    public ResponseEntity registerUser(User user){
        uRepository.save(user);
        return ResponseEntity.ok("registration ho gaya!!!" + user.toString() );
    }
}
