package ejemplo.clase3TT;

import ejemplo.clase3TM.Persona;

import java.util.Arrays;
import java.util.Comparator;

public class main {

    public static void main(String[] args) {

        Persona personas [] = new Persona[5];
        personas[0] = new Persona("Pedro", 789);
        personas[1] = new Persona("Ana", 456);
        personas[2] = new Persona("Peppa", 123);
        personas[3] = new Persona("Maria", 521);
        personas[4] = new Persona("Sergio", 109);

        Comparator<Persona> c = Comparator.comparingInt(Persona::getDni);
        Comparator<Persona> c2 = Comparator.comparing(Persona::getNombre);
        Sorter sort = (Sorter) MiFactory.getInstance("sorter");
        sort.sort(personas, c2);
        Arrays.stream(personas).forEach(System.out::println);

        Time time = new Time();
        int tamanio = 100000;
        Integer numeros[] = new Integer[tamanio];
        for (int i = tamanio; i > 0; i--)
            numeros[i-1]=i;
        System.out.println("Genera arreglo de numeros y empieza cuenta");
        time.start();
        Comparator<Integer> test = Comparator.comparingInt(o -> o);
        sort.sort(numeros, test);

        time.stop();
        System.out.println("Tiempo transcurrido: " + time.elapsedTime());
    }

}
