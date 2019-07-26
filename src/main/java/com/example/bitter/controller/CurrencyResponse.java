package com.example.bitter.controller;

import com.example.bitter.domain.Currency;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class CurrencyResponse {

    private List<Currency> currencies;
}