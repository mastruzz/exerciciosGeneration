package exercicio1;

public class vendedor extends pessoa {
	
	double valorVendas;
	
	public vendedor (String nome, int idade, String cpf, double valorVendas) {
		super(nome,idade,cpf);
		this.valorVendas = valorVendas;
		
		
		
	}
	public String getVendas() {
		String vendas =  getNome() +"\n"+getCpf()+"\n"+getIdade()+ "valor de vendas igual a: "+valorVendas;
		return vendas;
		
	}
}
