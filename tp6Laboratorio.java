//1_
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int [] num = new int [10];
    int i, contadorPositivo, contadorNegativos;
    double positivos, negativos;
    positivos = 0;
    negativos = 0;
    contadorPositivo = 0;
    contadorNegativos = 0;

    for (i = 0; i <= 9; i++ ){
        System.out.println("Ingrese la nota numero "+(i+1)+":");
        num [i] = sc.nextInt();
        if(num [i] > 0){
            positivos = positivos + num [i];
            contadorPositivo =+ 1;
        }else{
            negativos = negativos + num [i];
            contadorNegativos =+ 1;
        }

    }
        System.out.println("La media de numeros positivos es: "+ positivos / contadorPositivo);
        System.out.println("La media de numeros negativos es: "+ negativos / contadorNegativos);

    }
}
//---------------------------------------------------------------
//2_
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int [] num = new int [10];
    int i, contador = 0;
    int suma = 0;

    for (i = 0; i<=9; i++ ){
        System.out.println("Ingrese el numero de la posicion "+(i)+":");
        num [i] = sc.nextInt();
        if (i % 2 == 0){
            suma = suma + num [i];
        }
        contador = contador + 1;
    }
        System.out.println("La media de los numeros que estan en la posicion pares del array es: "+ (suma/contador));
    }
}
//---------------------------------------------------------------
//3_
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cantAlum, i, superiores = 0, contador = 0;
    System.out.println("Ingrese la cantidad de alumnos del salon: ");
    cantAlum = sc.nextInt();
    double [] notas =  new double [cantAlum];
    double suma = 0;

    for (i = 0; i <= cantAlum - 1; i ++){
        System.out.println("Ingrese la nota del alumno numero " + (i + 1)+ " :" );
        notas [i] = sc.nextDouble();
        suma = suma + notas[i];
        contador = contador + 1;

    }
    double media = suma / contador;

    for (i = 0; i <= cantAlum - 1; i ++){
        if (notas [i] > media){
            superiores = superiores + 1;
        }
    }

        System.out.println("La media de las notas de la clase es: "+ media);
        System.out.println("La cantidad de alumnos con notas superiores a la media son: "+ superiores);

    }
}
//---------------------------------------------------------------
//4_
public class Main {
    public static void main(String[] args) {
    int [] pares = new int [20];
    int i, par = 2;

    for (i = 0; i <= 19; i ++){
        pares [i] = par;
        par = par + 2;
        
    }
        System.out.println("Los primeros 20 numeros pares son: ");
    for (i = 0; i <= 19; i ++){
        System.out.println(pares [i]);
    }
    }
}
//---------------------------------------------------------------
//5_
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numbers = new int[10];
        int i;
        for (i = 0; i <= 9; i++){
            System.out.println("Ingrese el valor del numero en la posicion " + i + " :");
            numbers[i] = sc.nextInt();
        }

        for (i = 0; i <= 9; i++){
            if (numbers[i] > 0){
                System.out.println(numbers[i]+" es positivo");
            }else if (numbers[i] < 0){
                System.out.println(numbers[i]+" es negativo");
            }else{
                System.out.println("El numero de la posicion "+ i +" es 0");
            }
        }

    }
}
//---------------------------------------------------------------
//6_
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numbers = new int[10];

        float mediaPositivos, mediaNegativos, sumaPositivos = 0, sumaNegativos = 0;
        int i,contador = 0;

        for (i = 0; i <= 9; i++){
            System.out.println("Ingrese el valor del numero en la posicion " + i + " :");
            numbers[i] = sc.nextInt();
        }

        for (i = 0; i <= 9; i++){
            if (numbers[i] > 0){
                sumaPositivos = sumaPositivos + numbers[i];
            }else if (numbers[i] < 0){
                sumaNegativos = sumaNegativos + numbers[i];
            }
            contador += 1;
        }
        mediaPositivos = sumaPositivos/contador;
        mediaNegativos = sumaNegativos/contador;
        System.out.println("La media de los valores positivos del array es: "+ mediaPositivos);
        System.out.println("La media de los valores negativos del array es: "+ mediaNegativos);
    }

}
//---------------------------------------------------------------
//7_
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int personas, i,  cont = 0;
        System.out.println("Ingrese la cantidad de personas a las  que se les va a pedir la altura: ");
        personas = sc.nextInt();

        float [] altura = new float[personas];
        float media, suma = 0;

        for (i = 0; i <= (personas-1); i++){
            System.out.println("Ingrese la altura de la persona numero " + (i + 1) + ":");
            altura[i] = sc.nextFloat();
            suma = suma + altura[i];
            cont = cont + 1;
        }
        media = suma/cont;

        int superior = 0, inferior = 0;
        System.out.println("La altura media es de: "+ media);

        for (i = 0; i <= (personas-1); i++){
            if(altura[i] > media){
                superior += 1;
            } else if (altura[i] < media) {
                inferior += 1;
            }
        }
        System.out.println("La cantidad de personas con altura superior a la media es: "+ superior);
        System.out.println("La cantidad de personas con altura inferior a la media es: "+ inferior);
    }

}
//---------------------------------------------------------------
//8_
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] nombre = new String[20];
        double [] sueldo = new double[20];
        int i;
        double mayor = 0;
        String nombreMayor = "";
        for (i = 0; i <= 19; i++){
            System.out.println("Ingrese el nombre del empleado "+ (i + 1)+ ": ");
            nombre[i] = sc.nextLine();
            System.out.println("Ingrese el sueldo del empleado numero "+(i+1)+":");
            sueldo[i] = sc.nextDouble();
            sc.nextLine();

            if(sueldo[i] > mayor ){
                mayor = sueldo[i];
                nombreMayor = nombre[i];
            }
        }

        System.out.println("El sueldo mayor es de: "+ mayor+ "que corresponde a "+ nombreMayor);

    }

}
//---------------------------------------------------------------
//9_
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese desde donde quiere que sea el numero del array: ");
        int desde = sc.nextInt();
        System.out.println("Ingrese hasta donde quiere que sea el numero del array: ");
        int hasta = sc.nextInt();
        System.out.println("Ingrese el tamaño del array: ");
        int tamanio = sc.nextInt();

        int[] arrayAleatorio = generarArrayAleatorio(desde, hasta, tamanio);

        for (int i = 0; i < arrayAleatorio.length; i++) {
            System.out.print(arrayAleatorio[i] + " ");
        }
    }

    public static int[] generarArrayAleatorio(int desde, int hasta, int tamanio) {
        int[] array = new int[tamanio];
        Random random = new Random();

        for (int i = 0; i < tamanio; i++) {
            // Generar un número aleatorio dentro del rango (desde, hasta)
            int numeroAleatorio = random.nextInt(hasta - desde + 1) + desde;
            array[i] = numeroAleatorio;
        }

        return array;
    }
}
//---------------------------------------------------------------
//10_A)_
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas para las matrices A y B: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas para las matrices A y B: ");
        int columnas = scanner.nextInt();

        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        int[][] matrizC = new int[filas][columnas];


        System.out.println("Ingrese los valores de la matriz A:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la posición (" + i + ", " + j + "): ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingrese los valores de la matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la posición (" + i + ", " + j + "): ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("La matriz resultante C (A + B) es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
//---------------------------------------------------------------
//10_B_
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int filasA = leerEntero("Ingrese el número de filas para la matriz A: ");
        int columnasA = leerEntero("Ingrese el número de columnas para la matriz A: ");
        int filasB = leerEntero("Ingrese el número de filas para la matriz B: ");
        int columnasB = leerEntero("Ingrese el número de columnas para la matriz B: ");
        
        int[][] matrizA = crearMatriz(filasA, columnasA);
        int[][] matrizB = crearMatriz(filasB, columnasB);
        
        llenarMatriz(matrizA);
        llenarMatriz(matrizB);
        
        System.out.println("Matriz A:");
        mostrarMatriz(matrizA);
        System.out.println("Matriz B:");
        mostrarMatriz(matrizB);

        if (filasA == filasB && columnasA == columnasB) {
            int[][] matrizC = sumarMatrices(matrizA, matrizB);

            
            System.out.println("La matriz resultante C (A + B) es:");
            mostrarMatriz(matrizC);
        } else {
            System.out.println("Las matrices no son compatibles para la suma.");
        }
    }

    public static int leerEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static int[][] crearMatriz(int filas, int columnas) {
        return new int[filas][columnas];
    }
    public static void llenarMatriz(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el valor para la posición (" + i + ", " + j + "): ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] matrizC = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return matrizC;
    }
}
//---------------------------------------------------------------
//11_
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la posición (" + i + ", " + j + "): ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Matriz original:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matrizTranspuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}