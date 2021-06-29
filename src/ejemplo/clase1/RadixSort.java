package ejemplo.clase1;

import java.util.Arrays;

public class RadixSort {

    public static int[] radixSort(int []arr) {
        String[] letras = StringUtil.toStringArray(arr);
        letras = StringUtil.lNormalize(letras, '0');
        String[] result = organizarPorDigito(letras);
        return Arrays.stream(result).mapToInt(Integer::valueOf).toArray();
    }

    public static String[] organizarPorDigito(String []arr) {
        int posicion = arr[0].length() - 1;
        String[] temp = arr;
        while (posicion >= 0) {
            String [][] listas = {{},{},{},{},{},{},{},{},{},{}};
            for (String numero: temp) {
                int num = Character.getNumericValue(numero.charAt(posicion));
                listas[num] = addElement(listas[num].length, listas[num], numero);
            }
            int contador = 0;
            for (int i = 0; i < listas.length; i++) {
                for (int j = 0; j < listas[i].length; j++) {
                    temp[contador] = listas[i][j];
                    contador++;
                }
            }
            posicion--;
        }
        System.out.println(Arrays.toString(temp));
        return temp;
    }

    public static String[] addElement(int n, String arr[], String x)
    {
        int i;
        String newarr[] = new String[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];
        newarr[n] = x;
        return newarr;
    }

    public static void main(String[] args) {
        int arr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};
        //int arr[] = {3, 673, 106, 45, 2,23 };
        int arr2[] = radixSort(arr);
        for (int i: arr2) {
            System.out.println(i);
        }
    }

}
