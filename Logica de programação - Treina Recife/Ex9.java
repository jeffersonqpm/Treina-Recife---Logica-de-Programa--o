/*
Sabe-se  que  o  quilowatt  de  energia  custa  um  milésimo  do  salário-mínimo. 
Elabore um programa que receba via  teclado o valor  do  salário-mínimo e a 
quantidade de quilowatt consumido por uma residência. Calcule e exiba: 
• O valor em reais , de cada quilowatt; 
• O valor da conta,  em reais , a ser pago por essa residência; 
• O valor da conta com desconto de 15 % 
*/

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double desconto = 15;

        System.out.print("Informe o salário minímo: ");
        double salario_minimo = scan.nextDouble();

        double milesimoDoSalario = salario_minimo;

        System.out.print("Consumo em Quilowatt: ");
        int quilowatt = scan.nextInt();

        double valorApagar = milesimoDoSalario * quilowatt;
        double valorDesconto = valorApagar - (valorApagar * desconto) / 100;

        System.out.println("Valor Kw: R$ " + (milesimoDoSalario/1000));
        System.out.printf("Valor da conta R$ " + (float) valorApagar);
        System.out.printf("\n"+"Valor com desconto R$ %.2f%n" , valorDesconto);

        scan.close();

    }

}
