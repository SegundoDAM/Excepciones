package ejercicios;

public class ejercicio01 {
public static void main(String[] args) {
	//provocando superar los limites string
	String cartel="Hola";
	try {
		System.out.println(cartel.charAt(5));
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println("letra no existente");
	}
	/*
	 * No existe una exception para bucle infinito
	 * porque, en si mismo, no es un error si no un
	 * mal funcionamiento semantico
	 */
	String nulko=null;
	try {
		System.out.println(nulko.charAt(0));
	} catch (NullPointerException e) {
		System.err.println("no existe el objeto");
	}
	int size=-1;
	try {
		int[] cosa=new int[size];
	} catch (NegativeArraySizeException e) {
		System.out.println("Error en longitud del array");
	}
}
}
