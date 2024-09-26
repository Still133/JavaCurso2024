package javaCurso;

import java.util.Scanner;

public class HorasdoDia {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual a hora do dia que vc Mais gosta (0 ate 23): ");
		int hora = entrada.nextInt();

		if (hora >= 6 && hora <= 12) {

			hora = 1;
		} else if (hora >= 12 && hora <= 17) {
			hora = 2;
		} else if (hora >= 18 && hora <= 23) {
			hora = 3;
		} else if ( hora >= 0 && hora <= 5){
			hora = 4;
		}else {
			

			
			
		}

		switch (hora) {

		case 1:
			System.out.println("Bom dia");
			break;
		case 2:
			System.out.println("Boa tarde");
			break;
		case 3:
			System.out.println("Boa noite");
			break;
		case 4:
			System.out.println("madrugadas");
			break;
			default:
				System.out.println("error");
				
				
		}
		

	}

}