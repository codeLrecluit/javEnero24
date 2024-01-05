package common;


//Es una plantilla o modelo de la cual se realizaran copias (objetos, instancias)
//QUE+COMO
public class Pantalla {
	
	//MIEMBROS POR DEFAULT
	
	//ATRIBUTOS
	/*
	 * TAMA�O,MARCA, PRECIO,RESOLUCION, TIPOPANEL.
	 */
	double tama�o;
	String marca;
	double precio;
	String resolucion;
	String tipoPanel; //notacion camelCase
	
	
	//CONSTRUCTORES
	public Pantalla() { //constructor vacio
		
	}


	public Pantalla(double tama�o, String marca, double precio, String resolucion, String tipoPanel) {
		this.tama�o = tama�o;
		this.marca = marca;
		this.precio = precio;
		this.resolucion = resolucion;
		this.tipoPanel = tipoPanel;
	}


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


	@Override
	public String toString() {
		return "Pantalla [tama�o=" + tama�o + ", marca=" + marca + ", precio=" + precio + ", resolucion=" + resolucion
				+ ", tipoPanel=" + tipoPanel + "]";
	}
	
	
	//COMPORTAMIENTO (METODOS)
	
	

}
