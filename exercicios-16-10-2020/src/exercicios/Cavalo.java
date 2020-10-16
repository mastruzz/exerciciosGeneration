package exercicios;

public class Cavalo extends Animal {
	private boolean correr;
	
	
	/*public Cavalo(String nome, int idade, String som, boolean correr) {
		super(nome, idade, som);
		this.correr = correr;


	}*/


	public boolean isCorrer() {
		return correr;
		
	}


	public void setCorrer(final boolean correr) {
		this.correr = correr;
	}
	
	public String getCavalo() {
		String cavalo = super.getNome()+"\n"+ super.getIdade()+"\n"+ super.getSom()+"\nEsta correndo?: "+ isCorrer();
		return cavalo;
	}


}
