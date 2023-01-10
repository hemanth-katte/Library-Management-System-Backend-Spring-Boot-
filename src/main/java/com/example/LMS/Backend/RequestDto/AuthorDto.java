package com.example.LMS.Backend.RequestDto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AuthorDto {

    private String name;

    private String country;

    @Column(unique = true)
    private String email;

    int age;

}
