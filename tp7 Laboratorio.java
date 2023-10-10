//1_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = {2, 3, 4, 1, 7 ,8 , 9};
        Arrays.sort (numeros);
        for ( int i : numeros) {
            System.out.println(i);
        }

    }
}
//---------------------------------------------------------
//2_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer [] numeros = {2, 3, 4, 1, 7 ,8 , 9};
        Arrays.sort (numeros, Collections.reverseOrder());
        for ( int i : numeros) {
            System.out.println(i);
        }

    }
}
//---------------------------------------------------------
//3_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] numeros = {2.5f, 3.45f, 4.32f, 155.15f, 7.2f ,8.16f , 8.32f};
        Arrays.sort (numeros);
        for ( float i : numeros) {
            System.out.println(i);
        }

    }
}
//---------------------------------------------------------
//4_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float [] numeros = {2.5f, 3.45f, 4.32f, 155.15f, 7.2f ,8.16f , 8.32f};
        Arrays.sort (numeros, Collections.reverseOrder());
        for ( float i : numeros) {
            System.out.println(i);
        }

    }
}
//---------------------------------------------------------
//5_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] numeros = {"Mauro","Joaquin","Ana","Sabrina","Rafael"};
        Arrays.sort (numeros);
        for ( String i : numeros) {
            System.out.println(i);
        }

    }
}
//---------------------------------------------------------
//6_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] numeros = {"Mauro","Joaquin","Ana","Sabrina","Rafael"};
        Arrays.sort (numeros, Collections.reverseOrder());
        for ( String i : numeros) {
            System.out.println(i);
        }

    }
}
//---------------------------------------------------------
//7_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);;
        Iden[] array;
        array= new Iden[5];
        array[0]= new Iden("Naza", 18);
        array[1]= new Iden("Rodrigo", 19);
        array[2]= new Iden("Thomas", 18);
        array[3]= new Iden("Valen", 8);
        array[4]= new Iden("Paulo", 46);
        System.out.println("Version cruda: ");
        for (Iden j : array) {
            System.out.println(j);
        }
        Arrays.sort(array);
        System.out.println("Version ordenada de menor a mayor segun el atributo edad");
        for(Iden i: array){
            System.out.println(i);
        }
    }
}
class Iden implements Comparable<Iden>{

    private String name;
    private int age;
    public Iden(String name, int age){
        this.age=age;
        this.name=name;
    }
    public int compareTo(Iden other){
        return Integer.compare(this.age, other.age);
    }
    public String toString(){
        return "Nombre: "+name+", Edad: "+age;
    }
    public String getName(){
        return name;
    }
    class NameComparator implements Comparator<Iden>{
        public int compare(Iden o1, Iden o2){
            return o1.getName().compareTo(o2.getName());
        }
    }
}
//---------------------------------------------------------
//8_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);;
        Iden[] array;
        array= new Iden[5];
        array[0]= new Iden("Naza", 18);
        array[1]= new Iden("Rodrigo", 19);
        array[2]= new Iden("Thomas", 18);
        array[3]= new Iden("Valen", 8);
        array[4]= new Iden("Paulo", 46);
        System.out.println("Version cruda: ");
        for (Iden j : array) {
            System.out.println(j);
        }
        Arrays.sort(array, new NameComparator());
        System.out.println("Version ordenada alfabeticamente segun el atributo name");
        for(Iden i: array){
            System.out.println(i);
        }
    }
}
class Iden implements Comparable<Iden>{

    private String name;
    private int age;
    public Iden(String name, int age){
        this.age=age;
        this.name=name;
    }
    public int compareTo(Iden other){
        return Integer.compare(this.age, other.age);
    }
    public String toString(){
        return "Nombre: "+name+", Edad: "+age;
    }
    public String getName(){
        return name;
    }
}
class NameComparator implements Comparator<Iden>{
    public int compare(Iden o1, Iden o2){
        return o1.getName().compareTo(o2.getName());
    }
}

//---------------------------------------------------------
//9_
public class Main {
    public static void main(String[] args) {
        int [] array = {3,54,14,2,33,15,7,10};
        int i,j,aux;
        for (i = 0; i < array.length - 1; i++){
            for (j = 0; j < array.length - i - 1; j++){
                if (array [j+1] < array [j]){
                    aux = array [j + 1];
                    array [j + 1] = array [j];
                    array [j] = aux;
                }
            }
        }
        for (i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
//-----------------------------------------------------------
//10_
public class Main {
    public static void main(String[] args) {
        int [] array = {3,54,14,2,33,15,7,10};
        int i,j,aux,menor, pos, tmp;
        for (i = 0; i < array.length - 1; i++){
            menor = array[i];
            pos = i;
            for (j = i + 1; j < array.length ; j++){
                if (array [j] < menor) {
                    menor = array [j];
                    pos = j;
                }
            }
            if (pos != i){
                tmp = array [i];
                array [i] = array[pos];
                array [pos] = tmp;
            }
        }
        for (i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
//-----------------------------------------------------------
//11_
public class Main {
    public static void main(String[] args) {
        int [] array = {3,54,14,2,33,15,7,10};
        int i,j,aux;
        for (i = 1; i < array.length ; i++){
            aux = array[i];
            j = i - 1;
            while ((j >= 0) && (aux < array[j] )){
                array [j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;

        }
        for (i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
//-----------------------------------------------------------
//12_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);;
        int[] array={1, 4, 7, 3, 8};
        System.out.println("Forma normal");
        for(int i: array){
            System.out.println(i);
        }
        MergeSort.sort(array);
        System.out.println("Forma ascendente mediante algoritmo de mezcla");
        for(int i: array){
            System.out.println(i);
        }
        }
    }

class MergeSort {
public static void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int leftLength = mid - left + 1;
        int rightLength = right - mid;
        int[] leftArray = new int[leftLength];
        int[] rightArray = new int[rightLength];
        for (int i = 0; i < leftLength; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < rightLength; j++) {
            rightArray[j] = array[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = left;
        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < leftLength) {
            array[k++] = leftArray[i++];
        }
        while (j < rightLength) {
            array[k++] = rightArray[j++];
        }
    }
}
//-----------------------------------------------------------
//13_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);;
        int[] array={1, 4, 7, 3, 8};
        System.out.println("Forma normal");
        for(int i: array){
            System.out.println(i);
        }
        ShellSort.sort(array);
        System.out.println("Forma ascendente mediante algoritmo de shell");
for(int i: array){
            System.out.println(i);
        }
        }
    }
class ShellSort {
    public static void sort(int[] array) {
        int n = array.length;
        int gap = n / 2;
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = temp;
            }
            gap /= 2;
        }
    }
//-----------------------------------------------------------
//14_
15.	import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SelectSort sel=new SelectSort();
        BubbleSort bub= new BubbleSort();
        DirIn dir= new DirIn();
        int choice, des;
        int[] array={1, 9, 4, 2, 5, 7, 8, 6, 11, 16, 12, 13, 14, 18, 21, 17, 22, 24, 26};
        System.out.println("Cual forma de ordenamiento quiere?");
        System.out.println("1) Seleccion");
        System.out.println("2) Burbuja");
        System.out.println("3) Insercion");
        choice= sc.nextInt();
        if (choice==1){
            System.out.println("Ascendente o descendente? (0 para ascendente, 1 para descendente)");
            des=sc.nextInt();
            if(des==0){
                System.out.println("Forma normal");
                for(int i: array){
                    System.out.println(i);
                }
                sel.array(array);
                System.out.println("Forma ascendente mediante 
                algoritmo de seleccion");
                for(int i: array){
                    System.out.println(i);
                }
                }else if (des==1){
                System.out.println("Forma normal");
                for(int i: array){
                    System.out.println(i);
                }
                sel.arrayinv(array);
                System.out.println("Forma descendente mediante algoritmo de seleccion");
                for(int i: array){
                    System.out.println(i);
                }
            }
        }else if(choice==2){
            System.out.println("Ascendente o descendente? (0 para ascendente, 1 para descendente)");
            des=sc.nextInt();
            if(des==0){
                System.out.println("Forma normal");
                for(int i: array){
                    System.out.println(i);
                }
                bub.array(array);
                System.out.println("Forma ascendente mediante algoritmo de burbuja");
                for(int i: array){
                    System.out.println(i);
                }
            } else if (des==1){
                System.out.println("Forma normal");
                for(int i: array){
                    System.out.println(i);
                }
                bub.arrayinv(array);
                System.out.println("Forma descendente mediante algoritmo de burbuja");
                for(int i: array){
                    System.out.println(i);
                }
            }
        } else if (choice==3){
            System.out.println("Ascendente o descendente? (0 para ascendente, 1 para descendente)");
            des=sc.nextInt();
            if(des==0){
                System.out.println("Forma normal");
                for(int i: array){
                    System.out.println(i);
                }
                dir.array(array);
                System.out.println("Forma ascendente mediante algoritmo de insercion");
                for(int i: array){
                    System.out.println(i);
                }
            } else if (des==1){
                System.out.println("Forma normal");
                for(int i: array){
                    System.out.println(i);
                }
                dir.arrayinv(array);
                System.out.println("Forma descendente mediante algoritmo de insercion");
                for(int i: array){
                    System.out.println(i);
                }
            }
        }
    }
    }
    class DirIn{
    void array(int[] arraylocal){
        int aux, pbef, j;
        for(int i=1;i<arraylocal.length;i++){
            aux=arraylocal[i];
            pbef=i-1;
            while(pbef>=0 && aux<arraylocal[pbef]){
            arraylocal[pbef+1]=arraylocal[pbef];
            pbef--;
            }
            arraylocal[pbef+1]=aux;
        }
    }
        void arrayinv(int[] arraylocal){
            int aux, pbef, j;
            for(int i=1;i<arraylocal.length;i++){
                aux=arraylocal[i];
                pbef=i-1;
                while(pbef>=0 && aux>arraylocal[pbef]){
                    arraylocal[pbef+1]=arraylocal[pbef];
                    pbef--;
                }
                arraylocal[pbef+1]=aux;
            }
        }
    }
class SelectSort {
    void array(int[] arraylocal) {
        int n = arraylocal.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arraylocal[j] < arraylocal[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arraylocal[minIndex];
            arraylocal[minIndex] = arraylocal[i];
            arraylocal[i] = temp;
        }
    }
    void arrayinv(int[] arraylocal) {
        int n = arraylocal.length;
for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arraylocal[j] > arraylocal[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arraylocal[minIndex];
            arraylocal[minIndex] = arraylocal[i];
            arraylocal[i] = temp;
        }
    }
}
class BubbleSort{
    void array(int[] arraylocal){
        for(int i=0; i<arraylocal.length-1;++i){
            for(int j=0; j<arraylocal.length-1-i;++j){
                if(arraylocal[j]>arraylocal[j+1]){
                    int tempor=arraylocal[j];
                    arraylocal[j]=arraylocal[j+1];
                    arraylocal[j+1]=tempor;
                }
            }
        }
    }
    void arrayinv(int[] arraylocal){
        for(int i=0; i<arraylocal.length-1;++i){
            for(int j=0; j<arraylocal.length-1-i;++j){
                if(arraylocal[j]<arraylocal[j+1]){
                    int tempor=arraylocal[j];
                    arraylocal[j]=arraylocal[j+1];
                    arraylocal[j+1]=tempor;
                }
            }
        }
    }
}

