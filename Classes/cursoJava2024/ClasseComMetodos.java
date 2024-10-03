package cursoJava2024;

import java.util.Scanner;

public class ClasseComMetodos {

	// metodo 1: Calcula a soma de 2 numeros:
	public static int soma(int a, int b) {
		return a + b;
	}

	// metodo o2: Verificar se 1 numero é par:
	public boolean ehpar(int numero) {
		return numero % 2 ==0;
	}
		//Metodo 03: inverter String
		public String inverteString(String texto) {
			return new StringBuilder(texto).reverse().toString();
		}
		
		//Metodo 04: calcula o fatorial de um numero:
		public int fatorial(int numero) { 
			if ( numero == 0 || numero ==1) {
				return 1;
			}
		return numero * fatorial(numero -1) ;
		}
		
		
	
	public static void main(String[] args) {
		// Instanciando a classe:
		ClasseComMetodos utilidades = new ClasseComMetodos();
		// chamando os metodos
		//System.out.println(" A soma de 123 e 69 é: " + soma(123, 69));
		//System.out.println("O numero 17 é par?: " + utilidades.ehpar(17));
	
	//System.out.println(" 'joao vitor santos abreu'"
			//+ " invertida fica: " + utilidades.inverteString("joao vitor santos abreu"));
	System.out.println("Fatorial de 5 é:  "+ utilidades.fatorial(5));

	}
	
}


