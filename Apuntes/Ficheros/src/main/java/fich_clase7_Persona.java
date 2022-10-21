import java.io.Serial;
import java.io.Serializable;

public class fich_clase7_Persona implements Serializable {
    @Serial
    private static final long serialVersionUID = 8517896157969817980L;
    //Opcional, pero mejor ponerlo. Metodo para Java para ver si el objeto que me devuelve
    //es el mismo que he querido grabar al principio

    //transient es para que la gente no lo vea
    //está en bytes, pero no se puede leer, es como que está codificado
    //
    // private transient String nombre;
    private String nombre;
    private Integer edad;

    public fich_clase7_Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return (nombre + ' '+edad);
    }
}
