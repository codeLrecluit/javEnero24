package common;

import java.util.Arrays;

//Composicion
public class Celular {
	
	String modelo;
	String marca;
	double mAh;
	double tama�o;
	
	Pantalla pantalla;
	Camara[] cam;
	
	public Celular( ) {
		
	}

	public Celular(String modelo, String marca, double mAh, double tama�o, Pantalla pantalla, Camara[] cam) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.mAh = mAh;
		this.tama�o = tama�o;
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

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
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
		return "Celular [modelo=" + modelo + ", marca=" + marca + ", mAh=" + mAh + ", tama�o=" + tama�o + ", pantalla="
				+ pantalla + ", cam=" + Arrays.toString(cam) + "]";
	}
	
	//Comportamiento
	/*
	 * 1-METODOS NATIVOS
	 * 2-METODOS HEREDADOS (COMUNMENTE SE SOBREESCRIBEN)
	 * 3- METODOS IMPLEMENTADOS
	 */
	
	public void hacerLlamadas(String numero) {
		
		System.out.println("LLAMANDO AL " + numero);

	}
	
	public void reproducirMusica() {
		System.out.println("Reproduciendo ...");
	}

}
