package teoria;
import java.util.InputMismatchException;
import java.util.Scanner;


public class EjemploVariosCatchAnidadosTercero10 {
	//JUSTO LO QUE NO HAY QUE HACER EN PROGRAMACION
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int cadena[]=new int[4];
		boolean fallo=false;
		int posicion=0;
		try{
		  cadena[posicion]=leer.nextInt();
		  //Usa ctrl+t para ense�ar el padre de exception 
		}catch(Exception e){
			if(e.getClass()==InputMismatchException.class){
				System.out.println("fallo de tipo");
			}
			if(e.getClass()==ArrayIndexOutOfBoundsException.class){
				System.out.println("fallo de limites");
			}
			fallo=true;
		}
		if(fallo){
			System.out.println("salida con fallo");
		}
	}
}
