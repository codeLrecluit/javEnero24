package common;

public class Principal {
	public static void main(String[] args) {
		/*
		 * Herencia
		 * Encapsulamiento
		 * Abstraccion
		 * Polimorfismo
		 * 
		 * */
		
		Microondas m = new Microondas();
		System.out.println("Microondas: " + m);
		
		Microondas micro = new Microondas("Negro", 1300.5, false);
		System.out.println("Microondas con parametros: " +  micro);
		
		m.setFunciona(true);
		m.setPrecio(5000.0);
		m.setColor("Azul");
		
		System.out.println("Funcionamiento: " + m.isFunciona());
	}
}
