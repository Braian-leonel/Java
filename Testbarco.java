package clases;

public class Testbarco {

	public static void main(String[] args) {
		Barco perla  = new Barco("Perla negra", 120, "Bahia");
		Barco titanic = new Barco("Titanic", 200, "Rawson");
		perla.atracado();
		System.out.println("Descargo: " + perla.descargaBarco(300));
		perla.Navegando();
		System.out.println("Cargo: " + perla.cargarBarco(500));
	
	}
}
