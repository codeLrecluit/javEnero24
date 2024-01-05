package common;

import java.util.Arrays;

public class Auto {
	
	String noSerie;
	String marca;
	String color;
	
	Motor motor;
	Interiores interior;
	Transmicion trans;
	Frenos[] freno;
	
	public Auto() {
		
	}

	public Auto(String noSerie, String marca, String color, Motor motor, Interiores interior, Transmicion trans,
			Frenos[] freno) {
		super();
		this.noSerie = noSerie;
		this.marca = marca;
		this.color = color;
		this.motor = motor;
		this.interior = interior;
		this.trans = trans;
		this.freno = freno;
	}

	public String getNoSerie() {
		return noSerie;
	}

	public void setNoSerie(String noSerie) {
		this.noSerie = noSerie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Interiores getInterior() {
		return interior;
	}

	public void setInterior(Interiores interior) {
		this.interior = interior;
	}

	public Transmicion getTrans() {
		return trans;
	}

	public void setTrans(Transmicion trans) {
		this.trans = trans;
	}

	public Frenos[] getFreno() {
		return freno;
	}

	public void setFreno(Frenos[] freno) {
		this.freno = freno;
	}

	@Override
	public String toString() {
		return "Auto [noSerie=" + noSerie + ", marca=" + marca + ", color=" + color + ", motor=" + motor + ", interior="
				+ interior + ", trans=" + trans + ", freno=" + Arrays.toString(freno) + "]";
	}
	
	

}
