import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class fich_clase6_ej1_profe extends ObjectOutputStream {
    fich_clase6_ej1_profe(FileOutputStream fO) throws IOException {
        super(fO);
    }

    protected void writeStreamHeader() {
    }
}