package entities;

public class funcionarioTeceirizado {
	public class funcionario {
		public static final double SALARIO_MINIMO = 1212.00;
		public static final int HORAS_MAXIMO = 40;
		public static final double VALORHORA_MAXIMO = 121.20;
		public static final double VALORHORA_MINIMO = 48.48;
		public static final double DESPESAS_ADICIONAIS_MAXIMA = 1000;
		private String nome;
		private int horasTrabalhadas;
		private double valorHora;
		private double despesasAdicionais;
		private double salario;
		
		public void funcionarioTerceirizado(String nome, int horasTrabalhadas, double valorHora, double despesasAdicionais) {
			if (horasTrabalhadas >= HORAS_MAXIMO) {
				throw new IllegalArgumentException("O número de horas trabalhadas deverá ser menor ou igual à 40");
			}
			if (valorHora < VALORHORA_MINIMO || valorHora > VALORHORA_MAXIMO) {
				throw new IllegalArgumentException("O valor da hora deverá ser igual ou superior à 48,48 e menor ou igual à 121,20");			
			}
			if (despesasAdicionais > DESPESAS_ADICIONAIS_MAXIMA) {
				throw new IllegalArgumentException("O valor das despesas adicionais não poderão exceder R$1.000,00");
			}
			
			this.nome = nome;
			this.horasTrabalhadas = horasTrabalhadas;
			this.valorHora = valorHora;
			this.despesasAdicionais = despesasAdicionais;
			this.salario = getSalario();
			if (salario < SALARIO_MINIMO){
				throw new IllegalArgumentException("O valor do salario minimo não poderá ser inferior à R$1.212,00");			
			}
		}


		public void setHorasTrabalhadas (int horasTrabalhadas) {
			if (horasTrabalhadas > 40) {
				throw new IllegalArgumentException("O número de horas trabalhadas por funcionários próprios deve ser menos ou igual à 40");
			}
			this.horasTrabalhadas = horasTrabalhadas;
		}
		
		public void funcionarioTerceirizado(String nome, int horasTrabalhadas, double valorHora, double despesasAdicionais, double salario) {
			this.nome = nome;
			this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
			this.valorHora = validaValorHorasTrabalhadas(valorHora);
			this.despesasAdicionais = validaDespesasAdicionais(despesasAdicionais);
		}
		
			
		public int validaHorasTrabalhadas(int horasTrabalhadas){
			if (horasTrabalhadas > HORAS_MAXIMO) {
				throw new IllegalArgumentException("O número de horas trabalhadas por funcionários próprios deve ser menor ou igual à 40");
			}
			return horasTrabalhadas;
		}
		
		public double validaValorHorasTrabalhadas(double valorHora){
			if (valorHora < VALORHORA_MINIMO || valorHora > VALORHORA_MAXIMO) {
				throw new IllegalArgumentException("O da hora tem que ser entre R$48,48 e R$121,20");
			}
			return valorHora;
		}
		
		
		public double validaDespesasAdicionais(double despesasAdicionais){
			if (despesasAdicionais > DESPESAS_ADICIONAIS_MAXIMA) {
				throw new IllegalArgumentException("As despesas adicionais nãopoderão eceder R$1000.00");
			}
			return despesasAdicionais;
		}
		
		
		public double validaSalario(double salario){
			if (salario < SALARIO_MINIMO) {
				throw new IllegalArgumentException("Salário invalido, pois o salário deverá ser igual ou superior à R$1212.00");
			}
			return salario;
		}
		
		
		public void setValidaHorasTrabalhadas(int horasTrabalhadas){
			
			this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
		}
		
		
		public void setValidaDepesasAdicionais(double despesasAdicionais){
			
			this.despesasAdicionais = validaDespesasAdicionais(despesasAdicionais);
		}
		

		
		public String getNome() {
			return this.nome;
		}



		public int getHorasTrabalhadas() {
			return this.horasTrabalhadas;
		}




		public double getValorHora() {
			return this.valorHora;
		}
		
		public double getDespesasAdicionais() {
			return this.despesasAdicionais;
		}



		public double getSalario() {
			salario = valorHora * horasTrabalhadas*4;
			return salario;
		}




		public boolean salarioEsperado(){
			return (salario >= SALARIO_MINIMO ? true : false);
		}
	}

}
