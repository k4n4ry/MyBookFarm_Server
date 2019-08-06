package com.example.bitter.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TUserProgress {

    private String uid;
    private String ymd;
    private String kbn;
    private String isbn;
    private int progress;

}
