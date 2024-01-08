package common;

import java.util.Arrays;

//Composicion
public class Celular {
	
	String modelo;
	String marca;
	double mAh;
	double tamaño;
	
	Pantalla pantalla;
	Camara[] cam;
	
	public Celular() {
		
	}

	public Celular(String modelo, String marca, double mAh, double tamaño, Pantalla pantalla, Camara[] cam) {
		this.modelo = modelo;
		this.marca = marca;
		this.mAh = mAh;
		this.tamaño = tamaño;
		this.pantalla = pantalla;
		this.cam = cam;
	}
	
	public Celular(String marca, double mAh, Pantalla pantalla) {
		
		
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getmAh() {
		return mAh;
	}

	public void setmAh(double mAh) {
		this.mAh = mAh;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Camara[] getCam() {
		return cam;
	}

	public void setCam(Camara[] cam) {
		this.cam = cam;
	}

	@Override
	public String toString() {
		return "Celular [modelo=" + modelo + ", marca=" + marca + ", mAh=" + mAh + ", tamaño=" + tamaño + ", pantalla="
				+ pantalla + ", cam=" + Arrays.toString(cam) + "]";
	}	

	//Comportamiento
	/*
	 * 1-Metodos nativos
	 * 2-Metodos Heredados (comunmente se sobreescriben)
	 * 3-Metodos Implementados (traidos de interfaces)
	 */
	
	public void hacerLlamadas(String numero) {	
		System.out.println("Llamando al "+numero+"....");
	}
	
	public void reproducirMusica() {
		System.out.println("Reproduciendo ....");
	}
	
	
	
	
	
	
}
