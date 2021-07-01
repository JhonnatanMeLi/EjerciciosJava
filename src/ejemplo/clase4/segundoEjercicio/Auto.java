package ejemplo.clase4.segundoEjercicio;

public class Auto extends Vehiculo{

    private int numeroPuestos;

    public Auto(double velocidad, double aceleracion,
                double anguloDeGiro, String patente) {
        super.velocidad = velocidad;
        super.aceleracion = aceleracion;
        super.anguloDeGiro = anguloDeGiro;
        super.patente = patente;
        super.peso = 1000.0;
        super.ruedas = 4;
    }
}
