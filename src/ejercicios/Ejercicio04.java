package ejercicios;

public class Ejercicio04 {
public static void main(String[] args) {
	new Ejercicio04().caller();
}

public void caller() {
	int divideVar;
	int dividend = 5;
	try {
		divideVar = divide(dividend, 0);
	} catch (ArithmeticException e) {
		divideVar=dividend;
	}
	System.out.println(divideVar);
	//provocar segundo error
	try {
		selectChar(new char[] {'a'}, 2);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("no existe caracter");
	}
}
public char selectChar(char[] array, int position) throws ArrayIndexOutOfBoundsException{
	return array[position];
}
public int divide(int dividend,int divider) throws ArithmeticException{
	//La defensiva toma decisiones cuya respuesta
	//no obligatoriamente son un error
//	try {
//		return dividend/divider;
//	} catch (Exception e) {
//		return 0;
//	}
	return dividend/divider;
}
}
