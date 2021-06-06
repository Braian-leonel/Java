package clases;

public class Testhulk {

	public static void main(String[] args) {
		Hulk h1 = new Hulk("palido", "Bruce banner", 70);
		Hulk h2 = new Hulk("palido", "ruceff", 70);
		message(h1);
		h1.provocar();
		h1.calmar();
		
		h2.provocar();
		h2.calmar();
		
	}
	public static void message(Hulk h1) {
		System.out.println(h1.getNombre() + " " + h1.getColor() + " " + h1.getPeso());
		h1.Saludar();
	}
}
