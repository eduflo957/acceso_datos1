//Utilizado en ej1_ordenarNombre

public class P1_Persona implements Comparable<P1_Persona>{

    int edad = 0;
    String nombre = " ";

    public P1_Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(P1_Persona o) {
        return nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "P1_Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
