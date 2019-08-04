package com.example.bitter.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistBookRequest {

    private String uid;

    private String isbn;

    private int progress;

    private String memo;

}