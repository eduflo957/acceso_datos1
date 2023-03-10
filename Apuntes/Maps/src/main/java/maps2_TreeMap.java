import java.util.TreeMap;

public class maps2_TreeMap {
    public static void main(String[] args) {
        //El TreeMap te lo ordena
        TreeMap<Integer, String> prueba = new TreeMap<>();
        prueba.put(1, "Edu");
        prueba.put(4, "Antonio");
        prueba.put(3, "Paco");
        prueba.put(2, "Pipe");

        System.out.println(prueba);
    }
}
