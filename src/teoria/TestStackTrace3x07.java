package teoria;

public class TestStackTrace3x07 {
	boolean fallo=false;
	TestStackTrace3x07() {
		try {
			divideByZero();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if(e.getCause()==null) 
				fallo=true;
		}
		finally {
			System.out.println("Ejecucion no condicionada por try");
		}
	}

	int divideByZero(){
		return 25/0;
	}
	public static void main(String[] args) {
		TestStackTrace3x07 prueba=new TestStackTrace3x07();
		if (prueba.fallo)
			System.out.println("Ha ocurrido un fallo");
		else
			System.out.println("no ha habido fallo");
	}
}
//Al ejecutar este programa observaremos que da un error, si miramos las l�neas donde 
//aparecen observaremos el camino que ha llevado a �l, veremos como existen 
//unas llamadas a metodos que terminan en el momento que ha dado el error
