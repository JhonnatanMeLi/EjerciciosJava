package ejemplo.clase2;

public class main {

    public static void main(String[] args) {
        /*CuentaCorriente test = new CuentaCorriente();
        System.out.println(test.toString());

         */

        Fecha test2 = new Fecha(2021,06,30);
        System.out.println(test2.getFecha().getTime());
        test2.sumarDia();
        System.out.println(test2.getFecha().getTime());
        System.out.println("La fecha de 2021/06/35 es "
                + (test2.validarFecha(2021,06,35) ? "valida" : "invalida"));
    }
}
