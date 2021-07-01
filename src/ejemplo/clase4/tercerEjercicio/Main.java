package ejemplo.clase4.tercerEjercicio;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Invitado> invitados = new ArrayList<>();
        invitados.add(new Invitado("Pepito Perez", true));
        invitados.add(new Invitado("Sara Gomez", false));
        invitados.add(new Invitado("Yuyeimy Rosas", true));
        invitados.add(new Invitado("Peppa Pig", false));
        invitados.add(new Invitado("Superman", true));

        List<PackFuego> packs1 = new ArrayList<>();
        List<PackFuego> packs2 = new ArrayList<>();
        List<FuegoIndividual> fuegosIndividuales = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            fuegosIndividuales.add(new FuegoIndividual());
        packs1.add(new PackFuego(null, fuegosIndividuales));

        fuegosIndividuales = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            fuegosIndividuales.add(new FuegoIndividual());
        packs2.add(new PackFuego(packs1, fuegosIndividuales));

        fuegosIndividuales = new ArrayList<>();
        for (int i = 0; i < 4; i++)
            fuegosIndividuales.add(new FuegoIndividual());
        packs2.add(new PackFuego(null, fuegosIndividuales));

        Evento event = new Evento(packs2, invitados);
        event.apagarVelas();
    }

}
