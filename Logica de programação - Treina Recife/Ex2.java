/*
EX02 - Cálculo da Média Aritmética de Duas Notas 
Faça um programa que receba do teclado dois valores do tipo real 
denominados  nota1  e  nota2,  estes  correspondem  as  notas  que  um  aluno 
obteve  no  curso  de  lógica  da  Treina  Recife.  Após  o  recebimento  calcule  e 
exiba  na  tela  a  a mensagem “A média Calculada foi:” acrescido da média 
aritmética calculada das notas recebidas. 
*/

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a 1º nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Digite a 2ª nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A média Calculada foi: " + media);

        scan.close();

    }

}
