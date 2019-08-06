package com.example.bitter.controller;

import com.example.bitter.controller.request.RegistUserProgressRequest;
import com.example.bitter.controller.response.UserProgressResponse;
import com.example.bitter.domain.entity.TUserProgress;
import com.example.bitter.service.UserProgressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserProgressController {

    private final UserProgressService userProgressService;

    @GetMapping("/user/progress/{uid}/{yyyymm}")
    public ResponseEntity<UserProgressResponse> getUserProgressYYYYMM(@PathVariable String uid, @PathVariable String yyyymm) {
        List<TUserProgress> tUserProgressList =  userProgressService.getUserProgressYYYYMM(uid, yyyymm);
        UserProgressResponse userProgressResponse = UserProgressResponse.builder()
                .tUserProgressList(tUserProgressList)
                .build();
        return new ResponseEntity<>(userProgressResponse, HttpStatus.OK);
    }

    @PostMapping("/user/progress")
    public ResponseEntity<HttpStatus> registUserProgress(@RequestBody RegistUserProgressRequest request) {
        userProgressService.regist(request.getUid(), request.getYmd(), request.getKbn(), request.getIsbn(),request.getProgress());
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
