import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        //1-
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entero: ");
        num = sc.nextInt();
        if (num % 2 ==0) {
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es impar");
        }
        //--------------------------------------------------
        //2_
        int num;
        System.out.println("Ingrese un numero entero: ");
        num = sc.nextInt();
        if (num % 10 == 0){
            System.out.println("El numero entero "+num+ " es multiplo de 10 ");
        }else{
            System.out.printf("El numero entero "+num+" no es multiplo de 10");
        }
        //--------------------------------------------------
        //3_
        char caracter;
        System.out.println("Ingrese un caracter: ");
        caracter = sc.next().charAt(0);
        if (caracter >= 'A' && caracter <= 'Z'){
            System.out.println("El caracter ingresado es mayuscula");
        }else{
            System.out.println("El carcater ingresado es minuiscula");
        }
        //--------------------------------------------------
        //4_
        int num1, num2 ;
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("Los numeros son iguales");
        }else{
            System.out.println("Los numeros no son iguales");
        }
        //-----------------------------------------------------
        //5_
        int num1 , num2 ;
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1+" es mayor que "+num2);
        }else if (num1 < num2){
            System.out.println(num2+" es mayor que "+num1);
        }else{
            System.out.println("Los numeros son iguales");
        }
        //----------------------------------------------------
        //6_
        int num1 , num2, cifra1, cifra2 ;
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        cifra1 = num1 % 10;
        cifra2 = num2 % 10;

        if (cifra1 == cifra2){
            System.out.println("Los numeros acaban en la misma cifra");
        }else {
            System.out.println("Los numeros no acaban en la misma cifra");
        }
        //--------------------------------------------------------
        //7_
        int num;
        System.out.println("Ingrese un numero entero: ");
        num = sc.nextInt();

        if (num % 3 ==0 && num % 5 == 0){
            System.out.println("El numero "+num+" es multiplo de 3 y de 5");
        }else {
            System.out.println("El numero "+num+" no es multiplo de 3 y de 5");
        }
        //--------------------------------------------------------
        //8_
        
        int num;
        System.out.println("Ingrese un numero entero: ");
        num = sc.nextInt();

        if (num % 2 ==0 || num % 3 == 0){
            System.out.println("El numero "+num+" es multiplo de 2 o de 3");
        }else {
            System.out.println("El numero "+num+" no es multiplo de 2 o de 3");
        }
        //--------------------------------------------------------
        //9_
        char caracter1, caracter2 ;
        System.out.println("Ingrese el primer caracter: ");
        caracter1 = sc.next().charAt(0);
        System.out.println("Ingrese el segundo caracter: ");
        caracter2 = sc.next().charAt(0);
        if (caracter1 == caracter2){
            System.out.println("Los caracteres son iguales");
        }else{
            System.out.println("Los caracteres no son iguales");
        }
        //--------------------------------------------------------
        //10_
        char caracter1, caracter2 ;
        System.out.println("Ingrese el primer caracter: ");
        caracter1 = sc.next().charAt(0);
        System.out.println("Ingrese el segundo caracter: ");
        caracter2 = sc.next().charAt(0);

        if ((caracter1 >='a' && caracter1 <= 'z') && (caracter2 >= 'a' && caracter2 <= 'z')){
            System.out.println("Ambos caracteres son letras minusculas");
        }else{
            System.out.println("Alguno de los dos o ambos no son letras minusculas");
        }
        //--------------------------------------------------------
        //11_
        char caracter ;
        System.out.println("Ingrese el primer caracter: ");
        caracter = sc.next().charAt(0);

        if (caracter >= '0' && caracter <= '9') {
            System.out.println( caracter +" Es un digito numerico");
        } else {
            System.out.println(caracter+" No es un digito numerico");
        }
        //--------------------------------------------------------
        //12_
        float num1, num2 ;
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextFloat();

        if (num2 == 0){
            System.out.println("La division no se puede realizar porque el divisor no puede ser 0");
        }else {
            System.out.println("El resultado de la divison es: "+ num1/num2);
        }
        //--------------------------------------------------------
        //13_
        
        int anio;
        System.out.println("Ingrese un año para saber si es bisiesto: ");
        anio = sc.nextInt();

        if ((anio % 4 ==0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año es bisiesto");
        }else {
            System.out.println("El año no es bisisto");
        }
        //--------------------------------------------------------
        //14_
        int num, cifra1, cifra2;
        System.out.println("Ingrese un numero entero de 3 cifras para saber si es capicua: ");
        num = sc.nextInt();
        cifra1 = num % 10 ;
        cifra2 = (num / 100) % 10;
        if (num < 99 || num > 999){
            System.out.println("El numero ingresado no es de tres cifras");
        }else if (cifra1 == cifra2){
            System.out.println("El numero es capicua");
        }else{
            System.out.println("El numero no es capicua");
        }
        //--------------------------------------------------------
        //15_
        int h, m, s;
        System.out.println("Ingrese las horas: ");
        h = sc.nextInt();
        System.out.println("Ingrese los minutos: ");
        m = sc.nextInt();
        System.out.println("Ingrese los segundos: ");
        s = sc.nextInt();
        if (h >= 0 && h < 24){
            if (m >= 0 && m <= 59){
                if (s >= 0 && s <= 59){
                    System.out.println("Es una hora valida");
                }else{
                    System.out.println("No es una hora valida");
                }
            }else{
                System.out.println("No es una hora valida");
            }
        } else {
            System.out.println("No es una hora valida");
        }
        //--------------------------------------------------------
        //16_
        int mes;
        System.out.println("Ingrese un mes (1-12): ");
        mes = sc.nextInt();
        if (mes < 1 || mes > 12){
            System.out.println("El numero entero no coresponde a un mes valido");
        }else if (mes == 1){
            System.out.println("El mes corresponde a enero, el cual tiene 31 dias");
        }else if (mes == 2){
            System.out.println("El mes corresponde a febrero, el cual tiene 29 dias");
        }else if (mes == 3){
            System.out.println("El mes corresponde a marzo, el cual tiene 31 dias");
        }else if (mes == 4){
            System.out.println("El mes corresponde a abril, el cual tiene 30 dias");
        }else if (mes == 5){
            System.out.println("El mes corresponde a mayo, el cual tiene 31 dias");
        }else if (mes == 6){
            System.out.println("El mes corresponde a junio, el cual tiene 30 dias");
        }else if (mes == 7){
            System.out.println("El mes corresponde a julio, el cual tiene 31 dias");
        }else if (mes == 8){
            System.out.println("El mes corresponde a agosto, el cual tiene 31 dias");
        }else if (mes == 9){
            System.out.println("El mes corresponde a septiembre, el cual tiene 30 dias");
        }else if (mes == 10){
            System.out.println("El mes corresponde a octubre, el cual tiene 31 dias");
        }else if (mes == 11){
            System.out.println("El mes corresponde a noviembre, el cual tiene 30 dias");
        }else if (mes == 12){
            System.out.println("El mes corresponde a diciembre, el cual tiene 31 dias");
        }
        //--------------------------------------------------------
        //17_ 
        float nota;
        System.out.println("Ingrese su nota: ");
        nota = sc.nextFloat();
        if (nota >= 0 && nota < 5){
            System.out.println("Insuficiente");
        }else if (nota >= 5 && nota < 6){
            System.out.println("Suficiente");
        }else if (nota >= 6 && nota < 7){
            System.out.println("Bien");
        }else if (nota >= 7 && nota < 9){
            System.out.println("Notable");
        }else if (nota >= 9 && nota <=10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("Nota no valida");
        }
        //--------------------------------------------------------
        //18_
        int i;
        i = 1;
        while (i <= 100) {
            System.out.println(i);
            i = i + 1;
        }
        //--------------------------------------------------------
        //19_
        int i = 1;
        do{
            System.out.println(i);
            i = i + 1;
        }while (i < 101);
        //--------------------------------------------------------
        //20_
        int i;
        for (i = 1; i <=100; i++){
            System.out.println(i);
        }
        //--------------------------------------------------------
        //21_
        int i = 100;
        while (i >= 1){
            System.out.println(i);
            i = i-1;
        }
        //--------------------------------------------------------
        //22_
        int i = 100;
        do {
            System.out.println(i);
            i = i - 1;
        }while (i>=1);
        //--------------------------------------------------------
        //23_
        int i;
        for (i = 100; i >= 1; i--){
            System.out.println(i);
        }
        //--------------------------------------------------------
        //24_
        int i,N;
        System.out.println("Ingrese un valor N: ");
        N = sc.nextInt();
        for (i =1; i <= N; i++){
            System.out.println(i);
        }

        i = 1;
        while (i <= N){
            System.out.println(i);
            i = i + 1;
        }

        i = 1;
        do {
            System.out.println(i);
            i = i + 1;
        }while (i <= N);
        //--------------------------------------------------------
        //25_
        int i,N;
        System.out.println("Ingrese un valor N: ");
        N = sc.nextInt();

        for (i = N; i >= 1; i-- ){
            System.out.println(i);
        }

        while (N >= 1){
            System.out.println(N);
            N = N - 1;
        }

        do {
            System.out.println(N);
            N = N -1;
        }while(N >= 1);
        //--------------------------------------------------------
        //26_
        int num1, num2, i ;
        i = 1;
        while(i == 1) {
            System.out.println("Ingrese dos numeros enteros distintos: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            if (num1 == num2){
                System.out.println("Los numeros no deben ser iguales, ingreselos nuevamente: ");
            }else if(num1 > num2 ){
                do {
                    System.out.println(num2);
                    num2 = num2 + 1;
                }while(num2 <= num1);
                i = 2;
            } else {
                do {
                    System.out.println(num1);
                    num1 = num1 + 1;
                }while(num1 <= num2);
                i = 2;
            }
        }
        //--------------------------------------------------------
        //27_
        int A, B, i, z;
        i = 1;
        while (i == 1) {
            System.out.println("Ingrese el valor de A: ");
            A = sc.nextInt();
            System.out.println("Ingrese el valor de B: ");
            B = sc.nextInt();
            if (A >= B) {
                System.out.println("A debe ser menor que B, ingrese nuevamente los valores");
            } else {
                for (z = A; z <= B; z++) {
                    if (z % 2 == 0) {
                        System.out.println(z);
                    }
                }
                i = 2;
            }

    }
}