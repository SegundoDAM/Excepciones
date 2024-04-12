package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		char cosa;
		String line;
		char letra='n';
		byte correspondencia=(byte) letra;
		char otra=(char) correspondencia;
		System.out.println("la letra "+letra+" es igual a "+otra);
		line = leer.nextLine();
		try {
			//intento hacer la conversion
			Byte number = Byte.valueOf(line);
			System.out.println("no hay fallo, luego es una letra");
			cosa = (char) number.byteValue();
		} catch (Exception e) {
			System.out.println("si hay fallo, luego es un numero");
			cosa = line.charAt(0);
		}
		System.out.println(cosa);
	}
}
