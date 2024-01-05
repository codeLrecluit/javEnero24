package common;

public class Microondas {
	
	//propiedades
	private String color = ""; 
	private double precio = 0.0;
	private boolean funciona = true;
	
	public Microondas() {
		
	}
	
	public Microondas(String color, double precio, boolean funciona) {
		this.color = color;
		this.precio = precio;
		this.funciona = funciona;
	}

	//Getters y setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isFunciona() {
		return funciona;
	}

	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}

	//Tostring
	@Override
	public String toString() {
		return "Microondas [color=" + color + ", precio=" + precio + ", funciona=" + funciona + "]";
	}

	
	

}
