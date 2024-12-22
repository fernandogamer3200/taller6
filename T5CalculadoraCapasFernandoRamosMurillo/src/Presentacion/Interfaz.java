package Presentacion;

import java.util.Scanner;

import Aplicacion.Logica;
import FuncionesAreasPoligonos.FuncionesAreas;

public class Interfaz {
	
	/**
	 * @author fernando
	 * 
	 * La clase Interfaz contiene todas las funciones destinadas
	 * a comunicarse con el usuario, como imprimir menus, opciones,
	 * pedir numeros al usuario, etc
	 */
	
	/**
	 * La funcion imprimirMenuPrincipal imprime el menu
	 * principal del progra
	 */
	
	public static void imprimirMenuPrincipal() {
		System.out.println("MENÚ PRINCIPAL");
		System.out.println("\n1. Operación aritmética");
		System.out.println("2. Áreas de figuras");
		System.out.println("3. Volúmenes de figuras");
		System.out.println("4. Salir");
	}
	
	/**
	 * La funcion imprimirMenuAritmetica imprime el menu
	 * de las opciones aritmeticas del programa y llama
	 * a la funcion saltaLineas() para saltar lineas al
	 * principio.
	 */
	
	public static void imprimirMenuAritmetica() {
		Interfaz.saltaLineas(10);
		System.out.println("MENÚ OPERACIÓN ARITMÉTICA");
		System.out.println("\n1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Volver");
	}
	
	/**
	 * La funcion imprimirMenuFiguras imprime el menu
	 * de las opciones de Areas de figuras del programa
	 * y llama a la funcion saltaLineas() para saltar 
	 * lineas al principio.
	 */
	
	public static void imprimirMenuFiguras() {
		Interfaz.saltaLineas(10);
		System.out.println("MENÚ ÁREAS DE FIGURAS");
		System.out.println("\n1. Cuadrado");
		System.out.println("2. Rectángulo");
		System.out.println("3. Triángulo");
		System.out.println("4. Circuferencia");
		System.out.println("5. Volver");
	}
	
	/**
	 * La funcion imprimirMenuVolumenFiguras imprime el menu
	 * de las opciones volumenFiguras del programa y llama
	 * a la funcion saltaLineas() para saltar lineas al
	 * principio.
	 */
	
	public static void imprimirMenuVolumenFiguras() {
		Interfaz.saltaLineas(10);
		System.out.println("MENÚ VOLÚMENES DE FIGURAS");
		System.out.println("\n1. Cubo");
		System.out.println("2. Prisma rectangular");
		System.out.println("3. Cono");
		System.out.println("4. Esfera");
		System.out.println("5. Volver");
	}
	
	/**
	 * La funcion saltaLineas realiza un numero determinado
	 * de saltos de lineas, numero que se indica en el parametro
	 * de la funcion
	 * 
	 * @param numeroLineas Se indica el numero de lineas a saltar
	 */
	
	public static void saltaLineas(int numeroLineas) {
		for (int i=0; i<=numeroLineas; i++) {
			System.out.println("");
		}
	}
	
	/**
	 * La funcion pideDatoNumero pide al usuario cualquier dato
	 * que sea un numero, en el cual en el parametro de la funcion
	 * se indica un texto para poder personalizar el dato que
	 * queremos pedirle al usuario
	 * 
	 * @param dato Se indica un texto para el dato
	 * @return Devuelve el numero pedido al usuario
	 */
	
	public static double pideDatoNumero(String dato) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nDime "+dato+": ");double numero = sc.nextDouble();
		return numero;
	}
	
	/**
	 * La funcion pideOpcion pide al usuario una opcion para
	 * los menus y opciones del programa
	 * 
	 * @return Devuelve la opcion que se ha pedido
	 */
	
	public static int pideOpcion() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDime una opcion\n");
		System.out.print("Opcion: ");int opcion = sc.nextInt();
		return opcion;
	}
	
	/**
	 * La funcion imprimeResultado imprime el resultado de una funcion
	 * en el cual se lo pasamos como parametro
	 * 
	 * @param resultado Se indica el resultado de una funcion
	 */
	
	public static void imprimeResultado(double resultado) {
		System.out.println("\nEl resultado es: "+resultado);
		esperaIntro();
	}
	
	/**
	 * La funcion esperaIntro utiliza la clase Scanner
	 * para "simular" detener la ejecuccion del programa
	 * hasta que se pulse intro
	 */
	
	public static void esperaIntro() {
		System.out.println("\nPulta intro para continuar..");
		new Scanner(System.in).nextLine();
	}
}
