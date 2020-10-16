package exercicios;

public class Cachorro extends Animal{
	private boolean correr;
	
	/*public Cachorro( String nome, int idade, String som, boolean correr) {
		super(nome, idade, som);
		this.correr= correr;
		
	}*/

	public boolean isCorrer() {
		return correr; 
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}

	
	public String getCachorro() {
		String cachorro = getNome()+"\n"+ getIdade()+"\n"+ getSom()+"\nEsta correndo?: "+ isCorrer();
		return cachorro;
	}
	
	
	
}
