package cursoJava2024;

public class InstanciandoInterface {
	
	public static void main (String[] args) {
		
	
  Veiculo carro = new Carro2();
  Veiculo bike = new Bike1();
  
  //Usando o carro:
  carro.acelerar();
  carro.frear();
  
  //Usando a bike:
  bike.acelerar();
  bike.frear();
}
}