package exercicio5;

public class ex5 {
	String nome;
	String cor;
	String material;
	String pneu;
	
	public ex5(String nomes, String cores, String materials, String pneus) {
		nome = nomes;
		cor = cores;
		material = materials;
		pneu = pneus;
		
	}
	public String getDados() {
		String patinete = nome +"\n"+cor+"\n"+material+"\n"+pneu;
		return patinete;	
	}
}
