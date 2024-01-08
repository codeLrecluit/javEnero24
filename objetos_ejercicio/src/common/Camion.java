package common;

import java.util.Arrays;

public class Camion {
	private int asientos;
	private String color;
	private double precio;
	private String marca;
	Boleto[] boleto;

	public Camion() {
		
	}

	public Camion(int asientos, String color, double precio, String marca, Boleto[] boleto) {
		this.asientos = asientos;
		this.color = color;
		this.precio = precio;
		this.marca = marca;
		this.boleto = boleto;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

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
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Boleto[] getBoleto() {
		return boleto;
	}

	public void setBoleto(Boleto[] boleto) {
		this.boleto = boleto;
	}

	@Override
	public String toString() {
		return "Camion [asientos=" + asientos + ", color=" + color + ", precio=" + precio + ", marca=" + marca
				+ ", boleto=" + Arrays.toString(boleto) + "]";
	}
	
	
}
