package com.example.solid.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface ReajusteTributavel extends Reajuste {
    BigDecimal valorImpostoRenda();
}
