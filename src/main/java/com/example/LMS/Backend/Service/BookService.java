package com.example.LMS.Backend.Service;

import com.example.LMS.Backend.Convertors.BookDtoConvertor;
import com.example.LMS.Backend.Models.Author;
import com.example.LMS.Backend.Models.Book;
import com.example.LMS.Backend.Repository.AuthorRepository;
import com.example.LMS.Backend.Repository.BookRepository;
import com.example.LMS.Backend.RequestDto.BookRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    public String saveBook(BookRequestDto bookRequestDto){
        try {
            Book newBook = BookDtoConvertor.convertBookDtoToBook(bookRequestDto);

            Author author = authorRepository.findById(bookRequestDto.getAuthorId()).get();

            newBook.setAuthor(author);

            List<Book> booksWritten = author.getBooksWritten();

            if (booksWritten != null)
                booksWritten.add(newBook);
            else {
                booksWritten = new ArrayList<>();
                booksWritten.add(newBook);
            }

            author.setBooksWritten(booksWritten);

            authorRepository.save(author);

            return "Book saved successfully";
        }
        catch(Exception e){
            log.info("Save book has caused an error");
            return "Book could not be created";
        }
    }
}
