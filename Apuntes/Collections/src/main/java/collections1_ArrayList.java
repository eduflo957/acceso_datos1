import java.util.ArrayList;
import java.util.Collections;

public class collections1_ArrayList {
        public static void main(String[] args) {
            //Es un array que no hace falta declarar tamaño.
            ArrayList<String> color = new ArrayList<>();

            //Con add añadimos
            color.add("rojo");
            color.add("verde");
            color.add("azul");
            color.add("blanco");
            color.add("blanco");
            color.add("blanco");
            System.out.println("Print normal: "+color);

            //Para sacar elemento por elemento mejor un for each de este tipo:
            System.out.println("Vamos a probar bucles: ");
            for (String x: color) {
                System.out.println(x);
            }

            //con removeAll, eliminamos los colores que aparezcan en color2
            ArrayList<String> color2 = new ArrayList<>();
            color2.add("blanco");
            color.removeAll(color2);
            System.out.println("Print con removeAll(color): "+color);

            //Para ordenar podemos hacerlo con .sort():
            Collections.sort(color);
            System.out.println("Ordenado: " + color);
        }
    }
