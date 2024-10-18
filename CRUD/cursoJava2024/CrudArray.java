package cursoJava2024;

import java.util.Scanner;

public class CrudArray {

	// Arrays para armazenar nomes e idades:
	static String[] nomes = new String[10];
	static int[] idades = new int[10];
	static int contador = 0;

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int opcao;
			
			do {
				System.out.println("\n--- MENU ---");
				System.out.println("1. Adicionar Usuário");
				System.out.println("2. Exibir Usuarios");
				System.out.println("3. Atualizar Usuário");
				System.out.println("4. Deletar Usuário");
				System.out.println("5. sair");
				System.out.println("Escolha uma opção: ");
				opcao = scanner.nextInt();
				
				switch(opcao) {
				case 1:
					adicionarUsuario(scanner);
						break;
				case 2:
					exibirUsuario();
					break;
				case 3:
					atualizarUsuario(scanner);
					break;
				case 4:
					adicionarUsuario(scanner);
					break;
				case 5:
					System.out.println("Saindo do Sistema...!");
					break;
				default:
					System.out.println("Opção inválida!");
					}
				} 
				while (opcao != 5);
				scanner.close();
			}
			
			private static void atualizarUsuario(Scanner scanner) {
		
	}

			//Criar todos os métodos:
			//Adicionar usuario:
			public static void adicionarUsuario(Scanner scanner) {
			if ( contador < nomes.length ) {
				//Pegando o nome do usuário:
				System.out.println("Digite o nome: ");
				String nome = scanner.next();
				//Pegando a idade do usuario:
				System.out.println("Digite a idade: ");
				int idade = scanner.nextInt();
				//adicionando as variáveis dentro dos arrays:
				nomes[contador] = nome;
				idades[contador] = idade;
				contador++;
				System.out.println("Usuário adicionado com sucesso!");
			} else {
				System.out.println("Limite de usuário atingido!");
			}	
			
			}
			// Exibir usuarios:
			public static void exibirUsuario() {
				if (contador == 0) {
					System.out.println("Nenhum usuarios cadastrado! 1");
				} else {
					for (int i = 0; i < contador; i++) {
						System.out.println((i + 1 )+ ". Nome:"+ nomes[i]+", Idade:" + idades[i]);
						
					}
				}
			}
		//Atualizar Usuario:
			public static void atualizarUsuario1( Scanner scanner) {
				System.out.println("Digite o número do usuario a ser atualizado:");
				int index = scanner.nextInt() - 1;
				
				if (index >= 0 && index < contador ) {
					
					System.out.println("Digite um novo nome:");
					String nome = scanner.next();
					System.out.println("Digite a nova idade:");
					int idade = scanner.nextInt();
		      //Jogando nome e idade novos dentro do array:
						nomes[index] = nome;
					    idades[index] = idade;
					    System.out.println("Usuario atualizando com sucesso!");
				} else {
					System.out.println("Usuario não encontrado!");
				}
			}
			//Deletar: 
			public static void deletarUsuario(Scanner scanner) {
				System.out.println("Digite o número do usuário a ser deletado:");
				int index = scanner.nextInt() -1;
				if (index >= 0 && index < contador ) {
					for (int i = index; i < contador -1; i++) {
						nomes[i] = nomes[i+1];
						idades[i] = idades [i+1];
					}
					nomes[contador -1] = null;
					idades[contador -1] = 0;
					System.out.println("Usuario deletado com sucesso!");
				} else {
					System.out.println("Usuario não localizado!");
				}
			}

}