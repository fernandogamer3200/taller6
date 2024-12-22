package Aplicacion;

import Presentacion.*;

public class Main {
	
	public static void main(String args[]) {
		
		/**
		 *@author fernando
		 *
		 *La clase main es la encargada de ejecutar el programa,
		 *además llama a las distintas funciones del programa
		 */
		
		//Se indica la opcion que ha elegido el usuario
		int opcion = 0;
		
		do {
			//Se llama a la funcion imprimirMenuPrincipal
			Interfaz.imprimirMenuPrincipal();
			opcion = Interfaz.pideOpcion();
			//Se le pasa la opcion del usuario como parametro a OpcionesMenuPrincipal
			LogicaInterfaz.OpcionesMenuPrincipal(opcion);
		//El bucle y por lo tanto el programa, no terminará hasta que la opcion sea 4
		} while (opcion != 4);
		
	}
}
