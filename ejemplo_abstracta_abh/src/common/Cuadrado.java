package common;

public class Cuadrado extends Figura {

	double lado;
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	
	@Override
	double calcularArea() {
		// TODO Auto-generated method stub
		return Math.pow(lado, 2);
	}

}
