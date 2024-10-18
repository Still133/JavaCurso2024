package cursoJava2024;

import java.util.Arrays;
import java.util.List;

public class FiltrarValores {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7,8,9,10);

		// Filtrando apenas os numeros pares:
		
		//exibindo numeros pares:
		System.out.println("Numeros pares:");
		numeros.stream()
		.distinct()
		.filter(n -> n %  2 == 0)
		.forEach(System.out::println); 
		
		//exibindo numeros impares
		System.out.println("\nNumeros impares:");
		numeros.stream()
		.distinct()
		.filter(n -> n % 2 != 0)
		.forEach(System.out::println);
	
	
	}
	

}
