package clases;

public class Barco {
	private String nombre;
	private String puertoDestino;
	private String puertoOrigen;
	private int capacidadDescarga;
	private int cargaActual;
	private int velocidad;
	private boolean atraco = true;
	
public Barco(String nombre, int velocidad, String puertoDestino) {
		this.nombre = nombre;
		this.capacidadDescarga = capacidadDescarga = 500;
		this.cargaActual = cargaActual = 1000;
		this.velocidad = velocidad;
		this.atraco = atraco;
		this.puertoDestino = puertoDestino;
		this.puertoOrigen = puertoOrigen;
}

public void Navegando() {
	 if(!this.atraco) {
		this.puertoDestino = "Puertomadero";
	 }else {
		 System.out.println("Atracado");
	 }
}

public int descargaBarco(int descargar) { 
	descargar = this.cargaActual - descargar;
	return descargar;
}

public void atracado() {
	if(this.atraco) {
		this.atraco = true;
		this.puertoDestino = this.puertoOrigen;
	}else {
		System.out.println("Navegando");
	}
}

public int cargarBarco(int cantidad) {
	if(cantidad + this.capacidadDescarga > 1000) {
		this.capacidadDescarga = 1000;
	}else {
		this.capacidadDescarga = this.capacidadDescarga + cantidad;
	}
	return this.capacidadDescarga;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getCapacidad_descarga() {
	return capacidadDescarga;
}

public void setCapacidad_descarga(int capacidadDescarga) {
	this.capacidadDescarga = capacidadDescarga;
}

public int getCarga_actual() {
	return cargaActual;
}

public void setCarga_actual(int carga_actual) {
	this.cargaActual = cargaActual;
}

public int getVelocidad() {
	return velocidad;
}

public void setVelocidad(int velocidad) {
	this.velocidad = velocidad;
	}
}