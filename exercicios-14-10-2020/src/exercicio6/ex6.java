package exercicio6;

public class ex6 {
	String numero ;
	String nome;
	int saldo;
	
	
	public ex6(String numeros, String nomes, int saldos) {
		numero = numeros;
		nome = nomes;
		saldo = saldos;
		
	}
	public String getDados() {
		String conta = nome +"\n"+numero+"\n"+saldo;
		return conta;
	}
}
