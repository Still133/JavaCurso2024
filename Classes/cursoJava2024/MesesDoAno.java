package cursoJava2024;

public class MesesDoAno {

    public static void main(String[] args) {
        // Declaração da variável String para armazenar o nome do mês
        String mes = "Abril"; // Você pode alterar o mês aqui para testar

        // Utilização da estrutura switch para decidir quantos dias o mês tem
        switch (mes) {
            case "Janeiro":
                System.out.println("O mês escolhido tem 31 dias.");
                break;
            case "Fevereiro":
                System.out.println("O mês escolhido tem 28 ou 29 dias.");
                break;
            case "Março":
                System.out.println("O mês escolhido tem 31 dias.");
                break;
            case "Abril":
                System.out.println("O mês escolhido tem 30 dias.");
                break;
            case "Maio":
                System.out.println("O mês escolhido tem 31 dias.");
                break;
            case "Junho":
                System.out.println("O mês escolhido tem 30 dias.");
                break;
            case "Julho":
                System.out.println("O mês escolhido tem 31 dias.");
                break;
            case "Agosto":
                System.out.println("O mês escolhido tem 31 dias.");
                break;
            case "Setembro":
                System.out.println("O mês escolhido tem 30 dias.");
                break;
            case "Outubro":
                System.out.println("O mês escolhido tem 31 dias.");
                break;
            case "Novembro":
                System.out.println("O mês escolhido tem 30 dias.");
                break;
            case "Dezembro":
                System.out.println("O mês escolhido tem 31 dias.");
                break;
            default:
                System.out.println("Erro: Mês inexistente.");
                break;
        }
    }
}
