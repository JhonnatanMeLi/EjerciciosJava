package ejemplo.clase3TT;

import java.util.Comparator;

public class HeapSortSorterImple implements Sorter {

    @Override
    public void sort(Object[] arr, Comparator c) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            this.heapify(arr, n, i, c);
        for (int i = n - 1; i > 0; i--) {
            Object temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            this.heapify(arr, i, 0, c);
        }
    }

    private void heapify(Object arr[], int n, int i, Comparator c)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
        if (l < n && c.compare(arr[l], arr[largest]) > 0) // l < n && arr[l] > arr[largest]
            largest = l;
        if (r < n && c.compare(arr[r], arr[largest]) > 0) // r < n && arr[r] > arr[largest]
            largest = r;
        if (largest != i) {
            Object swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest, c);
        }
    }

}
