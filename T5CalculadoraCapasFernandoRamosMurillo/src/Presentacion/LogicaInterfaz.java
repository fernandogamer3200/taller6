package Presentacion;

import Aplicacion.Logica;

public class LogicaInterfaz {
	
	/**
	 * @author fernando
	 * 
	 * La clase LogicaIntefaz se encarga simplemente de ejecutar cada
	 * una de las opciones que permiten imprimir cada uno de los menus
	 */
	
	/**
	 * La funcion OpcionesMenuPricipal se encarga de imprimir todos los
	 * menus del programa, además en cada uno de los casos se llama
	 * a la funcion "pideOpcion()" para pedirle al usuario cada una de
	 * las opciones de ese menu en concreto y por ultimo se le pasa la
	 * opcion elegida a las funciones Opciones ubicada en la clase Logica
	 * 
	 * @param opcion Se indica la opcion elegida en el main
	 */
	
	public static void OpcionesMenuPrincipal(int opcion) {
		switch (opcion) {
			case 1:
				Interfaz.imprimirMenuAritmetica();
				Logica.OpcionesAritmeticas(Interfaz.pideOpcion());
				Interfaz.saltaLineas(10);
				break;
			case 2:
				Interfaz.imprimirMenuFiguras();
				Logica.OpcionesFiguras(Interfaz.pideOpcion());
				Interfaz.saltaLineas(10);
				break;
			case 3: 
				Interfaz.imprimirMenuVolumenFiguras();
				Logica.OpcionesVolumenesFiguras(Interfaz.pideOpcion());
				Interfaz.saltaLineas(10);
				break;
			default:
				System.out.println("\nOpcion no valida");
				Interfaz.esperaIntro();
				break;
		}
	}
}
