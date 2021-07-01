package ejemplo.clase4.segundoEjercicio;

public class SocorristaAuto implements Socorrista<Auto> {


    @Override
    public void socorrer(Auto auto) {
        System.out.println("Socorriendo el auto con patente " + auto.getPatente());
    }
}
