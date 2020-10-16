package exercicio3;

public class ex3 {
	
	String nome;
	String modelo;
	String numSerie;
	
	
	public ex3(String nomes, String modelos, String numSeries) {
		
		nome = nomes;
		modelo = modelos;
		numSerie = numSeries;
		
	}
	public String getDados() {
		String produtoEletronico = nome+"\n" + modelo +"\n"+ numSerie;
		return produtoEletronico;
	}

}
