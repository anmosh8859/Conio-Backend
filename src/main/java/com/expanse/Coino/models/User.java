package com.expanse.Coino.models;

import com.expanse.Coino.enumerates.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Email;

@Document(collection = "user")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @Id
    private String id;

    @NotBlank(message = "Mobile number is required")
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid Indian mobile number")
    private String mobileNo;
    private String name;
    private Number avatarNo;
    private Roles role;

    @Email(message = "Invalid email format")
    private String email;
}
