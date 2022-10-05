import java.util.ArrayList;

public class collections_arrayList {

        public static void main(String[] args) {
            System.out.println("Llamada a función");
            //Revisar porque está mal
            //collections_clase1.clase1.funcion1();

            ArrayList<String> color = new ArrayList<>();
            color.add("rojo");
            color.add("verde");
            color.add("azul");
            color.add("blanco");
            color.add("blanco");
            color.add("blanco");
            System.out.println(color);

            ArrayList<String> color2 = new ArrayList<>();
            color2.add("blanco");
            color.removeAll(color2);

            System.out.println(color);


        }
    }
