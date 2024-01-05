package common;

public class Frenos {
	
	String tipo;
	String enfAire;
	String color;
	
	public Frenos() {
		
	}

	public Frenos(String tipo, String enfAire, String color) {
		super();
		this.tipo = tipo;
		this.enfAire = enfAire;
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEnfAire() {
		return enfAire;
	}

	public void setEnfAire(String enfAire) {
		this.enfAire = enfAire;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Frenos [tipo=" + tipo + ", enfAire=" + enfAire + ", color=" + color + "]";
	}
	
	

}
