package com.example.LMS.Backend.Controller;

import com.example.LMS.Backend.RequestDto.BookRequestDto;
import com.example.LMS.Backend.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/create-book")
    public String createBook(@RequestBody()BookRequestDto bookRequestDto){

        return bookService.saveBook(bookRequestDto);
    }
}
