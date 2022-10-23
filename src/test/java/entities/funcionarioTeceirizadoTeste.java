package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class funcionarioTeceirizadoTeste {
	
	@Test
	public void testarFuncionarioTerceirizadoComPagamentoInvalido(){
		//cenário de teste
		String nomeValido = "Rogerio";
		int horasTrabalhadasValidas = 4;
		double valorHoraValido = 48.8;
		double despesasAdicionaisValidas = 900;
		boolean salarioEsperado = true;
		funcionarioTerceirizado t;
		
		//execução
		t = new funcionarioTerceirizado(nomeValido, horasTrabalhadasValidas, valorHoraValido, despesasAdicionaisValidas);
		String nomeObtido = t.getNome();
		int horasTrabalhadasObtidas = t.getHorasTrabalhadas();
		double valorHoraObtido = t.getValorHora();
		double depesasAdicionaisObtidas = t.getDespesasAdicionais();
		boolean pagamentoObtido = t.salarioEsperado();

		//comparação
		Assertions.assertEquals(nomeValido, nomeObtido);
		Assertions.assertEquals(nomeValido, horasTrabalhadasObtidas);
		Assertions.assertEquals(valorHoraValido, valorHoraObtido);
		Assertions.assertEquals(despesasAdicionaisValidas, depesasAdicionaisObtidas);
		Assertions.assertEquals(pagamentoObtido, salarioEsperado);
	}
	
	
	@Test
	public void testarConstutorEntradaValorHoraInvalidoAcima(){
		//cenário de teste
		String nomeValido = "Rogerio";
		int horasTrabalhadasInvalidaAcima = 42;
		double valorHoraValido = 48.8;
		double despesasAdicionaisValidas = 900;
		boolean salarioEsperado = true;
		funcionarioTerceirizado t;
		
		//execução
		t = new funcionarioTerceirizado(nomeValido, horasTrabalhadasInvalidaAcima, valorHoraValido, despesasAdicionaisValidas);
		String nomeObtido = t.getNome();
		int horasTrabalhadasObtidas = t.getHorasTrabalhadas();
		double valorHoraObtido = t.getValorHora();
		double depesasAdicionaisObtidas = t.getDespesasAdicionais();
		boolean pagamentoObtido = t.salarioEsperado();

		//comparação
		Assertions.assertEquals(nomeValido, nomeObtido);
		Assertions.assertEquals(nomeValido, horasTrabalhadasObtidas);
		Assertions.assertEquals(valorHoraValido, valorHoraObtido);
		Assertions.assertEquals(despesasAdicionaisValidas, depesasAdicionaisObtidas);
		Assertions.assertEquals(pagamentoObtido, salarioEsperado);
	}
	
	@Test
	public void testarConstutorEntradaValorHoraInvalidoAbaixo(){
		//cenário de teste
		String nomeValido = "Rogerio";
		int horasTrabalhadasValidas = 40;
		double valorHoraInvalido = 35;
		double despesasAdicionaisValidas = 900;
		boolean salarioEsperado = true;
		funcionarioTerceirizado t;
	
		//execução
		f = new funcionarioTerceirizado(nomeValido, horasTrabalhadasValidas, valorHoraInvalido, despesasAdicionaisValida);
		String nomeObtido = t.getNome();
		int horasTrabalhadasObtidas = t.getHorasTrabalhadas();
		double valorHoraObtido = t.getValorHora();
		double despesasAdicionaisObtidas = t.getDespesasAdicionais();
		boolean pagamentoObtido1 = t.salarioEsperado();

		//comparação
		Assertions.assertEquals(nomeValido, nomeObtido);
		Assertions.assertEquals(horasTrabalhadasValidas, horasTrabalhadasObtidas);
		Assertions.assertEquals(valorHoraInvalido, valorHoraObtido);
		Assertions.assertEquals(despesasAdicionaisValidas, valorHoraObtido);
		Assertions.assertEquals(salarioEsperado, pagamentoObtido1);
		}
	
	@Test
	public void testarConstutorDepesasAdicionaisInvalido(){
		//cenário de teste
		String nomeValido = "Rogerio";
		int horasTrabalhadasValidas = 40;
		double valorHoraInvalido = 60;
		double despesasAdicionaisValidas = 1001;
		boolean salarioEsperado = true;
		funcionarioTerceirizado t;
	
		//execução
		f = new funcionarioTerceirizado(nomeValido, horasTrabalhadasValidas, valorHoraInvalido, despesasAdicionaisValida);
		String nomeObtido = t.getNome();
		int horasTrabalhadasObtidas = t.getHorasTrabalhadas();
		double valorHoraObtido = t.getValorHora();
		double despesasAdicionaisObtidas = t.getDespesasAdicionais();
		boolean pagamentoObtido = t.salarioEsperado();

		//comparação
		Assertions.assertEquals(nomeValido, nomeObtido);
		Assertions.assertEquals(horasTrabalhadasValidas, horasTrabalhadasObtidas);
		Assertions.assertEquals(valorHoraInvalido, valorHoraObtido);
		Assertions.assertEquals(despesasAdicionaisValidas, valorHoraObtido);
		Assertions.assertEquals(salarioEsperado, pagamentoObtido);
		}
			

}
