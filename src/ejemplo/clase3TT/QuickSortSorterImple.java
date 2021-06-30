package ejemplo.clase3TT;

import java.util.Comparator;

public class QuickSortSorterImple implements Sorter {

    @Override
    public void sort(Object[] arr, Comparator c) {
        this.quickSort(arr,0, arr.length - 1, c);
    }

    private void swap(Object[] arr, int i, int j) {
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(Object[] arr, int low, int high, Comparator c) {
        Object pivot = arr[high];
        int i = (low - 1);
        for(int j = low; j <= high - 1; j++) {
            if (c.compare(arr[j], pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    private void quickSort(Object[] arr, int low, int high, Comparator c){
        if (low < high)
        {
            int pi = partition(arr, low, high, c);
            quickSort(arr, low, pi - 1, c);
            quickSort(arr, pi + 1, high, c);
        }
    }
}
