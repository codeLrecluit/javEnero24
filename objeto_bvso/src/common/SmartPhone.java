package common;

public class SmartPhone extends Celular{
		//atributo extra (comosicion)
	String  so;
	public SmartPhone() {
		
	}
	public SmartPhone(String modelo, String marca, double mAh, double tamaño, Pantalla pantalla, Camara[] cam,
			String so) {
		super(modelo, marca, mAh, tamaño, pantalla, cam);
		this.so = so;
	}
	public String getSo() {
		return so;
	}
	public void setSo(String so) {
		this.so = so;
	}
	@Override
	public String toString() {
		return "SmartPhone [so=" + so + "]";
	}
	public void reproducirMusica() {
		System.out.println("abrir Spotify");
	}
	
}
