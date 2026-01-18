// import java.util.Scanner;

// public class ConsumoSimples {

//     public static void main(String[] args) {
//         // Cria um objeto Scanner para ler a entrada do usuário
//         Scanner scanner = new Scanner(System.in);

//         // --- Entrada de Dados ---

//         // Pede e lê a distância total percorrida (em Km)
//         System.out.print("Distância percorrida (Km): ");
//         double distancia = scanner.nextDouble();

//         // Pede e lê o total de combustível gasto (em litros)
//         System.out.print("Combustível gasto (litros): ");
//         double litros = scanner.nextDouble();

//         // Fecha o Scanner
//         scanner.close();

//         // --- Processamento (Cálculo) ---

//         // Verifica se os litros são maiores que zero para o cálculo
//         if (litros > 0) {
//             double consumoMedio = distancia / litros;

//             // --- Saída de Dados ---

//             // Formata o resultado para duas casas decimais
//             String resultado = String.format("%.2f", consumoMedio);

//             // Apresenta o valor do consumo médio, seguido da mensagem "km/l"
//             System.out.println("\nConsumo Médio: " + resultado + " km/l");
//         } else {
//             // Mensagem de erro simples
//             System.out.println("\nErro: A quantidade de combustível gasta deve ser maior que zero.");
//         }
//     }
// }

import java.text.DecimalFormat;

public class ExemploPorcentagem {

    public static void main(String[] args) {
        double valor = 0.7567; // Exemplo de valor decimal
        DecimalFormat df = new DecimalFormat("#.##%"); // Formato com 2 casas decimais
        
        // Para garantir 2 casas decimais (mesmo que sejam zero)
        // DecimalFormat df = new DecimalFormat("0.00%");

        String porcentagemFormatada = df.format(valor);
        System.out.println(porcentagemFormatada); // Saída: 75.67%
    }
}