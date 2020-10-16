package exercicio4;

public class ex4 {
	
	String nome;
	String cadastro;
	String salario;
	
	
	public ex4 (String nomes, String cadastros, String salarios) {
		nome = nomes;
		cadastro = cadastros;
		salario = salarios;
		
	}
	public String getDados() {
		String funcionario = nome+"\n"+cadastro+"\n"+salario;
		return funcionario;
	}
}
