package com.example.bitter.controller.response;

import com.example.bitter.domain.entity.TUserProgress;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class UserProgressResponse {

    private List<TUserProgress> tUserProgressList;
}