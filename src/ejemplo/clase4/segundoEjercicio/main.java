package ejemplo.clase4.segundoEjercicio;

public class main {

    public static void main(String[] args) {
        Carrera carrera = new Carrera();
        carrera.darDeAltaAuto(125.4,20D,45D,"RRR123");
        carrera.darDeAltaAuto(12321,15D,30D,"ABC984");
        carrera.darDeAltaAuto(32483,23D,15D,"VFD234");
        carrera.darDeAltaMoto(987,14D,33D,"ADD987");
        carrera.darDeAltaMoto(584,99D,52D,"POI765");


        carrera.getListaVehiculos().forEach(x-> System.out.println(x.toString()));
        carrera.getListaVehiculos().forEach(x -> System.out.println("Vehiculo "+x.getPatente()
                +" tiene un puntaje de "+x.calcularPuntaje()));
        System.out.println("------------------------------");
        carrera.definirGanador();
        /*
        carrera.eliminarVehiculoConPatente("RRR123");
        carrera.getListaVehiculos().forEach(x-> System.out.println(x.toString()));
        System.out.println("------------------------------");
        carrera.eliminarVehiculo(new Auto(324,23D,15D,"VFD234"));
        carrera.getListaVehiculos().forEach(x-> System.out.println(x.toString()));
         */

    }

}
