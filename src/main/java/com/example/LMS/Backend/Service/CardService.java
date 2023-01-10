package com.example.LMS.Backend.Service;

import com.example.LMS.Backend.Enums.CardStatus;
import com.example.LMS.Backend.Models.Card;
import com.example.LMS.Backend.Models.Student;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    public Card createCard(Student student){

        Card newCard = new Card();
        newCard.setCardStatus(CardStatus.ACTIVATED);
        newCard.setStudent(student);
        return newCard;

    }
}
