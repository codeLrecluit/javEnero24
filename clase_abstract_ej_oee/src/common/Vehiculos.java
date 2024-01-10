package common;

public abstract class Vehiculos {
	
	String marca;
	String modelo;
	String color;
	String noSerie;
	String version;
	
	public Vehiculos() {
		
	}

	public Vehiculos(String marca, String modelo, String color, String noSerie, String version) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.noSerie = noSerie;
		this.version = version;
	}
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNoSerie() {
		return noSerie;
	}

	public void setNoSerie(String noSerie) {
		this.noSerie = noSerie;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
	@Override
	public String toString() {
		return "Vehiculos [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", noSerie=" + noSerie
				+ ", version=" + version + "]";
	}

	public abstract void ensamble();
	
	

}
