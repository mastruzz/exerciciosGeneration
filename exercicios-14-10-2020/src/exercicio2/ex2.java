package exercicio2;

public class ex2 {
	
	String modelo;
	String cor;
	String velocidade;
	
	
	public ex2(String modelos, String cores, String velocidades) {
		modelo = modelos;
		cor = cores;
		velocidade = velocidades;
		
		
	}
	
	public String getDados() {
		String aviao = modelo+"\n" + cor + "\n"+velocidade;
		return aviao;
	}
}
