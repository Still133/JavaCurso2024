
	package cursoJava2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.list;
import java.util.Collections;
import java.util.List;
 public class Sorteando {
	 public static void main (String[] args) {
		 //Criando uma lista de nomes;
		 List<String> nomes = new ArrayList<>();

	 nomes.add("Timelo Rego");
     nomes.add("Jacinto leite");
	 nomes.add("Simas Turbo");
	 nomes.add("Power Guido");
     nomes.add("Tokoku Koshando");
	 nomes.add("Javí tchetcheca");
	 nomes.add("Tomas Calabreso");
	 nomes.add("Sujins Mundo");
	 nomes.add("Alma Sebosa ");
	 nomes.add("Lah elle");
	 
	 //ordenando	 a lista em ordem alfabetica
	 Collections.sort(nomes);
	 
	 //exbindo a lista ordenada
	 System.out.println("Nomes em ordem alfabetica:");
	 nomes.forEach(System.out::println);

	 
	 }
	 
	 
 }
 
 
