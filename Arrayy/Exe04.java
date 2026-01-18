/*Encontrar o Maior Valor Dado o array int[] numeros = {15, 8, 25, 3, 42};, percorra-o e
encontre o maior valor. Imprima o resultado no console. */

public class Exe04 {

    public static void main(String[] args) {

        int[] numeros = { 15, 8, 25, 3, 42 };
        int maiorNumero = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            int valorAtual = numeros[i];
            if (valorAtual > maiorNumero) {
                maiorNumero = valorAtual;

            }

        }
        System.out.println("O maior valor é: " + maiorNumero);

    }

}
