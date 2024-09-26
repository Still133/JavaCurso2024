package cursoJava2024;
public class If {
	public static void main(String[] args) {
		//Conhecendo o condicional IF:
		int idade = 20;
		//Verificando o valor:
		
		if(idade > 20) {
			System.out.print("A idade é maior que 20!");
		}	else if (idade < 20 ) {
			System.out.println("Idade menor que 20!");
		} else {
			System.out.println("Idade igual a 20");
		}
	}
}