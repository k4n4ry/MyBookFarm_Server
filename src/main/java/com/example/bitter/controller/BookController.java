package com.example.bitter.controller;

import com.example.bitter.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("/book")
    public ResponseEntity<HttpStatus> registBook(@RequestBody RegistBookRequest request) {

        bookService.regist(request.getUid(), request.getIsbn());
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
