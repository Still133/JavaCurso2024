package cursoJava2024;

public class CopadoMundo {

    public static void main(String[] args) {
        // Estrutura básica do programa
        // Declarar a variável ano e inicializar com 1930
        for (int ano = 1930; ano <= 2024; ano += 4) {
            // Considerar os anos 1942 e 1946 que não tiveram copa
            if (ano == 1942 || ano == 1946) {
                continue; // Pula os anos em que não houve copa
            }
            // Imprime o ano da copa do mundo
            System.out.println("Copa do Mundo: " + ano);
        }
    }
}
