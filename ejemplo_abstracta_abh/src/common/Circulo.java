package common;

public class Circulo extends Figura {
	
	double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radio, 2);
	}

}
