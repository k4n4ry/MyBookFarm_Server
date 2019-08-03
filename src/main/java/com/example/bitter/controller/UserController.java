package com.example.bitter.controller;

import com.example.bitter.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public ResponseEntity<HttpStatus> registUser(@RequestBody RegistUserRequest request) {
        userService.regist(request.getUid(), request.getUname(), request.getDescription());
        return new ResponseEntity<>(HttpStatus.OK);
    }

//    @PutMapping("/user")
//    public ResponseEntity<HttpStatus> putUserBookIsbn(@RequestBody RegistBookRequest request) {
//        bookService.update(request.getUid(), request.getIsbn(), request.getProgress());
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

}
