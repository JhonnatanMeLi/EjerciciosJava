package ejemplo.clase4.tercerEjercicio;

import java.util.List;
import java.util.Objects;

public class PackFuego {

    private List<PackFuego> packs;
    private List<FuegoIndividual> fuegos;

    public PackFuego(List<PackFuego> packs, List<FuegoIndividual> fuegos) {
        this.packs = packs;
        this.fuegos = fuegos;
    }

    public void explotarContenido() {
        if (Objects.nonNull(this.fuegos))
            this.fuegos.forEach(FuegoIndividual::explotar);
        if (Objects.nonNull(this.packs))
            this.packs.forEach(PackFuego::explotarContenido);
    }

    public List<PackFuego> getPacks() {
        return packs;
    }

    public void setPacks(List<PackFuego> packs) {
        this.packs = packs;
    }

    public List<FuegoIndividual> getFuegos() {
        return fuegos;
    }

    public void setFuegos(List<FuegoIndividual> fuegos) {
        this.fuegos = fuegos;
    }
}
