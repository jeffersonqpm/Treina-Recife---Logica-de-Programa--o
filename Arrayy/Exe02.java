/*Soma de Elementos Crie um array de números inteiros com 4 valores. Usando um laço de
repetição (for ou for-each), calcule a soma de todos os elementos e imprima o resultado. */

public class Exe02 {

    public static void main(String[] args) {

        int[] numeros = { 10, 20, 30, 40 };
        int soma = 0;

        for(int temp : numeros){

            soma += temp;

        }

        System.out.println("soma: " + soma);
        System.out.println("Media: " + (soma / numeros.length));
    }

}
