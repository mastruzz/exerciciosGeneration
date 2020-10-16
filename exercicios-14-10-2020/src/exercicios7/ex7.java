package exercicios7;

public class ex7 {
	
	String nome;
	String ocorrencia;
	
	
	public ex7(String nomes, String ocorrencias) {
		ocorrencia = ocorrencias;
		nome = nomes;
		
	
	}
	public String getDados() {
		String paciente = nome +"\n"+ocorrencia;
		return paciente;
	}
	
	}
