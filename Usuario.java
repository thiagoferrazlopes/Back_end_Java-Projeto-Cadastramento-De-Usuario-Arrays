package Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	
	/*PROJETO DE CADASTRAMENTO USUÁRIO
	 * Incluir usuário
	 * Lista de usuário
	 * Saida de usuário
	 * Excluir
	 * Sair
	 * */
	
	public static void main(String[] args) {
		
        Scanner leitor = new Scanner(System.in);
        
        String[] nome = new String[20];
        String[] idade = new String[20];
        
        for(int i =0; i<20; i++) {
        	nome[i] = "";
        	idade[i] = "";
        }
        String opcao = "";
        String continuar = "" ;
        int posicao = 0;
        String nomeExcluir= "";
        int idade0 = 60;
       
        do {
  
        	System.out.println("USUÁRIOS ");
        	System.out.println("[1]- Incluir usuário " );
        	System.out.println("[2]- Lista de usuário");
        	System.out.println("[3]- Saida de usuário");
        	System.out.println("[4]- Excluir");
        	System.out.println("[5]- Sair");
        	System.out.print("DIGITE UMA OPÇAÕ:" );
            opcao = leitor.nextLine();
        	
             switch (opcao) {
             case "1" :
            	 do {
                System.out.print("\n"+"CADASTRAR USUÁRIO ");
            	
                    System.out.print("\n"+"Digite nome: ");
            		nome[posicao] = leitor.nextLine();
            		
            		System.out.print("Digite idade: ");
            		idade[posicao] = leitor.nextLine();
            		 System.out.println("Deseja continuar o cadastramento?");
            		    continuar = leitor.nextLine();
            		    posicao++;
            	
            	 }while(continuar.equals("Sim"));
            	 break;
            	 
             case "2":
            	 
            	 for(int i =0; i <20; i++) {
            		 if(! nome[i].equals("")) {
            		    System.out.println("Lista De Usário");
                  		
            			 System.out.println("Nome: " + nome[i] + " - " +"Idade: " +  idade[i] + " anos"    );
            		 }
            	 }
            	
            	 break;
      
             case"4":
            	 System.out.println("Quem deseja excluir Digite nome?");
            	 nomeExcluir = leitor.nextLine();
            	 for(int i =0; i <20; i++) {
            		 if(nome[i].equals(nomeExcluir)){
            			 nome[i] = "";
            			 idade[i] = "";
            		 }
            	 }
            	 break;
            
             case "5":
            	 System.out.println("Programa Finalizado");
            	 return;
            
             default:
            	 System.out.println("Opção Ivalida! Tente novamente");
            	 break;
        	}

        }while(! opcao.equals("5"));
	}
}


