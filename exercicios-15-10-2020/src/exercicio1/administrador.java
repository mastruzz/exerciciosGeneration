package exercicio1;

public class administrador extends pessoa {
	int ajudaDeCusto;	
	
	
	public administrador(String nome, int idade, String cpf, int ajudaDeCusto) {
		super(nome,idade,cpf);
		this.ajudaDeCusto = ajudaDeCusto;
		
				
	}
	public String getDadoCust() {
		String ajuda = getNome() +"\n"+getCpf()+"\n"+getIdade()+"\nAjuda de custo: "+getAjudaDeCusto();
		return ajuda;
	}





	public int getAjudaDeCusto() {
		return ajudaDeCusto;
	}





	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	
	
	
	
}
