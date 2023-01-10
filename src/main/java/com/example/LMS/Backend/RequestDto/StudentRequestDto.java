package com.example.LMS.Backend.RequestDto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequestDto {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    private String country;

    private int age;
}
