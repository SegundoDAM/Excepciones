package teoria;

public class TestStackTrace2x06 {
	TestStackTrace2x06() {
	
			try {
				divideByZero();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		
	}

	int divideByZero() throws Exception{
		return 25/0;
	}
	public static void main(String[] args) {
		TestStackTrace2x06 prueba=new TestStackTrace2x06();
	}
}
//Al ejecutar este programa observaremos que da un error, si miramos las l�neas donde 
//aparecen observaremos el camino que ha llevado a �l, veremos como existen 
//unas llamadas a metodos que terminan en el momento que ha dado el error
