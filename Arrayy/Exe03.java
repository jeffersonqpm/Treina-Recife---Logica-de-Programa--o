/*Cálculo da Média Crie um array de números decimais (double) com 3 notas. Calcule e imprima
a média dessas notas. Imprima o resultado formatado com duas casas decimais. */

public class Exe03 {

    public static void main(String[] args) {

        Double[] notas = { 6.8,7.5,9.0};
        Double soma = 0.0;
        double media = 0.0;

        for (Double temp : notas) {

            //soma = soma + temp;
            media = soma+=temp / notas.length;
            

        }

        System.out.printf("Média: %.2f" , media);
    }

}
