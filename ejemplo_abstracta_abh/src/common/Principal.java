package common;

public class Principal {
	public static void main(String[] args) {
		
		
		//Instanciamos las figuras
		Cuadrado cua = new Cuadrado(10.0);
		Circulo cir = new Circulo(6.0);
		
		System.out.println("Area del cuadrado: " + cua.calcularArea());
		System.out.println("Area del circulo: " + cir.calcularArea());
	}
}
