package cursoJava2024;

public class Cap8_Lab1 {

   // Método estático que retorna o maior número em um array
   public static int maiorNumero(int[] numeros) {
       // Verificar se o array está vazio
       if (numeros == null || numeros.length == 0) {
           throw new IllegalArgumentException("O array não pode estar vazio!");
       }

       // Inicializar a variável 'maior' com o primeiro elemento do array
       int maior = numeros[0];

       // Percorrer o array para encontrar o maior número
       for (int i = 1; i < numeros.length; i++) {
           if (numeros[i] > maior) {
               maior = numeros[i];
           }
       }

       // Retornar o maior número encontrado
       return maior;
   }

   public static void main(String[] args) {
       // Exemplo de uso do método maiorNumero
       int[] numeros = {3, 5, 7, 2, 21, 1};
       int maior = maiorNumero(numeros);
       System.out.println("O maior número é: " + maior);
   }
}