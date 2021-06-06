package clases;

public class Hulk {
	private String color;
	private float peso;
	private boolean calmado = false;
	private String nombre;
	private String colorOriginal;
public Hulk( String color, String nombre, float peso) {
		this.color = color;
		this.peso = peso;
		this.nombre = nombre;
		this.calmado = calmado;
		this.colorOriginal = colorOriginal;
	}

	public void Saludar() {
		if(!this.calmado) {
		 System.out.println("Hola soy " + this.nombre);
		}else {
			System.out.println("AAAAAAAAAAAAHHHGGGG");
		}
	}

	public void provocar() {
		if(this.calmado) {
			this.calmado = true;
			this.peso = this.peso * 5;
			this.color = "verde";
		}
	}

	public void calmar() {
		if(!this.calmado) {
			this.calmado = true;
			this.peso = this.peso / 5;
			this.color = this.colorOriginal;
			}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
