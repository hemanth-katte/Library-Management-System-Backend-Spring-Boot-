package com.example.LMS.Backend.Controller;

import com.example.LMS.Backend.RequestDto.StudentRequestDto;
import com.example.LMS.Backend.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create-student")
    public ResponseEntity<String> createStudent(@RequestBody StudentRequestDto studentRequestDto){

        studentService.createStudent(studentRequestDto);
        return new ResponseEntity<>("New student successfully added and card assigned", HttpStatus.CREATED);
    }
}
