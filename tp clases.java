//1_
package poo;

public class Main {
    public static void main (String [] args ) {

    }
}

    class Perro{
        private String nombre;
        private String raza;
        int edad;

        public Perro(String nombre, String raza, int edad){
            this.nombre = nombre;
            this.raza = raza;
            this.edad = edad;
        }
    }
//-------------------------------------------------------------------------
//2_
package poo;

public class Main {
    public static void main (String [] args ) {
        Perro objeto = new Perro("Decker", "Caniche", 6)
    }
}
//-------------------------------------------------------------------------
//3_
public void ladrar() {
            System.out.println("GUAU! GUAU!");
        }
    }
//-------------------------------------------------------------------------
//4_
public class Main {
    public static void main(String[] args){

    }
}

class Circulo{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area(){
        return Math.PI * radio * radio;
    }

    public double circunferencia() {
        return 2 * Math.PI * radio;
    }
}
//-------------------------------------------------------------------------
//5_
public class Main {
    public static void main(String[] args){
    Circulo elCirculo = new Circulo(5);

        System.out.println("El area del circulo es: " + elCirculo.area()) ;
        System.out.println("La circunferencia del circulo es: " + elCirculo.circunferencia());
    }
}

class Circulo{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area(){
        return Math.PI * radio * radio;
    }

    public double circunferencia() {
        return 2 * Math.PI * radio;
    }
//-------------------------------------------------------------------------
//6_
class Estudiante {
    private String nombre;
    private int edad;
    private int numIdentif;
    
}
//-------------------------------------------------------------------------
//7_
public class Main {
    public static void main(String[] args){
    Estudiante est = new Estudiante("Mauro Garzia", 20, 44905166);
        System.out.println("La edad del estudiante es: " + est.getEdad() );
        System.out.println("El nombre del estudiante es: " + est.getNombre());
        System.out.println("El numero de identificacion del estudiante es: " + est.getNumIdentif());


    }
}

class Estudiante {
    private String nombre;
    private int edad;
    private int numIdentif;

    public Estudiante(String nombre, int edad, int numIdentif){
        this.nombre = nombre;
        this.edad = edad;
        this.numIdentif = numIdentif;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public int getNumIdentif() {
        return numIdentif;
    }
}
//-------------------------------------------------------------------------
//8_
    class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

}
//-------------------------------------------------------------------------
//9_
public class Main {
    public static void main(String[] args){
    Libro lib = new Libro("El Campito","Lionel Messi",1990);
    lib.mostrarInfo();
    }
}

class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public void mostrarInfo(){
        System.out.println("Titulo : " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + anioPublicacion);
    }
}
//-------------------------------------------------------------------------
//10_
class CuentaBancaria{
    private float saldo;
    private int numCuenta;
}
//-------------------------------------------------------------------------
//11_
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su saldo: ");
        double saldo = sc.nextDouble(); //Pido el saldo

        CuentaBancaria cuenta = new CuentaBancaria(saldo,123456789); //Creo el objeto

        System.out.println("Ingrese 1)_Para depositar / 2)_Para retirar");
        int opcion = sc.nextInt();

        if(opcion == 1){
            System.out.println("Ingrese cuanto desea depositar: ");
            double depositos = sc.nextDouble();
            cuenta.deposito(depositos);
        }else if (opcion == 2){
            System.out.println("Ingrese cuanto quiere retirar: ");
            double retiro = sc.nextDouble();
            cuenta.retirar(retiro);
        }else{
            System.out.println("Numero de opcion incorrecto");
        }

        cuenta.mostrar(123456789,saldo);
    }
}

class CuentaBancaria{
    private double saldo;
    private int numCuenta;


    public CuentaBancaria(double saldo, int numCuenta){
        this.saldo = saldo; //Se inicializa el saldo
        this.numCuenta = numCuenta;
    }
//Metodo para depositar
    public void deposito(double cant){
        if (cant > 0){
            saldo += cant;
            System.out.println("Se depositaron con exito: $" + cant );
        }else{
            System.out.println("La cantidad ingresada debe ser mayor a 0");
        }
    }

    //Metodo para retirar
    public void retirar(double cant){
        if (saldo <= 0){                    //Si el saldo es 0 o negativo no se puede retirar
            System.out.println("No hay saldo disponible");
        }else if(cant > saldo){             //Si la cantidad a retirar es menor que el saldo, no se podra realizar
            System.out.println("Saldo insuficiente");
        }else{
            saldo =- cant;
            System.out.println("Se retiraron: $" + cant);
        }
    }

    //Metodo para mostrar el numero de cuenta
    public void mostrar(int numCuenta, double saldo){
        System.out.println("Su numero de cuenta es: " + numCuenta);
        System.out.println(("Su saldo actual es: " + saldo));
    }

}
//-------------------------------------------------------------------------
//12_

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // Crear un objeto Rectangulo con ancho 5.0 y alto 3.0
        Rectangulo miRectangulo = new Rectangulo(5.0, 3.0);


        System.out.println("Área del rectángulo: " + miRectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + miRectangulo.calcularPerimetro());
    }
}

class Rectangulo {
    // Atributos
    private double ancho;
    private double alto;

    // Constructor
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return ancho * alto;
    }

    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
}
//-------------------------------------------------------------------------
//13_
class Coche {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int velocidad;
}
//-------------------------------------------------------------------------
//14_
public class Main {
    public static void main(String[] args){
        Coche auto = new Coche("Fiat", "Tipo", 2018);
        auto.acelerar(120);
        auto.frenar(30);
    }
}

class Coche {
    // Atributos
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int velocidad; // Atributo para la velocidad del coche

    // Constructor
    public Coche(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.velocidad = 0; // Inicialmente, la velocidad es 0
    }

    // Método para acelerar el coche
    public void acelerar(int incrementoVelocidad) {
        if (incrementoVelocidad > 0) {
            velocidad += incrementoVelocidad;
            System.out.println("El coche ha acelerado a " + velocidad + " km/h.");
        } else {
            System.out.println("El incremento de velocidad debe ser mayor que 0.");
        }
    }

    // Método para frenar el coche
    public void frenar(int decrementoVelocidad) {
        if (decrementoVelocidad > 0 && decrementoVelocidad <= velocidad) {
            velocidad -= decrementoVelocidad;
            System.out.println("El coche ha frenado a " + velocidad + " km/h.");
        } else {
            System.out.println("El decremento de velocidad no es válido o supera la velocidad actual.");
        }
    }
}
//-------------------------------------------------------------------------
//15_
public class Main {
    public static void main(String[] args){
        Pelicula movie = new Pelicula("Terremoto", "Kun Aguero", 120);
        movie.mostrarInformacion();
    }
}

class Pelicula {
     // Atributos
        private String titulo;
        private String director;
        private int duracionMinutos;

        public Pelicula(String titulo, String director, int duracionMinutos) {
        this.titulo = titulo;
        this.director = director;
        this.duracionMinutos = duracionMinutos;
    }
    
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracionMinutos + " minutos");
    }
}