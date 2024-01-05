package common;

public class Pantalla {
/*
 * una clase es una lantilla de la cual se realizaran coias
 * objetos, instancias*/
	
	/*mienbros de una clase
	 * atributos
	 * costructores
	 * getter y setter
	 * to string*/
	//comortamientos(metodos)
	
	double tama�o;
	String marca;
	double precio;
	String resolucion;
	String tipoPanel;
	//metodos constructores: definen los estados iniciados de una clase
	
	public Pantalla() { //constructor vacio
		
	}
	public Pantalla(double tama�o, String marca, double precio, String resolucion, String tipoPanel) {
		
		this.tama�o = tama�o;
		this.marca = marca;
		this.precio = precio;
		this.resolucion = resolucion;
		this.tipoPanel = tipoPanel;
	}
	//getter
	public double getTama�o() {
		return tama�o;
	}
	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	public String getTipoPanel() {
		return tipoPanel;
	}
	public void setTipoPanel(String tipoPanel) {
		this.tipoPanel = tipoPanel;
	}
	
	//to string
	@Override
	public String toString() {
		return "Pantalla [tama�o=" + tama�o + ", marca=" + marca + ", precio=" + precio + ", resolucion=" + resolucion
				+ ", tipoPanel=" + tipoPanel + "]";
	}

	
	
}
