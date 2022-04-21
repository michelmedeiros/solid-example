package com.example.solid;

import com.example.solid.model.Cargo;
import com.example.solid.model.DadosPessoais;
import com.example.solid.model.Funcionario;
import com.example.solid.service.reajuste.ReajusteService;
import com.example.solid.service.reajuste.ValidacaoPercentualReajuste;
import com.example.solid.service.reajuste.ValidacaoPeriodicidadeEntreReajustes;
import com.example.solid.service.reajuste.ValidacaoReajuste;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SolidApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolidApplication.class, args);
		List<ValidacaoReajuste> validacaoReajusteList = new ArrayList<>();
		validacaoReajusteList.add(new ValidacaoPercentualReajuste());
		validacaoReajusteList.add(new ValidacaoPeriodicidadeEntreReajustes());

		ReajusteService service = new ReajusteService(validacaoReajusteList);
		DadosPessoais dadosPessoais = new DadosPessoais();
		dadosPessoais.setCargo(Cargo.ANALISTA);
		dadosPessoais.setCpf("008.873.585-77");
		dadosPessoais.setSalario(new BigDecimal(1000));
		dadosPessoais.setNome("Fulano");
		var funcionario = new Funcionario(dadosPessoais, LocalDate.now().minusMonths(11));
		service.reajustarSalarioDoFuncionario(funcionario, BigDecimal.valueOf(200));
		System.out.println(funcionario);
	}

}
