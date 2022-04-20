package com.example.solid.service.reajuste;

import com.example.solid.model.Funcionario;

import java.math.BigDecimal;


public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);

}
