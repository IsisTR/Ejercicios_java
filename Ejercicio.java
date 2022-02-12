/**se estan importando librerias de java al programa**/
import java.util.Calendar;
import java.util.Scanner;
import java.util.Random;


public class Ejercicio{
  public static void main(String args[]){

    Scanner in = new Scanner(System.in); /*(Scanner in)creacion de un objeto tipo Scanner, (new Scanner)se esta inicializando para despues indicar la funcionalidad, (System.in) el metodo indica que se va a introducir datos desde el teclado)*/
    boolean salir = false;
    int opcion = 0;

    while(!salir){

    
    	System.out.println("Menu de Opciones");  /**(System.out.println("")permite imprimir el texto entre comillas en la consola)**/
    	System.out.println("1. Calcular la edad de una persona");
    	System.out.println("2. Transformar unidad Celsius");
    	System.out.println("3. Solicitar y mostrar datos");
    	System.out.println("4. Calculadora");
    	System.out.println("5. Numeros aleatorios");
    	System.out.println("6. Tabla de multiplicar");
    	System.out.println("7. Salir");

    	opcion = in.nextInt(); /*se guarda la respuesta en el objeto tipo Scanner llamado in, con el metodo .nextInt(la datos son numerico)*/
    
    	switch(opcion){
     
    		case 1:  /*calcular edad de una persona*/
			Calendar fecha = Calendar.getInstance(); /**getInstance: toma el momento exacto en que se compila el programa**/
			int fecha_act = fecha.get(Calendar.YEAR);/**Se esta pidiendo nada más el año de la fecha capturada con getInstance**/
			int fecha_nacimiento = 0;
			int edad = 0;
			System.out.println("Introduzca el año de nacimiento:");
			fecha_nacimiento = in.nextInt();

			edad = fecha_act - fecha_nacimiento;

			System.out.println("Este año usted tiene: " + edad + " años de edad."); /*el signo + concatena la variable al texto*/
			break;
     
   		case 2: /*Convertir grados celsius a fahreneir y kelvin*/
			double grado_C = 0;
			double grado_F = 0;
			double grado_K = 0;

			System.out.println("Introduzca los grados Celsius a convertir:");
			grado_C = in.nextInt();

			grado_F= (grado_C * 9/5)+32;
			grado_K= grado_C + 273.15;

			System.out.println(grado_C +" grados Celsius equivalen a " + grado_F +" grados Fahrenheit y a " + grado_K + " grados Kelvin");
			break;
     
   		case 3: /**Solicitar y mostrar datos**/
			String nombre = "";
			String apellido = "";
			String direccion = "";
			String correo = "";
			String tlf = "";


			System.out.println("Por favor introduzca los siguientes datos. Nombre:");
			nombre = in.nextLine();  

			System.out.println("Apellido:");
			apellido = in.nextLine();

			System.out.println("Direccion:");
			direccion = in.nextLine();

			System.out.println("Correo:");
	 		correo = in.nextLine();

			System.out.println("Numero de telefono:");
			tlf = in.nextLine();

			System.out.println(nombre + apellido+ " vive en "+ direccion +", su correo electronico es "+ correo +" y su numero de telefono es: "+ tlf +".");
			break; 

    		case 4: /**Calculadora**/
			int num1 = 0;
			int num2 = 0;
			double result = 0;
			int opcion_cal = 0;
	
			System.out.println("Elige la operacion matematica a realizar: 1.Suma, 2.Resta, 3.multiplicacion, 4.Division");
			opcion_cal =in.nextInt();
	
			if(opcion_cal == 1){
			  System.out.println("Introduce el primer numero a sumar:");
			  num1 = in.nextInt();

			  System.out.println("Introduce el segundo numero a sumar:");
			  num2 = in.nextInt();

			  result = num1 + num2;
			  System.out.println("El resultdo de la suma es: " +result);
			}

			if(opcion_cal == 2){
			  System.out.println("Introduce el primer numero a restar:");
			  num1 = in.nextInt();

			  System.out.println("Introduce el segundo numero a restar:");
			  num2 = in.nextInt();
			  result = num1 - num2;
			  System.out.println("El resultdo de la resta es: " +result);
			}

			if(opcion_cal == 3){
			  System.out.println("Introduce el primer numero a multiplicar:");
			  num1 = in.nextInt();
			  System.out.println("Introduce el segundo numero a multiplicar:");
			  num2 = in.nextInt();

			  result = num1 * num2;
			  System.out.println("El resultdo de la multiplicacion es: " +result);
			}

			if(opcion_cal == 4){
			  System.out.println("Introduce el primer numero a dividir:");
			  num1 = in.nextInt();

			  System.out.println("Introduce el segundo numero a dividir:");
			  num2 = in.nextInt();

			  result = num1 / num2;
			  System.out.println("El resultdo de la division es: " +result);
			}
			break; 

    		case 5: /**Numeros aleatorios entre 25 y 75 (con decimales)**/
			
			int n_a = 0;
			Random r = new Random(); /**creacion de un objeto tipo Random**/
 
			System.out.println("Numeros aleatorios entre 25 y 75:");
			for(int i=1; i<=6; i++){
			  n_a = (int) (r.nextInt(75-25+1)+25);
			  System.out.println(n_a);
			}	
			break;

    		case 6: /**Tabla de multiplicar**/
			int n = 0;
			System.out.println("Introduzca un numero entero: ");
			n = in.nextInt();

			System.out.println("La tabla del " + n + " es:");
			for(int i=1; i<=10; i++){
			  System.out.println(n + " * "+ i +" = "+ n*i);
			}
			break;

		case 7: 
			salir = true;
			break;  

    		default:	
			System.out.println("Solo numeros entre 1 y 7");
			break;
 		}/**cierre de switch**/
    
 	}/**cierre del while**/

 }/**cierra static vid**/
}/**cierra class ejercicio**/