package cursoJava2024;
 import java.util.Random;
import java .util.Scanner;
public class GeradordeNumeroAleatorios {

	public static void main(String[] args) {
 Random random = new Random();
 System.out.println("Numeros aleatorios gerados:");
 
 // Gera 5 numeros aleatorios entre 1 e 100
 for (int i = 0; i < 5 ; i++) {
	 int NumeroAleatorio = random.nextInt(100) +1; //Gera um numero aleatorio de 1 a 100
	 System.out.println(NumeroAleatorio);
    }
 		
   }

}
