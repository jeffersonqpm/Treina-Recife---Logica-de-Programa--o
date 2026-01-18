/*Faça um programa que receba do teclado o salário fixo de um vendedor em 
reais e o valor total de vendas efetuadas por ele  em um determinado mês. 
Sabendo  que  este  vendedor  ganha  15%  de  comissão  sobre  suas  vendas 
efetuadas no mês, calcular e exibir o valor total a receber no final do mês.  */

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Salario: ");
        float salarioAtual = scan.nextFloat();
        
        System.out.print("Valor das vendas: ");
        float vendas = scan.nextFloat();

       // valor/15*100
       float comissao = 15;

       float resultado = (vendas*comissao/100) + salarioAtual;

       System.out.printf("Valor total: %.2f%n" , resultado);

       scan.close();


    }
    
}

