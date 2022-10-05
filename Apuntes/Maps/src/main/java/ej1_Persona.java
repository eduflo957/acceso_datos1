//Utilizado en ej1_ordenarNombre

public class ej1_Persona implements Comparable<ej1_Persona>{

    int edad = 0;
    String nombre = " ";

    public ej1_Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(ej1_Persona o) {
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
