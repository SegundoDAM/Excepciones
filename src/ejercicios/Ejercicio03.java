package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
public static void main(String[] args) {
	Scanner leer=new Scanner(System.in);
	char cosa;
	String line;
	byte nextInt = 0;
		line= leer.nextLine();
		try {
			Integer bite =Integer.valueOf(line);
			byte cos=bite.byteValue();
			cosa=(char)cos;
		} catch (Exception e) {
			cosa=line.charAt(0);
		}
	System.out.println(cosa);
}
}
