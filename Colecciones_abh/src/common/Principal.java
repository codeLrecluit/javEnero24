package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// List es una interface
		// ArrayList es una clase que implementa la interface

		String nombre = "";
		String correo = "";
		String telefono = "";
		String direccion = "";
		
		// Las listas no trabajan con primitivos
		List<Contacto> listita = new ArrayList<Contacto>();
		Map<String, Contacto> agenda = new HashMap<String, Contacto>();
		
		
		int seleccion = 0;
		Scanner sc = new Scanner(System.in);
		Contacto con = null;

		do {
			System.out.println("\n\nMenu");
			System.out.println("1- Agregar contacto");
			System.out.println("2- Buscar contacto");
			System.out.println("3- Editar contacto");
			System.out.println("4- Eliminar contacto");
			System.out.println("5- Mostrar todos ");
			System.out.print("Selecciona una opcion: ");
			seleccion = sc.nextInt();

			switch (seleccion) {

			case 1:
				sc.nextLine();
				System.out.print("Ingresa el nombre: ");
				nombre = sc.nextLine();
				System.out.print("\nIngresa el correo: ");
				correo = sc.nextLine();
				System.out.print("Ingresa el numero: ");
				telefono = sc.nextLine();
				System.out.print("Ingresa la direccion: ");
				direccion = sc.nextLine();

				// Crear el objeto contacto
				con = new Contacto(nombre, correo, telefono, direccion);

				// Añadir a la lista
				listita.add(con);
				// Añadir en el mapa
				agenda.put(con.getNombre(), con);
				con = null; // Reseteo del objeto contacto
				
				System.out.println("Checamos la lista: " + listita);
				System.out.println("Checamos el map: " + agenda);
				break;
			case 2:
				sc.nextLine();
				System.out.print("Ingresa el nombre: ");
				nombre = sc.nextLine();
//				sc.nextLine();

				// Buscar el contacto dentro de la lista
				for (int i = 0; i < listita.size(); i++) {

					// Por cada elemento de la lista, obtengo su nombre y lo comparo con el nombre
					// que
					// indique para la busqueda
					if (listita.get(i).getNombre().equals(nombre)) {
						con = listita.get(i);
						break; // Detener el ciclo si es que ya encontre el contacto
					}
				}
				
				if (con != null) {
//					System.out.println("Nombre encontrado: " + nombre);
					System.out.println("Lista : Contacto encontrado : " + con);
				} else {
//					System.out.println("Nombre no encontrado: " + nombre);
					System.out.println("Lista : Contacto no enconrado");
				}
				
				con = null;
				// Buscar en el mapa

				for (String key : agenda.keySet()) {

					if (agenda.get(key).getNombre().equals(nombre)) {
						con = agenda.get(key);
						break;
					}
				}
				if (con != null) {
					System.out.println("Mapa : Contacto encontrado : " + con);
				} else {
					System.out.println("Mapa : Contacto no enconrado");
				}
				
				con = null;
				break;
				
			case 3:
				sc.nextLine();
				System.out.print("Ingresa el nombre: ");
				nombre = sc.nextLine();

				// Buscar el contacto dentro de la lista
				for (int i = 0; i < listita.size(); i++) {

					// Por cada elemento de la lista, obtengo su nombre y lo comparo con el nombre
					// que
					// indique para la busqueda
					if (listita.get(i).getNombre().equals(nombre)) {

						sc.nextLine();
						System.out.print("Ingresa el correo: ");
						correo = sc.nextLine();
						System.out.print("Ingresa el numero: ");
						telefono = sc.nextLine();
						System.out.print("Ingresa la direccion: ");
						direccion = sc.nextLine();
						
						// Actualizo los datos del objeto sin sacarlo de la lista
						listita.get(i).setCorreo(correo);
						listita.get(i).setTelefono(telefono);
						listita.get(i).setDireccion(direccion);
						
						System.out.println("Usuario modificado for: " + listita);
						break; // Detener el ciclo si es que ya encontre el contacto
					}

				}

				// Mapa
				for (String key : agenda.keySet()) {
					
					if (agenda.get(key).getNombre().equals(nombre)) {	
						
						sc.nextLine();
						System.out.print("Ingresa el correo: ");
						correo = sc.nextLine();
						System.out.print("Ingresa el numero: ");
						telefono = sc.nextLine();
						System.out.print("Ingresa la direccion: ");
						direccion = sc.nextLine();
						
						//Actualizo los datos del objeto sin sacarlo del mapa
						agenda.get(key).setCorreo(correo);
						agenda.get(key).setTelefono(telefono);	
						agenda.get(key).setDireccion(direccion);
						
						System.out.println("Usuario modificado foreach: " + agenda);
						break;
					}
				}
				con = null;
				break;
			case 4:
				sc.nextLine();
				System.out.print("Ingresa el nombre: ");
				nombre = sc.nextLine();
				
				//Lista
				for (int i = 0; i < listita.size(); i++) {

					// Por cada elemento de la lista, obtengo su nombre y lo comparo con el nombre
					// que
					// indique para la busqueda
					if (listita.get(i).getNombre().equals(nombre)) {
						System.out.println("Lista encontrado y eliminado: " + listita.get(i));
						listita.remove(i);
						break; // Detener el ciclo si es que ya encontre el contacto
					}
				}	
				
				//Mapa
				for (String key : agenda.keySet()) {
					if (agenda.get(key).getNombre().equals(nombre)) {
						System.out.println("Agenda encontrado y eliminado: " + agenda.get(key));
						agenda.remove(key);
						break;
					}
				}
				con = null;
				break;
			case 5:
				//lista
				System.out.println("Mostramos todas las listas: ");
				for (int i = 0; i < listita.size(); i++) {
					System.out.println(listita.get(i));
				}
				//Mapa
				System.out.println("\nMostramos todas las agendas: ");
				for (String key : agenda.keySet()) {
					System.out.println(agenda.get(key));
				}				
				break;
			}

		} while (seleccion > 0 && seleccion < 6);

	}

}