package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    dadosPessoas();
    
  }

  public static void dadosPessoas(){
    Scanner sc = new Scanner(System.in);
    Estoque produtos;
    List<Estoque> listaProdutos = new ArrayList<Estoque>();
    int opcao = 0;

    do {
    	  System.out.println("------- Escolha uma opção abaixo --------");
    	  System.out.println("1 - Cadastra produtos");
          System.out.println("2 - Imprime produtos cadastrados");
          System.out.println("0 - Sair do programa");
          System.out.println("____________________X____________________");

          System.out.print("Digite sua opção: ");
          opcao = Integer.parseInt(sc.nextLine());

          if(opcao == 1){
      //Cria um novo objeto
              produtos = new Estoque();

          System.out.print("Digite o nome: ");
          produtos.setNome(sc.nextLine());
          System.out.println("Digite a quantidade: ");
          produtos.setQuantidade(Integer.parseInt(sc.nextLine()));

          

          System.out.println();

      //Guarda o objeto pessoa em uma lista.
          listaProdutos.add(produtos);
          }else if(opcao == 2){
        	  
            if(listaProdutos.isEmpty()){
              System.out.println("Não existem pessoas cadastradas, pressione uma tecla para continuar!");
              sc.nextLine();
              
            }else{
              System.out.println(listaProdutos.toString());

              System.out.println("Pressione uma tecla para continuar.");
              sc.nextLine();
              
            }
          }else if(opcao == 3) {
        	  
        	  System.out.println("Digite o numero do produto que deseja remover");
        	  listaProdutos.remove(listaProdutos);
        	  System.out.println("Aperte qualquer botão");
        	  sc.nextLine();
        	  
          }else {
        	  System.out.println("Digite um numero válido!");
        	  System.out.println("Pressione uma tecla para continuar.");
              sc.nextLine();
              
          }
          
          
    } while (opcao != 0);

    sc.close();
  }
}
