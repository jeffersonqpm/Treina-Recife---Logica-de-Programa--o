/* A Treina Recife decorrente dos recentes aumentos de custos operacionais irá 
promover um aumento de 7.5% nos seus cursos de curta duração. Portanto, 
elabore  um  programa  para  receber  via  teclado  o  nome  do  curso  e  o  valor atual em reais praticado. Ao final calcule e exiba o nome do curso  e o novo valor com o aumento. 
Para calcular o valor reajustado utilize esta expressão: */

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do curso: ");
        String nomeCurso = scan.nextLine();
        
        System.out.print("Digite o valor do curso: ");
        double valorCurso = scan.nextDouble();

        double resultado = valorCurso + (valorCurso * 7.5 / 100);

        System.out.printf("Valor reajustado  do curso de " + nomeCurso + " é R$ %.2f%n", resultado);

        //System.out.printf("Nome: %s\nIdade: %d\nPreço: %.2f", nome, idade, preco);

        scan.close();

    }

}
