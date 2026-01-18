public class ArrayList2 {

    public static void main(String[] args) {

        Double[] notas = { 8.5, 7.0, 9.2, 6.5, 7.0, 20.0 };

        // contar quantas vezes a nota 7 aparece

        int contadorSete = 0;

        for (double nota : notas) {
            if (nota == 7.0) {
                contadorSete++;

            }

        }

        System.out.println("A nota 7 aparece: " + contadorSete + " veze(s) na lista");

        // 2. encontar o indice da primeira ocorrencia da nota 9.2

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == 7.0) {

                System.out.println("O indice da primeira ocorrencia da nota 9.2 é: " + i);
                //break;

            }

        }
    }

}
