package com.example.solid.service.promocao;

import com.example.solid.service.reajuste.ReajusteTributavel;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Anuenio implements ReajusteTributavel {

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

    @Override
    public BigDecimal valorImpostoRenda() {
        return valor.multiply(BigDecimal.valueOf(0.1));
    }
}
