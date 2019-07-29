package com.example.bitter.service;

import com.example.bitter.domain.RBookUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final RBookUserRepository rBookUserRepository;

    public void regist(String uid, String isbn) {
        rBookUserRepository.insert(uid, isbn);

    }

}
