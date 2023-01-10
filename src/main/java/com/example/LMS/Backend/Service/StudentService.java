package com.example.LMS.Backend.Service;

import com.example.LMS.Backend.Models.Card;
import com.example.LMS.Backend.Models.Student;
import com.example.LMS.Backend.Repository.CardRepository;
import com.example.LMS.Backend.Repository.StudentRepository;
import com.example.LMS.Backend.RequestDto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CardService cardService;

   // @Autowired
    //CardRepository cardRepository;

    public void createStudent(StudentRequestDto studentRequestDto){

        Student newStudent = new Student();
        newStudent.setName(studentRequestDto.getName());
        newStudent.setAge(studentRequestDto.getAge());
        newStudent.setEmail(studentRequestDto.getEmail());
        newStudent.setCountry(studentRequestDto.getCountry());

        Card newCard = cardService.createCard(newStudent);

        newStudent.setCard(newCard);

        studentRepository.save(newStudent);
       // cardRepository.save(newCard);



    }
}
