package com.example.bitter.controller;

import com.example.bitter.domain.MUser;
import com.example.bitter.domain.RBookUser;
import com.example.bitter.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public ResponseEntity<HttpStatus> registUser(@RequestBody RegistUserRequest request) {
        userService.regist(request.getUid(), request.getUname(), request.getDescription());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/user/{uid}")
    public ResponseEntity<UserResponse> getUser(@PathVariable String uid) {
        List<MUser> mUserList =  userService.getUser(uid);
        UserResponse userResponse = UserResponse.builder()
                .mUserList(mUserList)
                .build();
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

}
