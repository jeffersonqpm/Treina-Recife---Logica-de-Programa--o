import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");

        if (scan.hasNextInt() || scan.hasNextDouble()) {

            if(scan.hasNextInt()){

                int valor = scan.nextInt();
                //int valor = scan.nextInt();
            System.out.println("Digitou um numero inteiro: " + valor);

            }else if(scan.hasNextDouble()){
                       Double valor = scan.nextDouble();
                //int valor = scan.nextInt();
            System.out.println("Digitou um numero double: " + valor);

            }



        } else if (scan.hasNext()) {
            System.out.println("Digitou uma string");

        }

        scan.close();
    }

}
