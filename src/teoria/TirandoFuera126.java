package teoria;

public class TirandoFuera126 {
	TirandoFuera126() throws Exception {
		try {
			divideByZero();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			throw new Exception("no se que fallo"+e.getMessage());
		}
	
	}

int divideByZero(){
	return 25/0;
}
public static void main(String[] args) throws Exception {
	TirandoFuera126 prueba=new TirandoFuera126();
}
}
