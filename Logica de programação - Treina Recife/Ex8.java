/*Em um determinado concurso público são informados via teclado as 
quantidades  de  candidatos  presentes  do  que  são  do  sexo  masculino  e  do 
sexo feminino, bem como o total dos ausentes. Pede-se calcular e exibir os 
percentuais solicitados abaixo: 
P1 = O Percentual  de Homens presentes em relação ao total de candidatos 
inscritos; 
P2 = O Percentual dos Ausentes  em relação ao total dos presentes 
Para calcular o percentual entre duas grandezas devemos utilizar a seguinte 
expressão:

percentual = parte*100 / todo
onde: parte = grandeza_menor; Todo: Grandeza_maior
*/

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantidade de Homens: ");
        int quant_homens = scan.nextInt();

        System.out.print("Quantidade de Mulheres: ");
        int quant_mulheres = scan.nextInt();

        System.out.print("Quantidade de Ausentes: ");
        int quant_ausentes = scan.nextInt();

        int totalCandidatos = quant_mulheres + quant_homens;

        System.out.println("Total: " + totalCandidatos + " candidatos");

        System.out.println("P1: " + (quant_mulheres * 100) / totalCandidatos + "%");
       // System.out.println("P1: " + (double)(quant_mulheres * 100) / totalCandidatos + "%");
        //System.out.printf("P2: %.2f%n", (double) (quant_ausentes * 100) / totalCandidatos);
        System.out.println("P2: " +  (quant_ausentes * 100) / totalCandidatos + "%");

        // System.out.println("P1: " + (quant_homens)*100/totalCandidatos);

        scan.close();

    }

}
