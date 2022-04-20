package com.example.solid.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DadosPessoais {
    private String nome;
    private String cpf;
    private Cargo cargo;
    private BigDecimal salario;
}
