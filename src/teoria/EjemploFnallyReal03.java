package teoria;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFnallyReal03 {
	public static void main(String[] args) {
		BufferedReader br = null,brDos=null;
		try {
			br = new BufferedReader(new FileReader("archivo.txt"));
			//imaginad que falla el segundo y no el primero
			System.out.println("he abierto el primero");
			brDos = new BufferedReader(new FileReader("archivoExiste.txt"));
			System.out.println("he abierto el segundo");
			//Esto no se ejecuta porque ha habido un fallo si hay 
			//algo que deberia ejecutarse si o si, entonces se pone en finally
			//si no pones finally no estas asociando las lineas a un comportamiento
			//de captura de error 
			System.out.println("fallamos aqui");
			String linea;
			while ((linea = br.readLine()) != null) {
				// Procesar la l�nea
				System.out.println(linea);
			}
			System.out.println("pues ya he leido el archivo");
			//nunca se cierra
			br.close(); 
			brDos.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error al leer el archivo: " + e.getMessage());
			// Un fallo en este try evitaria la ejecucion del segundo try
		}
		try {
			System.out.println("cerrando");
			if (br != null) {
				br.close(); // Cerrar el archivo
			}
		} catch (IOException e) {
			System.err.println("Error al cerrar el archivo: " + e.getMessage());
		}
	}
}
