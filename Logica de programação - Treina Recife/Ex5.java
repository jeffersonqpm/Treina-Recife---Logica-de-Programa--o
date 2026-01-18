/*A  Treina  Recife  resolveu  dar  um  desconto  de  4.5%    em  todos  os  produtos comercializados em sua lojinha. Portanto, elabore um programa para receber via  teclado  o  nome  do  produto  e  o  valor  atual  em  reais.  Ao  final  calcule  e exiba o nome do produto e o novo valor com o desconto aplicado. Para calcular o valor com desconto utilize a expressão abaixo: */

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float desconto = 4.5f;

        System.out.print("Nome do produto: ");
        String nomeProduto = scan.nextLine();

        System.out.print("Valor tual: ");
        float valorAtual = scan.nextFloat();

        float resultado = valorAtual - (valorAtual * desconto / 100);

        System.out.printf("\n" + "Produto: " + nomeProduto + "\n" + "Valor com desconto: %.2f%n", resultado);

        scan.close();
    }

}
