package com.example.solid.service.promocao;

import com.example.solid.service.reajuste.Reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements Reajuste {

    private BigDecimal valor;
    private LocalDate data;

    @Override
    public BigDecimal valor() {
        return valor;
    }

    @Override
    public LocalDate data() {
        return data;
    }
}
