package common;

public class Transmicion {
	
	String tipoTrans;
	String transMH;
	String velocidades;
	
	public Transmicion() {
		
	}

	public Transmicion(String tipoTrans, String transMH, String velocidades) {
		super();
		this.tipoTrans = tipoTrans;
		this.transMH = transMH;
		this.velocidades = velocidades;
	}

	public String getTipoTrans() {
		return tipoTrans;
	}

	public void setTipoTrans(String tipoTrans) {
		this.tipoTrans = tipoTrans;
	}

	public String getTransMH() {
		return transMH;
	}

	public void setTransMH(String transMH) {
		this.transMH = transMH;
	}

	public String getVelocidades() {
		return velocidades;
	}

	public void setVelocidades(String velocidades) {
		this.velocidades = velocidades;
	}

	@Override
	public String toString() {
		return "Transmicion [tipoTrans=" + tipoTrans + ", transMH=" + transMH + ", velocidades=" + velocidades + "]";
	}
	
	
	

}
