package ejemplo;

import java.util.Scanner;

public class HolaCurso {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*System.out.println("Hola Mundo :D");
        int i=0;
        while (i<5) {
            System.out.println(i);
            i++;
        }

        int a = 5;
        System.out.println("Variable " + a);
        */

        int opcion = 0;
        while (opcion != 7) {

            opcion = 0;
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1. Numeros Pares");
            System.out.println("2. Multiplos de n");
            System.out.println("3. Validar primo");
            System.out.println("4. Números primos");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Area circulo");
            System.out.println("7. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    numerosPares();
                    break;
                case 2:
                    multiplos();
                    break;
                case 3:
                    esPrimo();
                    break;
                case 4:
                    numerosPrimos();
                    break;
                case 5:
                    digitosNaturales();
                    break;
                case 6:
                    areaCirculo();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        }
        //numerosPrimos();
        //digitosNaturales();
    }

    public static void numerosPares() {
        System.out.println("Ingrese la cantidad de números pares que deseea visualizar: ");
        int n = scanner.nextInt();
        int i = 0;
        int j = 1;
        while (i < n) {
            if (j%2 == 0) {
                System.out.print(j + " ");
                i++;
            }
            j++;
        }
    }

    public static void multiplos() {
        System.out.println("Ingrese la cantidad de multiplos a visualizar: ");
        int n = scanner.nextInt();
        System.out.println("Ingrese el número a evaluar: ");
        int numero = scanner.nextInt();
        int i = 0;
        int j = 1;
        while (i < n) {
            if (numero%j == 0) {
                System.out.print(j + " ");
                i++;
            }
            j++;
        }
    }

    public static void esPrimo() {
        System.out.println("Ingrese el numero a evaluar: ");
        int n = scanner.nextInt();
        int i = 1;
        boolean noPrimo = false;
        while ((i < n) && !noPrimo) {
            noPrimo = n%i == 0 && i != 1;
            i++;
        }
        if (noPrimo)
            System.out.println("El número " + n + " no es primo");
        else
            System.out.println("El número " + n + " es primo");
    }

    public static void numerosPrimos() {
        System.out.println("Ingrese la cantidad de números primos a visualizar: ");
        int n = scanner.nextInt();
        int numeroPrimos = 0;
        for (int j = 2; numeroPrimos < n; j++) {
            int i = 1;
            boolean noPrimo = false;
            while ((i < j) && !noPrimo) {
                noPrimo = j%i == 0 && i != 1;
                i++;
            }
            if (!noPrimo) {
                System.out.println(j);
                numeroPrimos++;
            }
        }
    }

    public static void digitosNaturales() {
        System.out.println("Ingrese la cantidad de números a visualizar: ");
        Integer n = scanner.nextInt();
        System.out.println("Ingrese el número de digitos: ");
        Integer m = scanner.nextInt();
        System.out.println("Ingrese el digito a filtrar: ");
        Integer d = scanner.nextInt();

        int contador = 0;
        Integer j = 1;
        while (contador < n) {
            char[] numero = j.toString().toCharArray();
            int digitos = 0;
            for (int i=0; i < numero.length; i++) {
                if (Character.getNumericValue(numero[i])  == d.intValue()) {
                    digitos++;
                }
            }
            if (digitos >= m) {
                contador++;
                System.out.print(j + " ");
            }
            j++;
        }
    }

    public static void areaCirculo() {
        System.out.println("Ingrese el radio del circulo: ");
        String n = scanner.next();
        double numero = Double.parseDouble(n.replace(',','.'));
        System.out.println("El radio del circulo es de: " + Math.PI*(Math.pow(numero,2)));
    }
}
