package com.example.bitter.controller.response;

import com.example.bitter.domain.entity.Currency;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class CurrencyResponse {

    private List<Currency> currencies;
}