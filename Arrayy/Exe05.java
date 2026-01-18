/*Contagem de Ocorrências Dado o array String[] nomes = {"João", "Maria", "João", "Ana",
"João"};, conte quantas vezes o nome "João" aparece no array e imprima o total. */

public class Exe05 {

    public static void main(String[] args) {

        String[] nomes = { "João", "Maria", "João", "Ana", "João" };

        // contar quantas vezes a nota 7 aparece

        int contador = 0;

        for (String temp : nomes) {
            if (temp == "João") {
                contador++;

            }

        }
        System.out.println("O nome  João repete: " + contador);
    }

}
