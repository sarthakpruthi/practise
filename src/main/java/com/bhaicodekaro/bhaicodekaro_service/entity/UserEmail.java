package com.bhaicodekaro.bhaicodekaro_service.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@Document("email")
public class UserEmail implements Serializable {
    private String email;
    private Date date;
}
