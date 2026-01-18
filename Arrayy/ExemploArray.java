import java.util.ArrayList;

public class ExemploArray {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Jeff");
        nomes.add("Carla");
        nomes.add("João");
        nomes.remove(1);
        //nomes.set(3,"Queiroz");

        System.out.println(nomes.size());
        System.out.println(nomes.get(2));
        System.out.println(nomes);

    }

}
