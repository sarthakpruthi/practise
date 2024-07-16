package com.bhaicodekaro.bhaicodekaro_service.service;

import com.bhaicodekaro.bhaicodekaro_service.entity.UserEmail;
import com.bhaicodekaro.bhaicodekaro_service.model.UserEmailRequest;
import com.bhaicodekaro.bhaicodekaro_service.repository.EmailRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class UserService {
    @Autowired
    private EmailRepository emailRepository;

    public UserEmail saveEmail(UserEmailRequest emailRequest){
        try{
            UserEmail userEmail = UserEmail.builder().email(emailRequest.getEmail()).date(new Date()).build();
            UserEmail saved =  emailRepository.save(userEmail);
            log.info("given user email : " + userEmail.toString());
            log.info("saved user email : " + userEmail.toString());
            return saved;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
