package ejemplo.clase1;

import java.util.Arrays;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	public static String replicate(char c,int n)
	{
		String result = "";
		for (int i=0; i < n; i++) {
			result = result + c;
		}
		return result;
	}
	
	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	public static String lpad(String s,int n,char c)
	{
		return String.format("%1$" + n + "s",s).replace(' ',c);
	}
	
	// Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		return Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
	}
	
	// Retorna un int[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		return Arrays.stream(arr).mapToInt(Integer::valueOf).toArray();
	}
	
	
	// Retorna la longitud del elemento con mayor cantidad 
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int maxSize = 0;
		for (String num: arr) {
			maxSize = num.length() > maxSize ? num.length() : maxSize;
		}
		return maxSize;
	}
	
	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static String[] lNormalize(String arr[],char c)
	{
		return Arrays.stream(arr).map((numero) -> {
			int faltante = maxLength(arr) - (numero).length();
			while (faltante > 0) {
				numero = c + numero;
				faltante--;
			}
			return numero;
		}).toArray(String[]::new);
	}
}