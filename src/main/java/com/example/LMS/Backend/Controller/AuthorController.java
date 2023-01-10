package com.example.LMS.Backend.Controller;

import com.example.LMS.Backend.RequestDto.AuthorDto;
import com.example.LMS.Backend.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/create-author")
    public String createAuthor(@RequestBody() AuthorDto authorDto){
        return authorService.saveAuthor(authorDto);
    }
}
