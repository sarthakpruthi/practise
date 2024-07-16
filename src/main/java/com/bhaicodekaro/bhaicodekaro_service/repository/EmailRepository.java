package com.bhaicodekaro.bhaicodekaro_service.repository;

import com.bhaicodekaro.bhaicodekaro_service.entity.UserEmail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmailRepository extends MongoRepository<UserEmail,String> {
}
