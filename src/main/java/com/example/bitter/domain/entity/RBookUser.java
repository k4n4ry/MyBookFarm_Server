package com.example.bitter.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RBookUser {

    private String uid;
    private String isbn;
    private String status;
    private int progress;
    private String memo;

}
