package common;

public class Boleto {
	
	private double precio;
	private String nombre;
	private String ciudad;
	
	public Boleto() {
		
	}

	public Boleto(double precio, String nombre, String ciudad) {
		this.precio = precio;
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Boleto [precio=" + precio + ", nombre=" + nombre + ", ciudad=" + ciudad + "]";
	}
	
	
}
