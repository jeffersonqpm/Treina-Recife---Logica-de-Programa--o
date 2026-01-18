
/*  A  empresa  Treina  Recife  remunera  seus  professores  por  hora,  logo  precisa 
 que  você  escreva  um  programa  que  receba  do  teclado    a  quantidade  de 
 horas  trabalhadas  por  um  professor  no  mês  e    o  valor  da  hora  trabalhada. 
 Calcular e exibir na tela o valor que o professor  irá receber naquele mês. */
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Horas trabalhadas no mês: ");
        int horas = scan.nextInt();

        System.out.print("Valor da hora trabalhada: ");
        double valor = scan.nextDouble();        

        System.out.println("Valor: R$ " + (valor * horas));

        scan.close();

    }

}
