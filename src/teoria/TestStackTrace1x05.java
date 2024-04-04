package teoria;

public class TestStackTrace1x05 {
	TestStackTrace1x05() {
		divideByZero();
	}

	int divideByZero(){
		return 25/0;
	}
	public static void main(String[] args) {
		TestStackTrace1x05 prueba=new TestStackTrace1x05();
	}
}
//Al ejecutar este programa observaremos que da un error, si miramos las líneas donde 
//aparecen observaremos el camino que ha llevado a él, veremos como existen 
//unas llamadas a metodos que terminan en el momento que ha dado el error
