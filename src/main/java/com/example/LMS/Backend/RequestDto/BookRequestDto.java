package com.example.LMS.Backend.RequestDto;

import com.example.LMS.Backend.Enums.BookGenre;
import lombok.Data;

@Data
public class BookRequestDto {

    private String name;

    private BookGenre bookGenre;

    private int authorId;

}
