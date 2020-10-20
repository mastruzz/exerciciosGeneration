package menu;

public class Estoque {

	  
	  private String nome;
	  private int quantidade;
	  

	  public String getNome() {
	    return nome;
	  }

	  public void setNome(String nome) {
	    this.nome = nome;
	  }

	  

	  @Override
	  public String toString() {
	    return "Produto: "+nome+" - Quantidade: " +quantidade+"\n";
	            
	  }

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	}
