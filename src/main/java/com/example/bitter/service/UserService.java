package com.example.bitter.service;

import com.example.bitter.domain.entity.MUser;
import com.example.bitter.domain.MUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final MUserRepository mUserRepository;

    public void regist(String uid, String uname, String description) {
        mUserRepository.insert(uid, uname, description);

    }

    public List<MUser> getUser(String uid) {
        return mUserRepository.get(uid);
    }
}
