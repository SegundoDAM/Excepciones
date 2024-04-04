package teoria;

class MiExcepcionFinalDos extends Exception {
	// Esta clase no hereda de excepcion pero puede controlarlas
	// basandose en los tipos. Esto permite que en el resto del
	// codigo solo se use Exception
	private int tipo = 0;
	public MiExcepcionFinalDos(int tipo) {
		super();
		this.tipo = tipo;
	}

	int tramientoExcepcion() {
		if (tipo == 1) {
			System.out.println("fallo por divisor a cero. Arreglando");
			return 1;
		} else
			return 2;
	}
}

public class CentralizarConException17 {
	int divisor = 1;

	public void viendoFallo() throws MiExcepcionFinalDos {
		if (divisor == 0)
			// Tirando mi propia excepcion necesito de throws
			throw new MiExcepcionFinalDos(1);
	}

	public static void main(String[] args) {
		CentralizarConException17 nuevo = new CentralizarConException17();
		boolean fallo = false;
		do {
			try {
				nuevo.viendoFallo();
			} catch (MiExcepcionFinalDos e) {
				fallo = true;
				nuevo.divisor = e.tramientoExcepcion();
				fallo = false;
			}
		} while (fallo);
		System.out.println("El valor del divisor es:" + nuevo.divisor);
	}
}