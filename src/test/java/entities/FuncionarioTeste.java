package entities;
 
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FuncionarioTeste {
	
	@Test
	public void testarFuncionarioComPagamentoInvalido(){
		//cenário de teste
		String nomeValido = "Rogerio";
		int horasTrabalhadasValidas = 4;
		double valorHoraValido = 48.8;
		boolean salarioEsperado = true;
		funcionario f;
		
		//execução			
		f = new funcionario(nomeValido, horasTrabalhadasValidas, valorHoraValido);
		String nomeObtido = f.getNome();
		int horasTrabalhadasObtidas = f.getHorasTrabalhadas();
		double valorHoraObtido = f.getValorHora();
		boolean pagamentoObtido = f.salarioEsperado();

		//comparação
		Assertions.assertEquals(nomeValido, nomeObtido);
		Assertions.assertEquals(nomeValido, horasTrabalhadasObtidas);
		Assertions.assertEquals(valorHoraValido, valorHoraObtido);
		Assertions.assertEquals(pagamentoObtido, salarioEsperado);
	}
	
	
	@Test
	public void testarConstutorEntradaValorHoraInvalidoAcima(){
		//cenário de teste
		String nomeValido = "Rogerio";
		int horasTrabalhadasInvalidasAcima = 41;
		double valorHoraValido = 48.8;
		boolean salarioEsperado = true;
		funcionario f;
		
		//execução
		f = new funcionario(nomeValido, horasTrabalhadasInvalidasAcima, valorHoraValido);
		String nomeObtido = f.getNome();
		int horasTrabalhadasObtidas = f.getHorasTrabalhadas();
		double valorHoraObtido = f.getValorHora();
		boolean pagamentoObtido = f.salarioEsperado();

		//comparação
		Assertions.assertEquals(nomeValido, nomeObtido);
		Assertions.assertEquals(nomeValido, horasTrabalhadasObtidas);
		Assertions.assertEquals(valorHoraValido, valorHoraObtido);
		Assertions.assertEquals(pagamentoObtido, salarioEsperado);
		}
	
	@Test
	public void testarConstutorEntradaValorHoraInvalidoAbaixo(){
		//cenário de teste
		String nomeValido = "Rogerio";
		int horasTrabalhadasValidas = 40;
		double valorHoraInvalido = 123;
		boolean resultadoEsperado = true;
		funcionario f;
		
		//execução
		f = new funcionario(nomeValido, horasTrabalhadasValidas, valorHoraInvalido);
		String nomeObtido = f.getNome();
		int horasTrabalhadasObtidas = f.getHorasTrabalhadas();
		double valorHoraObtido = f.getValorHora();
		boolean pagamentoObtido = f.salarioEsperado();

		//comparação
		Assertions.assertEquals(nomeValido, nomeObtido);
		Assertions.assertEquals(horasTrabalhadasValidas, horasTrabalhadasObtidas);
		Assertions.assertEquals(valorHoraInvalido, valorHoraObtido);
		Assertions.assertEquals(resultadoEsperado, pagamentoObtido);
		}
			

	@Test
	//cenário de teste
	public void testarConstutorValorHorasTrabalhadasInvalidasAbaixo(){
		String nomeValido = "Rogerio";
		int horasTrabalhadasInvalidas = 41;
		double valorHoraInvalido = 41;
		boolean resultadoEsperado = true;
		funcionario f;
			
		//execução
		f = new funcionario(nomeValido, horasTrabalhadasInvalidas, valorHoraInvalido);
		String nomeObtido = f.getNome();
		int horasTrabalhadasObtidas = f.getHorasTrabalhadas();
		double valorHoraObtido = f.getValorHora();
		boolean pagamentoObtido = f.salarioEsperado();

		//comparação
		Assertions.assertEquals(nomeValido, nomeObtido);
		Assertions.assertEquals(horasTrabalhadasInvalidas, horasTrabalhadasObtidas);
		Assertions.assertEquals(valorHoraInvalido, valorHoraObtido);
		Assertions.assertEquals(resultadoEsperado, pagamentoObtido);
	}
	

}

