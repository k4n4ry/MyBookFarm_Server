package com.example.bitter.service;

import com.example.bitter.domain.RBookUser;
import com.example.bitter.domain.RBookUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final RBookUserRepository rBookUserRepository;

    public void regist(String uid, String isbn) {
        rBookUserRepository.insert(uid, isbn);

    }

    public List<RBookUser> getIsbnList(String uid) {
        return rBookUserRepository.getBookList(uid);
    }

    public List<RBookUser> getIsbnList(String uid, String isbn) {
        return rBookUserRepository.getBookListIsbn(uid, isbn);
    }

    public void update(String uid, String isbn, int progress) {
        rBookUserRepository.update(uid, isbn, progress);
    }
}
