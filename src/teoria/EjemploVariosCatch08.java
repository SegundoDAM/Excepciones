package teoria;
import java.util.InputMismatchException;
import java.util.Scanner;


public class EjemploVariosCatch08 {
public static void main(String[] args) {
	Scanner leer=new Scanner(System.in);
	int cadena[]=new int[4];
	boolean fallo=false;
	
	try{
	  System.out.println("escribe un valor de 0 a 3");
	  int posicion=leer.nextInt();
	  cadena[posicion]=9;
	  int a=cadena[posicion]/0;
	  //Usa ctrl+t para ense�ar el padre de exception 
	}catch(InputMismatchException e){
		
		System.out.println(e.getClass());
		System.out.println(e.getMessage());
		if(e.getMessage()==null) System.out.println("fallo de tipo");
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("estoy aqui "+e.getClass());
	}
	//La entrada en otra categoria hace que esta no se ejecute aunque sean hijas
	catch (Exception e){
		//Para hacer esto se usa finally
		System.out.println("fallo de exception");
		fallo=true;
		
	}
	if(fallo){
		System.out.println("salida con fallo");
	}
}
}
