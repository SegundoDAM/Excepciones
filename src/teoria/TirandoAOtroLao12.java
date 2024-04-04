package teoria;

public class TirandoAOtroLao12 {
	int divisor=1;
public void viendoFallo()throws ArithmeticException{
	if (divisor==1)
		throw new ArithmeticException();
}
public static void main(String[] args) {
	TirandoAOtroLao12 nuevo=new TirandoAOtroLao12();
	try{
	nuevo.viendoFallo();
	//A diferencia de no usar throw siempre se cual es el tipo de excepcion
	}catch (ArithmeticException e){
		System.out.println("divisior sigue siendo cero");
	}
	
}
}
