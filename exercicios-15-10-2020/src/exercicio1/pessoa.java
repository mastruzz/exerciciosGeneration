package exercicio1;

	public class pessoa {
		
	private String nome;
	private int idade;
	private String cpf;
	
	
	
	public pessoa(String nome, int idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		
		
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDados() {
		String dadospessoais = getNome() +"\n"+getCpf()+"\n"+getIdade();
		return dadospessoais;
	}
	
	
	
}
