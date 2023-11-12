//                                    PARTE 1
//1_
package ProyectoLab.src;
import java.sql.Array;
import java.util.*;

public class Tp9Real {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>((Arrays.asList()));
        String choice="", brand="";
        while(!Objects.equals(choice, "0")){
            System.out.println("Ingrese una marca de auto");
            brand= sc.next();
            list.add(brand);
            System.out.println("Quiere seguir?");
            choice= sc.next();
            while(!Objects.equals(choice.toLowerCase(), "si") && !Objects.equals(choice.toLowerCase(), "no")){
                System.out.println("Solo se acepta si o no");
                choice= sc.next();
            }
            if(Objects.equals(choice.toLowerCase(), "si")){
                continue;
            } else break;
        }
        System.out.println("Las marcas ingresadas son: "+(list));
        
    }
}
//------------------------------------------------------------------------------------------------
//2_
class EquipoDeFutbol{
    private ArrayList<String> members;
    public EquipoDeFutbol(ArrayList<String> members){
        this.members=members;
    }
    public void showMembers(){
        System.out.println("Los miembros son "+(members));
    }
    public ArrayList<String> getMembers(){
        return members;
    }
    public void setNewMembers(ArrayList<String> NewMembers){
        members.addAll(NewMembers);
    }
    public void setDelmembers(ArrayList<String> membersTodel){
        for(String i: membersTodel){
            members.remove(i);
        }
    }
//------------------------------------------------------------------------------------------------
//3_
class Factura{
    private int nro;
    private String emisiondate;
    private String customer;
    private ArrayList<String> itemsSold;
    private ArrayList<Double> preciosUnitarios;
    private ArrayList<Integer> ammountperitem;
    private double brute;
    private double iva;
    private double neto;
    public Factura(int nro, String emisiondate, String customer, ArrayList<String> itemsSold, ArrayList<Double> preciosUnitarios, ArrayList<Integer> ammountperitem, double brute, double iva, double neto){
        this.emisiondate=emisiondate;
        this.customer=customer;
        this.itemsSold=itemsSold;
        this.preciosUnitarios=preciosUnitarios;
        this.ammountperitem=ammountperitem;
        this.brute=brute;
        this.iva=iva;
        this.neto=neto;
    }
    public void setNewArticle (ArrayList<String> nameArticles, ArrayList<Double> newpriceperunite, ArrayList<Integer> newammounts){
        itemsSold.addAll(nameArticles);
        preciosUnitarios.addAll(newpriceperunite);
        ammountperitem.addAll(newammounts);
    }
    public double subTotal(double brute, ArrayList<Double> preciosUnitarios, ArrayList<Integer> ammountperitem){
        for(int i: ammountperitem){
            for(int j=0;j<=i;j++){
                brute+=(i*preciosUnitarios.get(j));
            }
        }
        return brute;
    }
    public double iva(double brute){
        double ivabill=brute*iva;
        return ivabill;
    }
    public double total(double brute, double iva){
        return (brute*iva)+brute;
    }
}
//------------------------------------------------------------------------------------------------
//4_
package ProyectoLab.src;
import java.util.*;
import java.util.HashMap; //Diccionario
import java.util.HashSet; //Lista de elementos unicos desordenado
import java.util.TreeMap; //Diccionario ordenado de forma ascendente
import java.util.LinkedHashSet; //Lista unica ordenada por indice

public class Tp11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, greatest=0, leatest=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            System.out.println("Ingrese el numero de la casilla "+(i));
            number = sc.nextInt();
            list.add(number);
        }
        for(int i: list) {
            if (i > greatest) {
                greatest = i;
            }
        }
        leatest = greatest;
        for(int i: list){
            if(i < leatest){
                leatest = i;
            }
        }
        System.out.println("El menor es "+(leatest));
        System.out.println("El mayor es "+(greatest));
        System.out.println("La diferencia entre los dos es "+(greatest-leatest));
        //ArrayList<String> list = new ArrayList<>((Arrays.asList()));
        //String choice="", brand="";
        //while(!Objects.equals(choice, "0")){
            //System.out.println("Ingrese una marca de auto");
            //brand= sc.next();
            //list.add(brand);
            //System.out.println("Quiere seguir?");
            //choice= sc.next();
            //while(!Objects.equals(choice.toLowerCase(), "si") && !Objects.equals(choice.toLowerCase(), "no")){
            //    System.out.println("Solo se acepta si o no");
            //    choice= sc.next();
            //}
            //if(Objects.equals(choice.toLowerCase(), "si")){
            //    continue;
            //} else break;
        //}
        //System.out.println("Las marcas ingresadas son: "+(list));
        
    }

}
//------------------------------------------------------------------------------------------------
//5_
package ProyectoLab.src;
import java.util.*;
import java.util.HashMap; //Diccionario
import java.util.HashSet; //Lista de elementos unicos desordenado
import java.util.TreeMap; //Diccionario ordenado de forma ascendente
import java.util.LinkedHashSet; //Lista unica ordenada por indice

public class Tp11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=0, summatory=0, counter=0, counter_nums_idem_avrg=0, counter_lesser=0, counter_greater=0;
        Random ran = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        while(list.size() <= 20 ){
            number = ran.nextInt(1, 100);
            if(number % 2 == 0){
                counter++;
                summatory+=number;
                list.add(number);
            }
        }
        for(int i: list){
            if(i == (summatory/counter)){
                counter_nums_idem_avrg++;
            }
            if(i < (summatory/counter)){
                counter_lesser++;
            }
            if(i > (summatory/counter)){
                counter_greater++;
            }
        }

        System.out.println("El promedio aritmetico es "+(summatory/counter));
        System.out.println((counter_nums_idem_avrg)+ " son iguales/es igual al promedio");
        System.out.println((counter_lesser)+" son menores/es menor al promedio");
        System.out.println((counter_greater)+" son mayores/es mayor al promedio");
        //ArrayList<String> list = new ArrayList<>((Arrays.asList()));
        //String choice="", brand="";
        //while(!Objects.equals(choice, "0")){
            //System.out.println("Ingrese una marca de auto");
            //brand= sc.next();
            //list.add(brand);
            //System.out.println("Quiere seguir?");
            //choice= sc.next();
            //while(!Objects.equals(choice.toLowerCase(), "si") && !Objects.equals(choice.toLowerCase(), "no")){
            //    System.out.println("Solo se acepta si o no");
            //    choice= sc.next();
            //}
            //if(Objects.equals(choice.toLowerCase(), "si")){
            //    continue;
            //} else break;
        //}
        //System.out.println("Las marcas ingresadas son: "+(list));
        
    }
}


