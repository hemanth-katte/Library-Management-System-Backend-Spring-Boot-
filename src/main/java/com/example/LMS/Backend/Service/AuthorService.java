package com.example.LMS.Backend.Service;

import com.example.LMS.Backend.Convertors.AuthorDtoConvertor;
import com.example.LMS.Backend.Models.Author;
import com.example.LMS.Backend.Repository.AuthorRepository;
import com.example.LMS.Backend.RequestDto.AuthorDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String saveAuthor(AuthorDto authorDto){

        try {
            Author author = AuthorDtoConvertor.convertAuthorDtoToAuthor(authorDto);
            authorRepository.save(author);
        }catch(Exception e){
            log.info("Create author has caused an error");
            return "Author could not be created";
        }
        return "Author successfully created";

    }


}
