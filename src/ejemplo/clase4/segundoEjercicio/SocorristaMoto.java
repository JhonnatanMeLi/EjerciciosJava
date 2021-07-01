package ejemplo.clase4.segundoEjercicio;

public class SocorristaMoto implements Socorrista<Moto>{

    @Override
    public void socorrer(Moto moto) {
        System.out.println("Socorriendo la moto con patente " + moto.getPatente());
    }
}
