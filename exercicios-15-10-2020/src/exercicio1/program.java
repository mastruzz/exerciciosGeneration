package exercicio1;

public class program {
	public static void main (String args[]) {
		pessoa pessoa1 = new pessoa("robert", 25, "08572-120");
		administrador adm1 = new administrador("carlos", 37, "509.903.988-03", 1250);
		vendedor vendedor1 = new vendedor("Ricardo", 24, "508.345.232-00", 68.000);
		
		System.out.println(pessoa1.getDados());
		System.out.println("---------------------------------------------------");
		System.out.println(adm1.getDadoCust());
		System.out.println("---------------------------------------------------");
		System.out.println(vendedor1.getVendas());
		
	}
}
