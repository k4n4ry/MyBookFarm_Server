package com.example.bitter.controller;

import com.example.bitter.controller.request.RegistBookRequest;
import com.example.bitter.controller.response.BookResponse;
import com.example.bitter.domain.entity.RBookUser;
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

    @GetMapping("/book/{uid}/{isbn}")
    public ResponseEntity<BookResponse> getUserBookIsbn(@PathVariable String uid, @PathVariable String isbn) {
        List<RBookUser> rBookUserList =  bookService.getIsbnList(uid, isbn);
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

    @PutMapping("/book")
    public ResponseEntity<HttpStatus> putUserBookIsbn(@RequestBody RegistBookRequest request) {
        bookService.update(request.getUid(), request.getIsbn(), request.getProgress(), request.getMemo());
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
