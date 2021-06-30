package ejemplo.clase3TT;

import ejemplo.clase3TM.Precedable;

import java.util.Comparator;

public class BubbleSortSorterImple implements Sorter{

    @Override
    public void sort(Object[] arr, Comparator c) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - i); j++) {
                if (c.compare(arr[j],arr[j+1]) > 0) { // arr[j].precedeA((T) arr[j+1])
                    Object aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }
}
