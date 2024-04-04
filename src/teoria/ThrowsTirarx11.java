package teoria;

public class ThrowsTirarx11 {
	ThrowsTirarx11() throws Exception {
		divideByZero();
	}

	int divideByZero(){
		return 25/0;
	}
	//El fallo se envia al método llamador que lo trata
	
	public static void main(String[] args) {
		try {
			ThrowsTirarx11 prueba=new ThrowsTirarx11();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
	
