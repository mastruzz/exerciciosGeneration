package exercicios;

public class ex1 {

		private String primeiroNome;
		private String idade;
		private String altura;
		
	
	public ex1(String Nome,String idades, String alturas) {
		primeiroNome = Nome;
		idade = idades;
		altura = alturas;
		
		
	}
	
	public String getDados() {
		String nomeCompleto = primeiroNome+" "+ idade+" "+altura;
		return nomeCompleto;
				
	}
	
}
