package common;

public class SmartTv extends Pantalla{
	//herencia
	String sistemaOperativo;
	public SmartTv(){
		
	}
	public SmartTv(double tama�o, String marca, double precio, String resolucion, String tipoPanel,
			String sistemaOperativo) {
		super(tama�o, marca, precio, resolucion, tipoPanel);
		this.sistemaOperativo = sistemaOperativo;
	}
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

}
