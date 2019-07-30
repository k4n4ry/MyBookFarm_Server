package com.example.bitter.controller;

import com.example.bitter.domain.RBookUser;
import com.example.bitter.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/book/{uid}")
    public ResponseEntity<BookResponse> getUserBook(@PathVariable String uid) {
        List<RBookUser> rBookUserList =  bookService.getIsbnList(uid);
        BookResponse bookResponse = BookResponse.builder()
                .rBookUserList(rBookUserList)
                .build();
        return new ResponseEntity<>(bookResponse, HttpStatus.OK);

    }

    @PostMapping("/book")
    public ResponseEntity<HttpStatus> registBook(@RequestBody RegistBookRequest request) {

        bookService.regist(request.getUid(), request.getIsbn());
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
