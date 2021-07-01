package ejemplo.clase4.tercerEjercicio;

import java.util.List;

public class Evento {

    private List<PackFuego> listaFuegos;
    private List<Invitado> listaInvitados;

    public Evento(List<PackFuego> listaFuegos, List<Invitado> listaInvitados) {
        this.listaFuegos = listaFuegos;
        this.listaInvitados = listaInvitados;
    }

    public void apagarVelas() {
        System.out.println("\"La chiqui\" apagara las velas!");
        this.reventarFuegos();
        this.repartirTorta();
    }

    private void reventarFuegos() {
        System.out.println("------------------------------");
        this.listaFuegos.stream().forEach(PackFuego::explotarContenido);
        System.out.println("------------------------------");
    }

    private void repartirTorta() {
        this.listaInvitados.forEach(x-> {
            System.out.println("El invitado " + x.getNombre() + " esta comiendo la torta");
            if (x.getMeli())
                System.out.println("Viva la Chiqui!!");
        });
    }

}
