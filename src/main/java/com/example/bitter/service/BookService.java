package com.example.bitter.service;

import com.example.bitter.controller.RegistBookRequest;
import com.example.bitter.domain.RBookUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final RBookUserRepository rBookUserRepository;

    public void regist(String address, String isbn) {
        rBookUserRepository.insert(address, isbn);

    }

}
