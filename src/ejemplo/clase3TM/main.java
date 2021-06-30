package ejemplo.clase3TM;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Persona personas [] = new Persona[5];
        Celular celulares[] = new Celular[3];
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Programa para ordenar personas");
        for (int i = 0; i < personas.length; i++) {
            Persona person = new Persona();
            System.out.println("Ingrese el nombre de la "+ (i+1) +" persona: ");
            person.setNombre(scanner.next());
            System.out.println("Ingrese el dni de la "+ (i+1) +" persona: ");
            person.setDni(scanner.nextInt());
            personas[i] = person;
        }
        //personas[0] = new Persona("Pedro", 789);
        //personas[1] = new Persona("Ana", 456);
        //personas[2] = new Persona("Peppa", 123);
        //personas[3] = new Persona("Maria", 521);
        //personas[4] = new Persona("Sergio", 109);


        System.out.println("Arreglo personas original:");
        for (Persona persona: personas) {
            System.out.println(persona.toString());
        }
        System.out.println("Arreglo personas ordenado:");
        SortUtil.ordenar(personas);
        for (Persona persona: personas) {
            System.out.println(persona.toString());
        }
        */

        System.out.println("Programa para ordenar celulares");
        for (int i = 0; i < celulares.length; i++) {
            Celular cellphone = new Celular();
            System.out.println("Ingrese el nombre del titular "+ (i+1) +": ");
            cellphone.setTitular(scanner.next());
            System.out.println("Ingrese el numero del "+ (i+1) +" celular: ");
            cellphone.setNumero(scanner.nextLong());
            celulares[i] = cellphone;
        }

        System.out.println("Arreglo celulares original:");
        for (Celular celular: celulares) {
            System.out.println(celular.toString());
        }
        System.out.println("Arreglo celulares ordenado:");
        SortUtil.ordenar(celulares);
        for (Celular celular: celulares) {
            System.out.println(celular.toString());
        }


    }

}
