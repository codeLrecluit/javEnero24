package common;

public class Interiores {
	
	String color;
	String tipoSala;
	String colorTablero;
	
	public Interiores() {
		
	}

	public Interiores(String color, String tipoSala, String colorTablero) {
		super();
		this.color = color;
		this.tipoSala = tipoSala;
		this.colorTablero = colorTablero;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoSala() {
		return tipoSala;
	}

	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}

	public String getColorTablero() {
		return colorTablero;
	}

	public void setColorTablero(String colorTablero) {
		this.colorTablero = colorTablero;
	}

	@Override
	public String toString() {
		return "Interiores [color=" + color + ", tipoSala=" + tipoSala + ", colorTablero=" + colorTablero + "]";
	}
	
	

}
