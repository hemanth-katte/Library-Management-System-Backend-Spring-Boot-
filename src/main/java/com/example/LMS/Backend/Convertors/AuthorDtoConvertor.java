package com.example.LMS.Backend.Convertors;

import com.example.LMS.Backend.Models.Author;
import com.example.LMS.Backend.RequestDto.AuthorDto;

public class AuthorDtoConvertor {

    public static Author convertAuthorDtoToAuthor(AuthorDto authorDto){

        Author author = Author.builder().name(authorDto.getName()).age(authorDto.getAge()).
                country(authorDto.getCountry()).email(authorDto.getEmail()).build();

        return author;
    }
}
