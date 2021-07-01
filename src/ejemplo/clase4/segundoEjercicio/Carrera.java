package ejemplo.clase4.segundoEjercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Carrera {

    private long distancia;
    private double premioDolares;
    private String nombre;
    private int cantidadVehiculosPermitidos;
    private List<Vehiculo> listaVehiculos;

    public Carrera() {
        this.listaVehiculos = new ArrayList<>();
        this.distancia = 10000;
        this.premioDolares = 1534.54;
        this.nombre = "Estandar";
        this.cantidadVehiculosPermitidos = 10;
    }

    public Carrera(long distancia, double premioDolares, String nombre, int cantidadVehiculosPermitidos) {
        this.listaVehiculos = new ArrayList<>();
        this.distancia = distancia;
        this.premioDolares = premioDolares;
        this.nombre = nombre;
        this.cantidadVehiculosPermitidos = cantidadVehiculosPermitidos;
    }

    public void darDeAltaAuto(double velocidad, double aceleracion, double anguloDeGiro, String patente) {
        Auto auto = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
        if (this.cantidadVehiculosPermitidos > this.listaVehiculos.size())
            this.listaVehiculos.add(auto);
    }

    public void darDeAltaMoto(double velocidad,double aceleracion,double anguloDeGiro,String patente) {
        Moto moto = new Moto(velocidad, aceleracion, anguloDeGiro, patente);
        if (this.cantidadVehiculosPermitidos > this.listaVehiculos.size())
            this.listaVehiculos.add(moto);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        List<Vehiculo> vehiculosFiltrados = this.listaVehiculos.stream()
                .filter(x -> x.equals(vehiculo)).collect(Collectors.toList());
        if (vehiculosFiltrados.size() > 0)
            this.listaVehiculos.remove(vehiculosFiltrados.get(0));
    }

    public void eliminarVehiculoConPatente(String patente) {
        List<Vehiculo> vehiculosFiltrados = this.listaVehiculos.stream()
                .filter(x -> x.getPatente().equals(patente)).collect(Collectors.toList());
        if (vehiculosFiltrados.size() > 0)
            this.listaVehiculos.remove(vehiculosFiltrados.get(0));
    }

    public void definirGanador() {
        Vehiculo[] test = new Vehiculo[5];

        this.listaVehiculos.sort((o1, o2) -> o1.calcularPuntaje() < o2.calcularPuntaje() ? 1 : -1);
        System.out.println("El ganador del dacker para la carrera "+this.nombre+" es el vehiculo con patente "
            + this.listaVehiculos.get(0).getPatente());
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
}
