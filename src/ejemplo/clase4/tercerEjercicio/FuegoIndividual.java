package ejemplo.clase4.tercerEjercicio;

import java.nio.charset.Charset;
import java.util.Random;

public class FuegoIndividual {

    private String sonido;

    public FuegoIndividual() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        this.sonido = new String(array, Charset.forName("UTF-8"));
    }

    public void explotar() {
        System.out.println("Explosión: " + this.sonido);
    }

}
