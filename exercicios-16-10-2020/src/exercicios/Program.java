package exercicios;

public class Program {
	public static void main(String ar[]) {
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("boi");
		cavalo.setIdade(12);
		cavalo.setSom("'relinchar'");
		cavalo.setCorrer(true);
		Preguica preguica = new Preguica();
		preguica.setNome("Monica");
		preguica.setIdade(8);
		preguica.setSom("'barulho de preguiça'");
		preguica.setSubirArvore(true);
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Jordão");
		cachorro.setIdade(3);
		cachorro.setSom("'Au-Au-Au-Au'");
		cachorro.setCorrer(false);
		
		System.out.println(cachorro.getCachorro());
		System.out.println("------------------------------------------");
		System.out.println(preguica.getPreguica());
		System.out.println("------------------------------------------");
		System.out.println(cavalo.getCavalo());
		System.out.println("------------------------------------------");
		cavalo.setNome("Boris");
		System.out.println(cavalo.getCavalo());
		
		
	}

}
