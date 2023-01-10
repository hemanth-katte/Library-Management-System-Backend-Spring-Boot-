package com.example.LMS.Backend.Convertors;


import com.example.LMS.Backend.Models.Book;
import com.example.LMS.Backend.RequestDto.BookRequestDto;

public class BookDtoConvertor {

    public static Book convertBookDtoToBook(BookRequestDto bookRequestDto){

        Book book = Book.builder().name(bookRequestDto.getName()).bookGenre(bookRequestDto.getBookGenre()).build();

        return book;
    }
}
