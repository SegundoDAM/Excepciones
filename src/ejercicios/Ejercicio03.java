package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
public static void main(String[] args) {
	Scanner leer=new Scanner(System.in);
	char cosa;
	byte nextInt = 0;
	try {
		nextInt= (byte) leer.nextInt();
		cosa=(char) nextInt;
	} catch (Exception e) {
		byte conversor=(byte) nextInt;
		cosa=(char) conversor;
	}
	System.out.println(cosa);
}
}
