package exercicios;

public class Preguica extends Animal {
	

	public boolean subirArvore;
	
	/*public Preguica(String nome, int idade, String som, boolean subirArvore) {
		super(nome, idade, som);
		this.subirArvore = subirArvore;
		// TODO Auto-generated constructor stub
	}*/
	

	public boolean isSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	public String getPreguica() {
		String preguica = super.getNome()+"\n"+ super.getIdade()+"\n"+ super.getSom()+ "\nSubindo árvore?: "+this.isSubirArvore();
		return preguica;
		
 	}
}
