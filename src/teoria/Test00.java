package teoria;
public class Test00 {
	public static void main(String[] args) {
//		int a = 10, b = 0, c;
//		c = a / b;
//		System.out.println("Resultado: " + c);
		// primero sin try
		int a = 10, b = 0, c;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Error controlado por mi: " + e.getMessage());
			return;
		}
		System.out.println("Resultado: " + c);
	}
}
