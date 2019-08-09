package com.example.bitter.service;

import com.example.bitter.domain.TUserProgressRepository;
import com.example.bitter.domain.entity.TUserProgress;
import com.example.bitter.util.StringUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserProgressService {

    private final TUserProgressRepository tUserProgressRepository;

    public void regist(String uid, String ymd, String kbn, String isbn, int progress) {
        tUserProgressRepository.regist(uid, ymd, kbn, isbn, progress);

    }

    public List<TUserProgress> getUserProgressYYYYMM(String uid, String yyyymm) {
        return tUserProgressRepository.getUserProgressYYYYMM(uid, StringUtil.getThisMonth(yyyymm), StringUtil.getAnyAfterMonth(yyyymm, 1));
    }

    public List<TUserProgress> getUserProgress(String uid) {
        return tUserProgressRepository.getUserProgress(uid);
    }
}
