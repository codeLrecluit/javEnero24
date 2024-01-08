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
	
	double tamaño;
	String marca;
	double precio;
	String resolucion;
	String tipoPanel;
	//metodos constructores: definen los estados iniciados de una clase
	
	public Pantalla() { //constructor vacio
		
	}
	public Pantalla(double tamaño, String marca, double precio, String resolucion, String tipoPanel) {
		
		this.tamaño = tamaño;
		this.marca = marca;
		this.precio = precio;
		this.resolucion = resolucion;
		this.tipoPanel = tipoPanel;
	}
	//getter
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
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
		return "Pantalla [tamaño=" + tamaño + ", marca=" + marca + ", precio=" + precio + ", resolucion=" + resolucion
				+ ", tipoPanel=" + tipoPanel + "]";
	}

	
	
}
