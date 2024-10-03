package cursoJava2024;

public class ArraySimples {

	public static void main(String[] args) {
// Criando um Array de supermercado(lista de compras):
		String[] mercado = {"Arroz", "Açucar", "Danonão Grosso","Café","Leite"};
		
		//Exibindo apenas o terceiro item da lista:
		//System.out.println("Item selecionado:" + mercado[2]); //DanonãoGrosso!
				//Todo Array começa com "0"

		//Exibindo Todos os items do array:
		//Lendo a linha "item < mercado.length": 
		//Enquanto item for menor dop que o comprimento de itens do array,faça algo!
		
		for (int item = 0; item < mercado.length; item++) {
			System.out.println(mercado[item]);
		}
	
	}

}

