package teoria;

public class Tax02 {
	private double impuesto;
	
	public void calcTax(){
		impuesto=5;
	}
public static void main(String[] args) {
	Tax02 t=null;
	t.calcTax();
	//como veis existe un error que avisa en tiempo de compilacion
}
}
