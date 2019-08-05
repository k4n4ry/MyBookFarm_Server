package com.example.bitter.controller;

import com.example.bitter.domain.MUser;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class UserResponse {

    private List<MUser> mUserList;
}