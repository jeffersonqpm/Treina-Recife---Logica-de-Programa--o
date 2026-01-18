/*Faça um programa que leia dois números inteiros e calcule a soma, a 
subtração, a divisão e a multiplicação entre eles. Ao final exiba os valores 
conforme mostra o quadro abaixo.*/

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2;

        System.out.print("Digite o primeiro número: ");
        n1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = scan.nextInt();

        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        System.out.println(n1 + " ÷ " + n2 + " = " + (n1 / n2));
        System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));

        scan.close();

    }

}