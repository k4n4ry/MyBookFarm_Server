package com.example.bitter.controller.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistUserProgressRequest {

    private String uid;

    private String ymd;

    private String kbn;

    private String isbn;

    private int progress;


}