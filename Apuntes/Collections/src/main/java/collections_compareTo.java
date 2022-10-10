public class collections_compareTo {
    private String nombre;
    private int edad;

    collections_compareTo (String nombre, int edad) {
        this.nombre=nombre;
        this.edad=edad;
    }

    @Override
    public String toString() {
        return "collections_compareTo{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public int compareTo(collections_compareTo o) {
        int r=0;
        r= nombre.compareTo(o.nombre);
        if (r==0)
            r=edad-o.edad;
        return r;
    }
}
