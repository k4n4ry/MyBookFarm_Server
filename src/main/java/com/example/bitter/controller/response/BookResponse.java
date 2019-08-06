package com.example.bitter.controller.response;

import com.example.bitter.domain.entity.RBookUser;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class BookResponse {

    private List<RBookUser> rBookUserList;
}