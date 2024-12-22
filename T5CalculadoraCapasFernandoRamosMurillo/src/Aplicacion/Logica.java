package Aplicacion;

import Presentacion.Interfaz;
import FuncionesAreasPoligonos.FuncionesAreas;
import FuncionesVolumenes.FuncionesVolumenes;

public class Logica {
	
	/**
	 * @author Fernando Ramos Murillo
	 * 
	 * La clase Logica es la encargada de ejecutar las distintas opciones
	 * que se encuentran en cada uno de los apartados del menu Principal,
	 * como las opciones aritmeticas, areas, y volumenes. Ademas contiene
	 * todas las funciones Aritmeticas.
	 */
	
	/**
	 * La funcion suma obtiene 2 numeros como parametros, suma
	 * ambos numeros y devuelve el resultado
	 * 
	 * @param numero1 Se indica el numero 1 a sumar
	 * @param numero2 Se indica el numero 2 a sumar
	 * @return Devuelve el resultado de la suma
	 */
	
	public static double suma (double numero1, double numero2) {
		return numero1 + numero2;
	}
	
	/**
	 * La funcion resta obtiene 2 numeros como parametros, resta
	 * ambos numeros y devuelve el resultado
	 * 
	 * @param numero1 Se indica el numero 1 a restar
	 * @param numero2 Se indica el numero 2 a restar
	 * @return Devuelve el resultado de la resta
	 */
	
	public static double resta (double numero1, double numero2) {
		return numero1 - numero2;
	}
	
	/**
	 * La funcion multiplicacion obtiene 2 numeros como parametros,
	 * multiplica ambos numeros y devuelve el resultado
	 * 
	 * @param numero1 Se indica el numero 1 a multiplicar
	 * @param numero2 Se indica el numero 2 a multiplicar
	 * @return Devuelve el resultado de la multiplicacion
	 */
	
	public static double multiplicacion (double numero1, double numero2) {
		return numero1 * numero2;
	}
	
	/**
	 * La funcion division obtiene 2 numeros como parametros,
	 * divide ambos numeros y devuelve el resultado
	 * 
	 * @param numero1 Se indica el numero 1 a dividir
	 * @param numero2 Se indica el numero 2 a dividir
	 * @return Devuelve el resultado de la división
	 */
	
	public static double division (double numero1, double numero2) {
		return numero1 / numero2;
	}
	
	
	/**
	 * La funcion OpcionesAritmeticas se encarga de ejecutar cada una
	 * las opciones del menu OpcionesAritmeticas, se le pasa como parametro
	 * la opcion del usuario y se comprueba cada uno de los casos. 
	 * 
	 * @param opcion Se indica la opcion del usuario
	 */
	
	public static void OpcionesAritmeticas(int opcion) {
		
		/*En cada uno de los casos se le pide al usuario un numero con "pideDatoNumero()"
		 *y se le pasa ese numero a cada una de las funciones Aritmeticas del programa
		 *como parametro y por ultimo se imprime el resultado*/
		
		switch (opcion) {
			case 1:
				Interfaz.saltaLineas(3);
				System.out.println("***SUMA***\n");
				Interfaz.imprimeResultado(Logica.suma(Interfaz.pideDatoNumero("Numero 1"), Interfaz.pideDatoNumero("Numero 2")));
				break;
			case 2:
				Interfaz.saltaLineas(3);
				System.out.println("***RESTA***\n");
				Interfaz.imprimeResultado(Logica.resta(Interfaz.pideDatoNumero("Numero 1"), Interfaz.pideDatoNumero("Numero 2")));
				break;
			case 3:
				Interfaz.saltaLineas(3);
				System.out.println("***MULTIPLICACION***\n");
				Interfaz.imprimeResultado(Logica.multiplicacion(Interfaz.pideDatoNumero("Numero 1"), Interfaz.pideDatoNumero("Numero 2")));
				break;
			case 4:
				Interfaz.saltaLineas(3);
				System.out.println("***DIVISION***\n");
				
				/*Se guarda en 2 variables los 2 numeros, ya que necesitamos
				comprobar primero que el numero 2 no es 0 antes de pasarlo a Logica*/
				
				double numero1 = Interfaz.pideDatoNumero("Numero 1");
				double numero2 = Interfaz.pideDatoNumero("Numero 2");
				
				//Se crea un bucle y se pide nuevamente el numero 2 hasta que no sea 0
				while (numero2 == 0) {
					System.out.println("No se puede dividir entre 0");
					numero2 = Interfaz.pideDatoNumero("Numero 2");
				}
				Interfaz.imprimeResultado(division(numero1, numero2));
				break;
			case 5:
				break;
			default:
				System.out.println("\nOpcion no valida");
				Interfaz.esperaIntro();
				break;
		}
	}
	
	
	/**
	 * La funcion OpcionesAritmeticas se encarga de ejecutar cada una
	 * las opciones del menu OpcionesFiguras, se le pasa como parametro
	 * la opcion del usuario y se comprueba cada uno de los casos. 
	 * 
	 * @param opcion Se indica la opcion del usuario
	 */
	
	public static void OpcionesFiguras(int opcion) {
		
		/*En cada uno de los casos se le pide al usuario un numero con "pideDatoNumero()"
		 *y se le pasa ese numero a cada una de las funciones Areas del programa
		 *como parametro y por ultimo se imprime el resultado*/
		
		switch (opcion) {
			case 1:
				Interfaz.saltaLineas(3);
				System.out.println("***CUADRADO***\n");
				
				/*Se crean 2 variables para guardar los lados antes de pasarlos
				 *como parametro a calcular AreaCuadrado$Rectangulo, ya que
				 *necesitamos comprobar que los 2 lados sean iguales para que sea
				 *un cuadrado
				 */
				
				double lado1 = Interfaz.pideDatoNumero("Lado 1");
				double lado2 = Interfaz.pideDatoNumero("Lado 2");
				
				/*Con un bucle se pide el lado 2 hasta que el usuario introduzca
				 *un numero igual al lado 1
				 */
				
				while (lado1 != lado2) {
					System.out.println("Los 2 lados no pueden ser desiguales");
					lado2 = Interfaz.pideDatoNumero("Lado 2");
				}
				Interfaz.imprimeResultado(FuncionesAreas.calcularAreaCuadrado$Rectangulo(lado1, lado2));
				break;
			case 2:
				Interfaz.saltaLineas(3);
				System.out.println("***RECTANGULO***\n");
				
				/*Se crean 2 variables para guardar los lados antes de pasarlos
				 *como parametro a calcular AreaCuadrado$Rectangulo, ya que
				 *necesitamos comprobar que los 2 lados sean desiguales para que sea
				 *un rectangulo
				 */
				
				lado1 = Interfaz.pideDatoNumero("Lado 1");
				lado2 = Interfaz.pideDatoNumero("Lado 2");
				
				/*Con un bucle se pide el lado 2 hasta que el usuario introduzca
				 *un numero desigual al lado 1
				 */
				
				while (lado1 == lado2) {
					System.out.println("Los 2 lados no pueden ser iguales");
					lado2 = Interfaz.pideDatoNumero("Lado 2");
				}
				Interfaz.imprimeResultado(FuncionesAreas.calcularAreaCuadrado$Rectangulo(lado1, lado2));
				break;
			case 3:
				Interfaz.saltaLineas(3);
				System.out.println("***TRIANGULO***\n");
				Interfaz.imprimeResultado(FuncionesAreas.calcularAreaTriangulo(Interfaz.pideDatoNumero("Base"), Interfaz.pideDatoNumero("Altura")));
				break;
			case 4:
				Interfaz.saltaLineas(3);
				System.out.println("***CIRCULO***\n");
				Interfaz.imprimeResultado(FuncionesAreas.calcularCircuferencia(Interfaz.pideDatoNumero("Radio")));
				break;
			case 5:
				break;
			default:
				System.out.println("\nOpcion no valida");
				Interfaz.esperaIntro();
				break;
		}
	}
	
	
	/**
	 * La funcion OpcionesAritmeticas se encarga de ejecutar cada una
	 * las opciones del menu OpcionesVolumenesFiguras, se le pasa como 
	 * parametro la opcion del usuario y se comprueba cada uno de los casos. 
	 * 
	 * @param opcion Se indica la opcion del usuario
	 */
	
	public static void OpcionesVolumenesFiguras(int opcion) {
		
		/*En cada uno de los casos se le pide al usuario un numero con "pideDatoNumero()"
		 *y se le pasa ese numero a cada una de las funciones Volumenes del programa
		 *como parametro y por ultimo se imprime el resultado*/
		
		switch (opcion) {
			case 1:
				Interfaz.saltaLineas(3);
				System.out.println("***CUBO***\n");
				Interfaz.imprimeResultado(FuncionesVolumenes.calcularVolumenCubo(Interfaz.pideDatoNumero("Lado")));
				break;
			case 2:
				Interfaz.saltaLineas(3);
				System.out.println("***PRISMA***\n");
				Interfaz.imprimeResultado(FuncionesVolumenes.calcularVolumenPrisma(Interfaz.pideDatoNumero("Alto"), Interfaz.pideDatoNumero("Ancho"), Interfaz.pideDatoNumero("Profundidad")));
				break;
			case 3: 
				Interfaz.saltaLineas(3);
				System.out.println("***CONO***\n");
				Interfaz.imprimeResultado(FuncionesVolumenes.calcularVolumenCono(Interfaz.pideDatoNumero("Radio"), Interfaz.pideDatoNumero("Altura")));
				break;
			case 4:
				Interfaz.saltaLineas(3);
				System.out.println("***ESFERA***\n");
				Interfaz.imprimeResultado(FuncionesVolumenes.calcularVolumenEsfera(Interfaz.pideDatoNumero("Radio")));
				break;
			case 5:
				break;
			default:
				System.out.println("\nOpcion no valida");
				Interfaz.esperaIntro();
				break;
		}
	}
}
