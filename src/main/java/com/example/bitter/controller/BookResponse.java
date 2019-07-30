package com.example.bitter.controller;

import com.example.bitter.domain.RBookUser;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class BookResponse {

    private List<RBookUser> rBookUserList;
}