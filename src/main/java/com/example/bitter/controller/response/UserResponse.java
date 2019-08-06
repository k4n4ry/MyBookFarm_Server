package com.example.bitter.controller.response;

import com.example.bitter.domain.entity.MUser;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class UserResponse {

    private List<MUser> mUserList;
}