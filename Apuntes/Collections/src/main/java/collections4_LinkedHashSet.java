import java.util.LinkedHashSet;

public class collections4_LinkedHashSet {
    public static void main(String[] args) {

        //Los elementos se insertan en el orden que se meten.
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("Prueba1");
        lhs.add("Prueba2");
        lhs.add("Prueba3");
        lhs.add("Prueba4");
        //Para buscar el primero:
        System.out.println(lhs.stream().findFirst());
    }
}