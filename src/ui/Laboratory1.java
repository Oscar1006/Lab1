import java.util.Scanner;

public class Laboratory1 {

	static Scanner sc = new Scanner(System.in);

	static boolean menu = true;

	static boolean sentinelStrings = false;
	static boolean sentinelNums = false;
	static boolean sentinelArrays = false;

	static int selec = 0;

	static String word1 = "";
	static String word2 = "";
	static String word3 = "";

	static double number1 = 0;
	static double number2 = 0;

	static int[] array1;
	static int[] array2;
	static int[] array3;

	static int[] A;
	static int[] B;
	static int[] C;

	/**
	* Prints the options of the menu. <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> The menu options have been displayed <br>
	*/
	public static void giveMenu() {
		System.out.println(
				" 1.Ingresar tres palabras u oraciones \n	2.Desplegar la longitud de cada cadena \n	3.Concatenear las tres cadenas y mostrar en pantalla \n	4.Mostrar el caracter ubicado en una pocision de la cadena\n\n\n 5.Ingresar dos numeros reales mayores a cero \n	6.Mostrar su division \n	7.Mostrar la division y el residuo de la parte entera de ambos numeros \n\n\n 8.Ingresar tres arreglos de numeros \n	9.Imprimir arreglos \n	10.Dar el promedio de uno de los arreglos \n	11.Dar el mayor valor de uno de los arreglos \n	12.Generar nuevo arreglo sumando, restando o multiplicando dos arreglos \n	13.Generar nuevo arreglo uniendo los tres arreglos (elementos pueden estar repetidos) \n	14.Generar nuevo arreglo uniendo los tres arreglos (elementos no pueden estar repetidos) \n	15.Generar nuevo arreglo con la intercepcion de los tres arreglos (elementos pueden estar repetidos) \n	16.Girar n posiciones, los valores de uno de los arreglos \n	17.Ordenar de menor a mayor los elementos de uno de los arrglos \n\n18.Salir del programa");
	}

	/**
	* Captures and initialize three strings  <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> word1 word2 word3 have been initialized  <br>
	*/
	public static void inWords() {
		System.out.println("Primera palabra:");
		word1 = sc.nextLine();
		System.out.println("Segunda palabra:");
		word2 = sc.nextLine();
		System.out.println("Tercera palabra:");
		word3 = sc.nextLine();
	}

	/**
	* Allows to the user choose one array <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> The array has been selected <br>
	*/
	public static void chooseArray() {
		System.out.println("\n	Escoja un arreglo:  \n 1.Primer arreglo \n 2.Segundo arreglo \n 3.Tercer arreglo");
		selec = sc.nextInt();
		sc.nextLine();
	}

	/**
	* Allows to the user choose two arrays <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> Two arrays were saved in the arrays A and B <br>
	*/
	public static void chooseTwoArrays() {
		chooseArray();
		switch (selec) {
		case 1:
			A = array1;
			break;
		case 2:
			A = array2;
			break;
		case 3:
			A = array3;
			break;
		default:
			A = array1;
		}
		chooseArray();
		switch (selec) {
		case 1:
			B = array1;
			break;
		case 2:
			B = array2;
			break;
		case 3:
			B = array3;
			break;
		default:
			B = array1;
		}
	}

	/**
	* Prints an array given <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> The array has been displayed with a nice desing  <br>
	* @param array Array to print. array != null;
	*/
	public static void printThisArray(int[] array) {
		System.out.println("\n	-----");
		for (int i = 0; i < array.length; i++) {
			System.out.println("	| " + array[i] + " |");
		}
		System.out.println("	----- \n");
	}

	/**
	* Calculates the number of charecters of the strings word1 word2 and word3 <br>
	* <b>pre: </b> true <br>
	* <b>post: </b>	The size of the strings have been show   <br>
	*/
	public static void wordLength() {
		if (sentinelStrings) {
			System.out.println("El tamaño de la primera cadena es: " + word1.length());
			System.out.println("El tamaño de la segunda cadena es: " + word2.length());
			System.out.println("El tamaño de la tercera cadena es: " + word3.length());
		} else {
			System.out.println("Debes ingresar las palabras en el punto 1 para poder ejecutar este punto");
		}
	}

	/**
	* Shows an specific character on a position choosen by the user of the strings word1 word2 and word3  <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> The character has been printed <br>
	*/
	public static void showCaracter() {
		if (sentinelStrings) {
			System.out.println("Digite la posicion del carecter ");
			selec = sc.nextInt();
			sc.nextLine();
			if (selec <= word1.length()) {
				System.out.println(word1.charAt(selec));
			} else {
				System.out.println("Posicion no valida");
			}
			if (selec <= word2.length()) {
				System.out.println(word2.charAt(selec));
			} else {
				System.out.println("Posicion no valida");
			}
			if (selec <= word3.length()) {
				System.out.println(word3.charAt(selec));
			} else {
				System.out.println("Posicion no valida");
			}
		} else {
			System.out.println("Debes ingresar las palabras en el punto 1 para poder ejecutar este punto");
		}
	}

	/**
	* Captures two positive integer numbers and saves them in two variables <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> number1 and number2 has been initialized  <br>
	*/
	public static void inNumbers() {
		System.out.println("Digite el primer numero");
		number1 = sc.nextDouble();
		if (number1 < 1){
			number1 = 0;
			System.out.println("Error. El numero no es entero positivo");
		}
		System.out.println("Digite el segundo numero");
		number2 = sc.nextDouble();
		if (number2 < 1){
			number2 = 0;
			System.out.println("Error. El numero no es entero positivo");
		}
	}

	/**
	* Captures and initialize three arrays <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> array1 array2 array3 have been initialized <br>
	*/
	public static void inArrays() {
		System.out.println("Cuantos numeros desea ingresar en el arreglo 1?");
		int size1 = sc.nextInt();
		sc.nextLine();
		array1 = new int[size1];
		System.out.println("Ingresa " + size1 + " numeros");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Cuantos numeros desea ingresar en el arreglo 2?");
		int size2 = sc.nextInt();
		sc.nextLine();
		array2 = new int[size2];
		System.out.println("Ingresa " + size2 + " numeros");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Cuantos numeros desea ingresar en el arreglo 3?");
		int size3 = sc.nextInt();
		sc.nextLine();
		array3 = new int[size3];
		System.out.println("Ingresa " + size3 + " numeros");
		for (int i = 0; i < array3.length; i++) {
			array3[i] = sc.nextInt();
			sc.nextLine();
		}
	}

	/**
	* Prints all the arrays made by the user <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> All the arrays have been displayed <br>
	*/
	public static void printArrays() {
		System.out.println("Primer Arreglo ");
		printThisArray(array1);

		System.out.println("Segundo Arreglo ");
		printThisArray(array2);

		System.out.println("Tercer Arreglo ");
		printThisArray(array3);
	}

	/**
	* Calculates the average of the numbers in one array <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> The average has been printed <br>
	*/
	public static void arrayAverage() {
		int sumation = 0;
		double average = 0;
		chooseArray();
		switch (selec) {
		case 1:
			for (int i = 0; i < array1.length; i++) {
				sumation += array1[i];
			}
			average = sumation / (array1.length);
			break;
		case 2:
			for (int i = 0; i < array2.length; i++) {
				sumation += array2[i];
			}
			average = sumation / (array2.length);
			break;
		case 3:
			for (int i = 0; i < array3.length; i++) {
				sumation += array3[i];
			}
			average = sumation / (array3.length);
			break;
		}
		System.out.println(average);
	}

	/**
	* Calculates the bigger number of one array <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> The bigger number has been printed <br>
	*/
	public static void biggerValue() {
		int bigger = Integer.MIN_VALUE;
		chooseArray();
		switch (selec) {
		case 1:
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] > bigger)
					bigger = array1[i];
			}
			break;
		case 2:
			for (int i = 0; i < array2.length; i++) {
				if (array2[i] > bigger)
					bigger = array2[i];
			}
			break;
		case 3:
			for (int i = 0; i < array3.length; i++) {
				if (array3[i] > bigger)
					bigger = array3[i];
			}
			break;
		}
		System.out.println(bigger);
	}

	/**
	* Allows to the user sum up, substract or multiply two arrays <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> The operation choosen has been calculated, saved and printed in a new array <br>
	*/
	public static void arrayMath() {
		System.out.println(
				"\nGenerar un nuevo arreglo: \n 1.Sumando dos arreglos \n 2.Restando dos arreglos \n 3.Multiplicando dos arreglos");
		selec = sc.nextInt();
		switch (selec) {
		case 1:
			sumOfTwoArrays();
			break;
		case 2:
			subtractOfArrays();
			break;
		case 3:
			multiplyOfArrays();
		}
	}

	/**
	* Calculates the sum of two arrays <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> The sum has been calculated and printed <br>
	*/
	public static void sumOfTwoArrays() {
		chooseTwoArrays();
		if (A.length == B.length) {
			C = new int[A.length];
			for (int i = 0; i < B.length; i++) {
				C[i] = A[i] + B[i];
			}
		} else {
			System.out.println("No se pueden sumar arreglos de distinto tamaño");
		}
		printThisArray(C);
	}

	/**
	* Calculates the substraction of two arrays <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> The substraction has been calculated and printed <br>
	*/
	public static void subtractOfArrays() {
		chooseTwoArrays();
		if (A.length == B.length) {
			C = new int[A.length];
			for (int i = 0; i < B.length; i++) {
				C[i] = A[i] - B[i];
			}
		} else {
			System.out.println("No se pueden restar arreglos de distinto tamaño");
		}
		printThisArray(C);
	}

	/**
	* Calculates the multiplication of two arrays <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> The multiplication has been calculated and printed <br>
	*/
	public static void multiplyOfArrays() {
		chooseTwoArrays();
		if (A.length == B.length) {
			C = new int[A.length];
			for (int i = 0; i < B.length; i++) {
				C[i] = A[i] * B[i];
			}
		} else {
			System.out.println("No se pueden multiplicar arreglos de distinto tamaño");
		}
		printThisArray(C);
	}

	/**
	* Unites the arrays created by the user <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> The union of all the arrays has been created <br>
	* @return unitedArray 
	*/
	public static int[] joinArrays() {
		int[] unitedArray;

		int size = array1.length + array2.length + array3.length;
		unitedArray = new int[size];
		for (int i = 0; i < array1.length; i++) {
			unitedArray[i] = array1[i];
		}
		for (int i = array1.length; i < array2.length + array1.length; i++) {
			unitedArray[i] = array2[i - array1.length];
		}
		for (int i = array1.length + array2.length; i < size; i++) {
			unitedArray[i] = array3[i - (array1.length + array2.length)];
		}
		return unitedArray;
	}

	/**
	* Unites all the arrays but deletes the repeated numbers <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> The union without repeated number has been displayed <br>
	*/
	public static void joinArraysNoRepeated() {
		int[] repeated = joinArrays();
		String[] sRepeated = new String[repeated.length];
		for (int i = 0; i < repeated.length; i++) {
			sRepeated[i] = String.valueOf(repeated[i]);
		}
		for (int i = 0; i < sRepeated.length; i++) {
			for (int j = 0; j < sRepeated.length - 1; j++) {
				if (i != j) {
					if (sRepeated[i].equals(sRepeated[j])) {
						sRepeated[j] = " ";
					}
				}
			}
		}
		for (int i = 0; i < sRepeated.length; i++) {
			System.out.println(sRepeated[i]);
		}
		System.out.println("\nNuevo arreglo \n	-----");
		for (int i = 0; i < sRepeated.length; i++) {
			if (!(sRepeated[i].equals(" "))) {
				System.out.println("	| " + sRepeated[i] + " |");
			}
		}
		System.out.println("	----- \n");
	}

	/**
	* Creates a new array with the interception of the three arrays <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> The interception of the arrays is obtained <br>
	* @return z Interception of the arrays
	*/
	public static int[] arraysInterception() {
		int[] x;
		int[] z;
		int count = 0;

		boolean found = false;
		//intersec arra1 arra2
		for (int i = 0; i < array1.length; i++){
			found = false;
			for (int j = 0; j < array2.length && !found; j++){
				if (array1[i] == array2[j]){
					count++;
					found = true;
				}
			}
		}
		x = new int[count];
		count = 0;
		for (int i = 0; i < array1.length; i++){
			found = false;
			for (int j = 0; j < array2.length && !found; j++){
				if (array1[i] == array2[j]){
					x[count] = array2[j];
					count++;
					found = true;
				}
			}
		}

		count = 0;
		//inter(a1 y a2) vs a3
		for (int i = 0; i < x.length; i++){
			found = false;
			for (int j = 0; j < array3.length && !found; j++){
				if (x[i] == array3[j]){
					count++;
					found = true;
				}
			}
		}
		z = new int[count];
		count = 0;
		for (int i = 0; i < x.length; i++){
			found = false;
			for (int j = 0; j < array3.length && !found; j++){
				if (x[i] == array3[j]){
					z[count] = array3[j];
					count++;
					found = true;
				}
			}
		}

		return z;
	}

	/**
	* Girates an array n positions <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> A The choosen array girated is obtained <br>
	* @return A Array girated
	*/
	public static int[] spinArray(){
		chooseArray();
		switch (selec) {
		case 1:
			A = array1;
			break;
		case 2:
			A = array2;
			break;
		case 3:
			A = array3;
			break;
		default:
			A = array1;
		}
		System.out.println("Cuantas veces quiere girar el arreglo?");
		int n = sc.nextInt();
		sc.nextLine();
		int position = 0;
		int aux = 0;
		int[] spined = new int[A.length];
		for (int i = 0; i < A.length; i++){
			aux = A[i];
			position = ((n+i) % (A.length));
			spined[position] = aux;
		}
		A = spined;
		return A;
	}

	/**
	* Order an array from the minor to the higher <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> The array ordenated is obtained <br>
	* @return A The array choosen ordenated
	*/
	public static int[] organizeArray(){
		chooseArray();
		switch (selec) {
		case 1:
			A = array1;
			break;
		case 2:
			A = array2;
			break;
		case 3:
			A = array3;
			break;
		default:
			A = array1;
		}
		int aux = 0;
		int i = 0;
		boolean organized = false;
		while (i < A.length && !organized){
			i++;
			organized = true;
			for (int j = 0; j < (A.length-i); j++){
				if (A[j] > A[j+1]){
					aux = A[j];
					A[j] = A[j+1];
					A[j+1] = aux;
					organized = false;
				}
			}
		}
		return A;
	}

	/**
	* Exucutes the menu <br>
	* <b>pre: </b> true <br>
	* <b>post: </b> The menu has been executed <br>
	*/
	public static void runMenu() {
		while (menu) {
			giveMenu();
			selec = sc.nextInt();
			sc.nextLine();

			switch (selec) {
			case 1:
				inWords();
				sentinelStrings = true;
				break;
			case 2:
				if (sentinelStrings) {
					wordLength();
				} else {
					System.out.println("\nDebe ingresar las palabras en el punto 1 para poder ejecutar esta funcion \n");
				}
				break;
			case 3:
				if (sentinelStrings) {
					System.out.println(word1 + word2 + word3);
				} else {
					System.out.println("\nDebe ingresar las palabras en el punto 1 para poder ejecutar esta funcion\n");
				}
				break;
			case 4:
				if (sentinelStrings) {
					showCaracter();
				} else {
					System.out.println("\nDebe ingresar las palabras en el punto 1 para poder ejecutar esta funcion\n");
				}
				break;
			case 5:
				inNumbers();
				sentinelNums = true;
			case 6:
				if (sentinelNums) {
					System.out.println(number1 / number2);
				} else {
					System.out.println("\nDebe ingresar los numeros en el punto 5 para poder ejecutar esta funcion\n");
				}
				break;
			case 7:
				if (sentinelNums) {
					System.out.println(number1 / number2);
					System.out.println(number1 % number2);
				} else {
					System.out.println("\nDebe ingresar los numeros en el punto 5 para poder ejecutar esta funcion\n");
				}
				break;
			case 8:
				inArrays();
				sentinelArrays = true;
				break;
			case 9:
				if (sentinelArrays) {
					printArrays();
				} else {
					System.out.println("\nDebe ingresar los arreglos en el punto 8 para poder ejecutar esta funcion\n");
				}
				break;
			case 10:
				if (sentinelArrays) {
					arrayAverage();
				} else {
					System.out.println("\nDebe ingresar los arreglos en el punto 8 para poder ejecutar esta funcion\n");
				}
				break;
			case 11:
				if (sentinelArrays) {
					biggerValue();
				} else {
					System.out.println("\nDebe ingresar los arreglos en el punto 8 para poder ejecutar esta funcion\n");
				}
				break;
			case 12:
				if (sentinelArrays) {
					arrayMath();
				} else {
					System.out.println("\nDebe ingresar los arreglos en el punto 8 para poder ejecutar esta funcion\n");
				}
				break;
			case 13:
				if (sentinelArrays) {
					int u[] = joinArrays();
					System.out.println(" El nuevo arreglo: \n");
					printThisArray(u);
				} else {
					System.out.println("\nDebe ingresar los arreglos en el punto 8 para poder ejecutar esta funcion\n");
				}
				break;
			case 14:
				if (sentinelArrays) {
					joinArraysNoRepeated();
				} else {
					System.out.println("\nDebe ingresar los arreglos en el punto 8 para poder ejecutar esta funcion\n");
				}
				break;
			case 15:
				if (sentinelArrays) {
					int[] u = arraysInterception();
					System.out.println(" El nuevo arreglo: \n");
					printThisArray(u);
				} 
				else {
					System.out.println("\nDebe ingresar los arreglos en el punto 8 para poder ejecutar esta funcion\n");
				}
				break;
			case 16:
				if (sentinelArrays) {
					int[] u = spinArray();
					System.out.println(" El nuevo arreglo: \n");
					printThisArray(u);
				} 
				else {
					System.out.println("\nDebe ingresar los arreglos en el punto 8 para poder ejecutar esta funcion\n");
				}
				break;
			case 17:
				if (sentinelArrays) {
					int[] u = organizeArray();
					System.out.println(" El nuevo arreglo: \n");
					printThisArray(u);
				} 
				else {
					System.out.println("\nDebe ingresar los arreglos en el punto 8 para poder ejecutar esta funcion\n");
				}
				break;
			case 18:
				menu = false;
				break;
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("\n\n Welcome to Lab 1\n");
		System.out.println("\n----------------------------------------  MENU  ---------------------------------------- \n");

		runMenu();
	}
}