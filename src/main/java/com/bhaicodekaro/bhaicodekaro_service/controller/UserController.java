package com.bhaicodekaro.bhaicodekaro_service.controller;

import com.bhaicodekaro.bhaicodekaro_service.entity.UserEmail;
import com.bhaicodekaro.bhaicodekaro_service.model.UserEmailRequest;
import com.bhaicodekaro.bhaicodekaro_service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/email")
    public ResponseEntity<UserEmail> saveEmail(@RequestBody UserEmailRequest emailRequest){
        UserEmail userEmail =  userService.saveEmail(emailRequest);
        log.info(userEmail.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(userEmail);

    }
}
