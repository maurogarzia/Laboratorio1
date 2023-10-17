//1_
 import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        matrices mtrix= new matrices();
        int[][] matrizone, matriztwo, matrizres;
        matrizone= new int[2][2];
        matriztwo= new int[2][2];
        matrizres=new int[2][2];
        mtrix.llenar(matrizone);
        mtrix.llenar(matriztwo);
        matrizres=mtrix.sumarmatrices(matrizone, matriztwo);
        mtrix.mostrar(matrizres);
    }
    }
    class matrices {
        Random ran = new Random();

        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 100);
                }
            }
            return matrizlocal;
        }
        public void mostrar(int[][] matrizlocal){
            for (int i = 0; i < matrizlocal.length; i++){
                for (int j = 0; j < matrizlocal.length; j++){
                    System.out.println("Posicion "+i+":"+j+"="+matrizlocal[i][j]);
                }
            }
        }
    }
//--------------------------------------------------------------------------------
//2_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        matrices mtrix= new matrices();
        int[][] matrizone, matriztwo, matrizres;
        matrizone= new int[2][2];
        matriztwo= new int[2][2];
        matrizres=new int[2][2];
        mtrix.llenar(matrizone);
        mtrix.llenar(matriztwo);
        System.out.println("Primera matriz: ");
        mtrix.mostrar(matrizone);
        System.out.println("Segunda matriz: ");
        mtrix.mostrar(matriztwo);
        matrizres=mtrix.productomatrices(matrizone, matriztwo);
        System.out.println("Producto de las dos: ");
        mtrix.mostrar(matrizres);
    }
    }
    class matrices {
        Random ran = new Random();

        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }
        public int[][] productomatrices(int [][] mlocal1, int[][] mlocal2){
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 100);
                }
            }
            return matrizlocal;
        }
        public void mostrar(int[][] matrizlocal){
            for (int i = 0; i < matrizlocal.length; i++){
                for (int j = 0; j < matrizlocal.length; j++){
                    System.out.println("Posicion "+i+":"+j+"="+matrizlocal[i][j]);
                }
            }
        }
    }

//--------------------------------------------------------------------------------
//3_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        matrices mtrix= new matrices();
        int[][] matrizone, matriztwo, matrizres;
        matrizone= new int[2][2];
        matriztwo= new int[2][2];
        matrizres=new int[2][2];
        mtrix.llenar(matrizone);
        mtrix.llenar(matriztwo);
        System.out.println("Primera matriz: ");
        mtrix.mostrar(matrizone);
        System.out.println("Segunda matriz: ");
        mtrix.mostrar(matriztwo);
        matrizres=mtrix.productomatrices(matrizone, matriztwo);
        System.out.println("Transpuesta de las dos: ");
        System.out.println("Primera: ");
        mtrix.trans(matrizone);
        System.out.println("Segunda: ");
        mtrix.trans(matriztwo);
    }
    }
    class matrices {
        Random ran = new Random();

        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }
        public int[][] productomatrices(int [][] mlocal1, int[][] mlocal2){
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 100);
                }
            }
            return matrizlocal;
        }
        public void mostrar(int[][] matrizlocal){
            for(int i = 0; i < matrizlocal.length; i++){
                for (int j = 0; j < matrizlocal.length; j++){
                    System.out.printf("["+matrizlocal[i][j]+"]");
                }
                System.out.println();
            }
        }
        public void trans(int[][] mlocal){
            for (int i = 0; i < mlocal.length; i++){
                for (int j = 0; j < mlocal.length; j++){
                    System.out.printf("["+mlocal[j][i]+"]");
                }
                System.out.println();
            }
        }
    }
//--------------------------------------------------------------------------------
//4_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        matrices mtrix= new matrices();
        int[][] matrizone, matriztrans;
        matrizone= new int[2][2];
        matriztrans= new int[2][2];
        mtrix.llenar(matrizone);
        matriztrans=mtrix.trans(matrizone);
        System.out.println("Matriz normal: ");
        mtrix.mostrar(matrizone);
        System.out.println("Matriz transpuesta: ");
        mtrix.mostrar(matriztrans);
        System.out.println("Resultado: ");
        mtrix.isiden(matrizone, matriztrans);
    }
    }
    class matrices {
        Random ran = new Random();

        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }
        public int[][] productomatrices(int [][] mlocal1, int[][] mlocal2){
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 100);
                }
            }
            return matrizlocal;
        }
        public void mostrar(int[][] matrizlocal){
            for(int i = 0; i < matrizlocal.length; i++){
                for (int j = 0; j < matrizlocal.length; j++){
                    System.out.printf("["+matrizlocal[i][j]+"]");
                }
                System.out.println();
            }
        }
        public int[][] trans(int[][] mlocal){
            for (int i = 0; i < mlocal.length; i++){
                for (int j = 0; j < mlocal.length; j++){
                    mlocal[i][j]=mlocal[j][i];
                }

            }return mlocal;
        }
        public void isiden(int[][] mlocalnorm, int[][] mlocaltrans){
        if(mlocalnorm==mlocaltrans){
            System.out.println("Son iguales");
        }else System.out.println("No son iguales");
        }
    }
//--------------------------------------------------------------------------------
//5_
 import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        matrices mtrix= new matrices();
        int[][] matriz, matrizres;
        System.out.println("Ingrese el numero que va a multiplicar al vector");
        int numberesc= sc.nextInt();
        matriz=new int[2][2];
        matrizres=new int[2][2];
        mtrix.llenar(matriz);
        matrizres=mtrix.escproduct(matriz, numberesc);
        System.out.println("Matriz original: ");
        mtrix.mostrar(matriz);
        System.out.println("Producto escalar de "+numberesc);
        mtrix.mostrar(matrizres);
    }
    }
    class matrices {
        Random ran = new Random();

        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }
        public int[][] productomatrices(int [][] mlocal1, int[][] mlocal2){
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 100);
                }
            }
            return matrizlocal;
        }
        public void mostrar(int[][] matrizlocal){
            for(int i = 0; i < matrizlocal.length; i++){
                for (int j = 0; j < matrizlocal.length; j++){
                    System.out.printf("["+matrizlocal[i][j]+"]");
                }
                System.out.println();
            }
        }
        public int[][] trans(int[][] mlocal){
            for (int i = 0; i < mlocal.length; i++){
                for (int j = 0; j < mlocal.length; j++){
                    mlocal[i][j]=mlocal[j][i];
                }

            }return mlocal;
        }
        public void isiden(int[][] mlocalnorm, int[][] mlocaltrans){
        if(mlocalnorm==mlocaltrans){
            System.out.println("Son iguales");
        }else System.out.println("No son iguales");
        }
        public int[][] escproduct(int [][] mlocal, int number) {
            int [][] localres= new int[mlocal.length][mlocal.length];
            for(int i=0;i< mlocal.length;i++){
                for(int j=0;j<mlocal.length;j++){
                    localres[i][j]=mlocal[i][j]*number;
                }
            }return localres;
            }
        }
//--------------------------------------------------------------------------------
//6_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        matrices mtrix= new matrices();
        int[][] matriz;
        matriz=new int[4][4];
        mtrix.llenar(matriz);
        System.out.println("Matriz original: ");
        mtrix.mostrar(matriz);
        System.out.println("Suma de sus elementos: "+(mtrix.elemssum(matriz)));
    }
    }
    class matrices {
        Random ran = new Random();

        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] productomatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 100);
                }
            }
            return matrizlocal;
        }

        public void mostrar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    System.out.printf("[" + matrizlocal[i][j] + "]");
                }
                System.out.println();
            }
        }

        public int[][] trans(int[][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    mlocal[i][j] = mlocal[j][i];
                }

            }
            return mlocal;
        }

        public void isiden(int[][] mlocalnorm, int[][] mlocaltrans) {
            if (mlocalnorm == mlocaltrans) {
                System.out.println("Son iguales");
            } else System.out.println("No son iguales");
        }

        public int[][] escproduct(int[][] mlocal, int number) {
            int[][] localres = new int[mlocal.length][mlocal.length];
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    localres[i][j] = mlocal[i][j] * number;
                }
            }
            return localres;
        }

        public int elemssum(int[][] mlocal) {
            int sum = 0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    sum += mlocal[i][j];
                }
            }
            return sum;
        }
    }
//--------------------------------------------------------------------------------
//7_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        matrices mtrix= new matrices();
        int[][] matriz;
        int max=0;
        matriz=new int[4][4];
        mtrix.llenar(matriz);
        System.out.println("Matriz original: ");
        mtrix.mostrar(matriz);
        max=mtrix.maxelem(matriz);
        System.out.println("El maximo elemento de la matriz es: "+(mtrix.maxelem(matriz)));
        System.out.println("Su posicion en la matriz es: "+(mtrix.cordiinmatrix(matriz,max)+":"+(mtrix.cordjinmatrix(matriz, max))));
    }
    }
    class matrices {
        Random ran = new Random();
        public int maxelem(int [][] mlocal){
            int maxelem=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]>maxelem){
                        maxelem=mlocal[i][j];;
                    }
                }
            }return maxelem;
        }
        public int cordiinmatrix(int [][] mlocal, int cord){
            int icord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        icord=i;
                    }
                }
            }return icord;
        }
        public int cordjinmatrix(int [][] mlocal, int cord){
            int jcord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        jcord=j;
                    }
                }
            }return jcord;
        }
        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] productomatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 100);
                }
            }
            return matrizlocal;
        }

        public void mostrar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    System.out.printf("[" + matrizlocal[i][j] + "]");
                }
                System.out.println();
            }
        }

        public int[][] trans(int[][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    mlocal[i][j] = mlocal[j][i];
                }

            }
            return mlocal;
        }

        public void isiden(int[][] mlocalnorm, int[][] mlocaltrans) {
            if (mlocalnorm == mlocaltrans) {
                System.out.println("Son iguales");
            } else System.out.println("No son iguales");
        }

        public int[][] escproduct(int[][] mlocal, int number) {
            int[][] localres = new int[mlocal.length][mlocal.length];
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    localres[i][j] = mlocal[i][j] * number;
                }
            }
            return localres;
        }

        public int elemssum(int[][] mlocal) {
            int sum = 0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    sum += mlocal[i][j];
                }
            }
            return sum;
        }
    }
//--------------------------------------------------------------------------------
//8_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        matrices mtrix= new matrices();
        int[][] matriz;
        int rownumber;
        matriz=new int[4][4];
        mtrix.llenar(matriz);
        System.out.println("Matriz original: ");
        mtrix.mostrar(matriz);
        System.out.println("Ingrese el valor de la fila de la que quiere ver su suma");
        rownumber= sc.nextInt();
        System.out.println("La suma de la fila "+rownumber+" es de "+(mtrix.sumrow(matriz, rownumber)));
    }
    }
    class matrices {
        Random ran = new Random();
        public int maxelem(int [][] mlocal){
            int maxelem=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]>maxelem){
                        maxelem=mlocal[i][j];;
                    }
                }
            }return maxelem;
        }
        public int sumrow(int[][]mlocal, int numrow){
            int rowsum=0;
            for(int i = numrow; i < numrow+1; i++){
                for(int j = 0; j < mlocal.length; j++){
                    rowsum+=mlocal[i][j];
                }
            }return rowsum;
        }
        public int cordiinmatrix(int [][] mlocal, int cord){
            int icord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        icord=i;
                    }
                }
            }return icord;
        }
        public int cordjinmatrix(int [][] mlocal, int cord){
            int jcord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        jcord=j;
                    }
                }
            }return jcord;
        }
        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] productomatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 100);
                }
            }
            return matrizlocal;
        }

        public void mostrar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    System.out.printf("[" + matrizlocal[i][j] + "]");
                }
                System.out.println();
            }
        }

        public int[][] trans(int[][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    mlocal[i][j] = mlocal[j][i];
                }

            }
            return mlocal;
        }

        public void isiden(int[][] mlocalnorm, int[][] mlocaltrans) {
            if (mlocalnorm == mlocaltrans) {
                System.out.println("Son iguales");
            } else System.out.println("No son iguales");
        }

        public int[][] escproduct(int[][] mlocal, int number) {
            int[][] localres = new int[mlocal.length][mlocal.length];
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    localres[i][j] = mlocal[i][j] * number;
                }
            }
            return localres;
        }

        public int elemssum(int[][] mlocal) {
            int sum = 0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    sum += mlocal[i][j];
                }
            }
            return sum;
        }
    }
//--------------------------------------------------------------------------------
//9_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        matrices mtrix= new matrices();
        int[][] matriz;
        matriz=new int[3][3];
        mtrix.llenar(matriz);
        System.out.println("Matriz original: ");
        mtrix.mostrar(matriz);
        if(mtrix.isdiagonal(matriz)){
            System.out.println("La matriz es diagonal");
        }else System.out.println("La matriz no es diagonal");
    }
    }
    class matrices {
        Random ran = new Random();
        public int maxelem(int [][] mlocal){
            int maxelem=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]>maxelem){
                        maxelem=mlocal[i][j];;
                    }
                }
            }return maxelem;
        }
        public boolean isdiagonal(int [][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (i != j && mlocal[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        public int sumrow(int[][]mlocal, int numrow){
            int rowsum=0;
            for(int i = numrow; i < numrow+1; i++){
                for(int j = 0; j < mlocal.length; j++){
                    rowsum+=mlocal[i][j];
                }
            }return rowsum;
        }
        public int cordiinmatrix(int [][] mlocal, int cord){
            int icord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        icord=i;
                    }
                }
            }return icord;
        }
        public int cordjinmatrix(int [][] mlocal, int cord){
            int jcord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        jcord=j;
                    }
                }
            }return jcord;
        }
        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] productomatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 100);
                }
            }
            return matrizlocal;
        }

        public void mostrar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    System.out.printf("[" + matrizlocal[i][j] + "]");
                }
                System.out.println();
            }
        }
//--------------------------------------------------------------------------------
//10_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        matrices mtrix = new matrices();
        int[][] matriz;
        matriz = new int[3][3];
        mtrix.idenmatrix(matriz);
        System.out.println("Matriz identidad: ");
        mtrix.mostrar(matriz);
    }
}
    class matrices {
        Random ran = new Random();
        public int maxelem(int [][] mlocal){
            int maxelem=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]>maxelem){
                        maxelem=mlocal[i][j];;
                    }
                }
            }return maxelem;
        }
        public int[][] idenmatrix(int [][] mlocal){
            for(int i=0;i< mlocal.length;i++){
                for(int j=0; j< mlocal.length;j++){
                    if((j==0 || j==mlocal[i].length-1) && i!=0 && i!= mlocal.length-1){
                        mlocal[i][j]=0;
                    }else if(i==0 && j==0){
                        mlocal[i][j]=1;
                    }else if(i==mlocal[i].length-1 && j==mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }else if(i!=0 && i!= mlocal.length-1 && j!=0 & j!=mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }
                }
            }
            return mlocal;
        }
        public boolean isdiagonal(int [][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (i != j && mlocal[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        public int sumrow(int[][]mlocal, int numrow){
            int rowsum=0;
            for(int i = numrow; i < numrow+1; i++){
                for(int j = 0; j < mlocal.length; j++){
                    rowsum+=mlocal[i][j];
                }
            }return rowsum;
        }
        public int cordiinmatrix(int [][] mlocal, int cord){
            int icord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        icord=i;
                    }
                }
            }return icord;
        }
        public int cordjinmatrix(int [][] mlocal, int cord){
            int jcord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        jcord=j;
                    }
                }
            }return jcord;
        }
        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] productomatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 100);
                }
            }
            return matrizlocal;
        }

        public void mostrar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    System.out.printf("[" + matrizlocal[i][j] + "]");
                }
                System.out.println();
            }
        }
//--------------------------------------------------------------------------------
//11_
  import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        matrices mtrix = new matrices();
        int[][] matriz;
        matriz = new int[2][2];
        mtrix.llenar(matriz);
        System.out.println("Matriz: ");
        mtrix.mostrar(matriz);
        System.out.println("Los pares en la matriz son "+(mtrix.evens(matriz)));
        System.out.println("Los impares en la matriz son "+(mtrix.odds(matriz)));
    }
}
    class matrices {
        Random ran = new Random();
        public int maxelem(int [][] mlocal){
            int maxelem=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]>maxelem){
                        maxelem=mlocal[i][j];;
                    }
                }
            }return maxelem;
        }
        public int[][] idenmatrix(int [][] mlocal){
            for(int i=0;i< mlocal.length;i++){
                for(int j=0; j< mlocal.length;j++){
                    if((j==0 || j==mlocal[i].length-1) && i!=0 && i!= mlocal.length-1){
                        mlocal[i][j]=0;
                    }else if(i==0 && j==0){
                        mlocal[i][j]=1;
                    }else if(i==mlocal[i].length-1 && j==mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }else if(i!=0 && i!= mlocal.length-1 && j!=0 & j!=mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }
                }
            }
            return mlocal;
        }
        public boolean isdiagonal(int [][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (i != j && mlocal[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        public int evens(int [][] mlocal){
            int evens=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                if(mlocal[i][j]%2==0){
                    evens+=1;
                }
                }
            }
            return evens;
        }
        public int odds(int [][] mlocal){
            int odds=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]%2!=0){
                        odds+=1;
                    }
                }
            }
            return odds;
        }
        public int sumrow(int[][]mlocal, int numrow){
            int rowsum=0;
            for(int i = numrow; i < numrow+1; i++){
                for(int j = 0; j < mlocal.length; j++){
                    rowsum+=mlocal[i][j];
                }
            }return rowsum;
        }
        public int cordiinmatrix(int [][] mlocal, int cord){
            int icord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        icord=i;
                    }
                }
            }return icord;
        }
        public int cordjinmatrix(int [][] mlocal, int cord){
            int jcord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        jcord=j;
                    }
                }
            }return jcord;
        }
        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] productomatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 100);
                }
            }
            return matrizlocal;
        }

        public void mostrar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal.length; j++) {
                    System.out.printf("[" + matrizlocal[i][j] + "]");
                }
                System.out.println();
            }
        }
//--------------------------------------------------------------------------------
//12_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        matrices mtrix = new matrices();
        int[][] matriz, matrizgirada;
        matriz = new int[2][4];
        mtrix.llenar(matriz);
        System.out.println("Matriz original: ");
        mtrix.mostrar(matriz);
        matrizgirada=mtrix.turnninty(matriz);
        System.out.println("Matriz a 90: ");
        mtrix.mostrar(matrizgirada);
    }
}
    class matrices {
        Random ran = new Random();
        public int maxelem(int [][] mlocal){
            int maxelem=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]>maxelem){
                        maxelem=mlocal[i][j];;
                    }
                }
            }return maxelem;
        }
        public int[][] turnninty(int[][]mlocal){
            int rows = mlocal.length;
            int cols = mlocal[0].length;
            int[][] rotatedMatrix = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    rotatedMatrix[j][rows - i - 1] = mlocal[i][j];
                }
            }
            return rotatedMatrix;
        }
        public int[][] idenmatrix(int [][] mlocal){
            for(int i=0;i< mlocal.length;i++){
                for(int j=0; j< mlocal.length;j++){
                    if((j==0 || j==mlocal[i].length-1) && i!=0 && i!= mlocal.length-1){
                        mlocal[i][j]=0;
                    }else if(i==0 && j==0){
                        mlocal[i][j]=1;
                    }else if(i==mlocal[i].length-1 && j==mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }else if(i!=0 && i!= mlocal.length-1 && j!=0 & j!=mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }
                }
            }
            return mlocal;
        }
        public boolean isdiagonal(int [][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (i != j && mlocal[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        public int evens(int [][] mlocal){
            int evens=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                if(mlocal[i][j]%2==0){
                    evens+=1;
                }
                }
            }
            return evens;
        }
        public int odds(int [][] mlocal){
            int odds=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]%2!=0){
                        odds+=1;
                    }
                }
            }
            return odds;
        }
        public int sumrow(int[][]mlocal, int numrow){
            int rowsum=0;
            for(int i = numrow; i < numrow+1; i++){
                for(int j = 0; j < mlocal.length; j++){
                    rowsum+=mlocal[i][j];
                }
            }return rowsum;
        }
        public int cordiinmatrix(int [][] mlocal, int cord){
            int icord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        icord=i;
                    }
                }
            }return icord;
        }
        public int cordjinmatrix(int [][] mlocal, int cord){
            int jcord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        jcord=j;
                    }
                }
            }return jcord;
        }
        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] productomatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 101);
                }
            }
            return matrizlocal;
        }

        public void mostrar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    System.out.printf("[" + matrizlocal[i][j] + "]");
                }
                System.out.println();
            }
        }
//--------------------------------------------------------------------------------
//13_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        matrices mtrix = new matrices();
        int[][] matriz;
        int value;
        matriz = new int[4][4];
        mtrix.llenar(matriz);
        System.out.println("Matriz: ");
        mtrix.mostrar(matriz);
        System.out.println("Ingrese el valor del que desea saber su frecuencia en la matriz");
        value= sc.nextInt();
        System.out.println("El valor ingresado se repite "+(mtrix.valueinmatrix(matriz, value)+" vez/veces en la matriz"));
    }
}
    class matrices {
        Random ran = new Random();
        public int maxelem(int [][] mlocal){
            int maxelem=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]>maxelem){
                        maxelem=mlocal[i][j];;
                    }
                }
            }return maxelem;
        }
        public int[][] turnninty(int[][]mlocal){
            int rows = mlocal.length;
            int cols = mlocal[0].length;
            int[][] rotatedMatrix = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    rotatedMatrix[j][rows - i - 1] = mlocal[i][j];
                }
            }
            return rotatedMatrix;
        }
        public int[][] idenmatrix(int [][] mlocal){
            for(int i=0;i< mlocal.length;i++){
                for(int j=0; j< mlocal.length;j++){
                    if((j==0 || j==mlocal[i].length-1) && i!=0 && i!= mlocal.length-1){
                        mlocal[i][j]=0;
                    }else if(i==0 && j==0){
                        mlocal[i][j]=1;
                    }else if(i==mlocal[i].length-1 && j==mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }else if(i!=0 && i!= mlocal.length-1 && j!=0 & j!=mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }
                }
            }
            return mlocal;
        }
        public boolean isdiagonal(int [][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (i != j && mlocal[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        public int evens(int [][] mlocal){
            int evens=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                if(mlocal[i][j]%2==0){
                    evens+=1;
                }
                }
            }
            return evens;
        }
        public int valueinmatrix(int[][]mlocal, int number){
            int counter=0;
            for (int i = 0; i < mlocal.length; i++){
                for (int j = 0; j < mlocal.length; j++){
                    if(number==mlocal[i][j]){
                        counter+=1;
                    }
                }
            }
            return counter;
        }
        public int odds(int [][] mlocal){
            int odds=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]%2!=0){
                        odds+=1;
                    }
                }
            }
            return odds;
        }
        public int sumrow(int[][]mlocal, int numrow){
            int rowsum=0;
            for(int i = numrow; i < numrow+1; i++){
                for(int j = 0; j < mlocal.length; j++){
                    rowsum+=mlocal[i][j];
                }
            }return rowsum;
        }
        public int cordiinmatrix(int [][] mlocal, int cord){
            int icord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        icord=i;
                    }
                }
            }return icord;
        }
        public int cordjinmatrix(int [][] mlocal, int cord){
            int jcord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        jcord=j;
                    }
                }
            }return jcord;
        }
        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] productomatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 101);
                }
            }
            return matrizlocal;
        }

        public void mostrar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    System.out.printf("[" + matrizlocal[i][j] + "]");
                }
                System.out.println();
            }
        }
//--------------------------------------------------------------------------------
//14_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        matrices mtrix = new matrices();
        int[][] matriz, matrixinvertida;
        int value;
        matriz = new int[4][4];
        mtrix.llenar(matriz);
        System.out.println("Matriz original: ");
        mtrix.mostrar(matriz);
        matrixinvertida=mtrix.invertrows(matriz);
        System.out.println("Matrix con filas invertidas: ");
        mtrix.mostrar(matrixinvertida);
    }
}
    class matrices {
        Random ran = new Random();
        public int maxelem(int [][] mlocal){
            int maxelem=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]>maxelem){
                        maxelem=mlocal[i][j];;
                    }
                }
            }return maxelem;
        }
        public int[][] turnninty(int[][]mlocal){
            int rows = mlocal.length;
            int cols = mlocal[0].length;
            int[][] rotatedMatrix = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    rotatedMatrix[j][rows - i - 1] = mlocal[i][j];
                }
            }
            return rotatedMatrix;
        }
        public int[][] invertrows(int [][]mlocal){
            int[][] mlocalrowsinv;
            int rowslenght= mlocal.length-1;
            mlocalrowsinv=new int[mlocal.length][mlocal[0].length];
            for(int i=0;i<mlocal.length;i++){
                for(int j=0;j< mlocal[i].length;j++){
                    mlocalrowsinv[i][j]=mlocal[rowslenght][j];
                }
                rowslenght-=1;
            }return mlocalrowsinv;
        }
        public int[][] idenmatrix(int [][] mlocal){
            for(int i=0;i< mlocal.length;i++){
                for(int j=0; j< mlocal.length;j++){
                    if((j==0 || j==mlocal[i].length-1) && i!=0 && i!= mlocal.length-1){
                        mlocal[i][j]=0;
                    }else if(i==0 && j==0){
                        mlocal[i][j]=1;
                    }else if(i==mlocal[i].length-1 && j==mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }else if(i!=0 && i!= mlocal.length-1 && j!=0 & j!=mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }
                }
            }
            return mlocal;
        }
        public boolean isdiagonal(int [][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (i != j && mlocal[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        public int evens(int [][] mlocal){
            int evens=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                if(mlocal[i][j]%2==0){
                    evens+=1;
                }
                }
            }
            return evens;
        }
        public int valueinmatrix(int[][]mlocal, int number){
            int counter=0;
            for (int i = 0; i < mlocal.length; i++){
                for (int j = 0; j < mlocal.length; j++){
                    if(number==mlocal[i][j]){
                        counter+=1;
                    }
                }
            }
            return counter;
        }
        public int odds(int [][] mlocal){
            int odds=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]%2!=0){
                        odds+=1;
                    }
                }
            }
            return odds;
        }
        public int sumrow(int[][]mlocal, int numrow){
            int rowsum=0;
            for(int i = numrow; i < numrow+1; i++){
                for(int j = 0; j < mlocal.length; j++){
                    rowsum+=mlocal[i][j];
                }
            }return rowsum;
        }
        public int cordiinmatrix(int [][] mlocal, int cord){
            int icord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        icord=i;
                    }
                }
            }return icord;
        }
        public int cordjinmatrix(int [][] mlocal, int cord){
            int jcord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        jcord=j;
                    }
                }
            }return jcord;
        }
        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] productomatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 101);
                }
            }
            return matrizlocal;
        }

        public void mostrar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    System.out.printf("[" + matrizlocal[i][j] + "]");
                }
                System.out.println();
            }
        }
//--------------------------------------------------------------------------------
//15_
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        matrices mtrix = new matrices();
        int[][] matriz;
        matriz = new int[3][3];
        mtrix.llenar(matriz);
        System.out.println("Matriz: ");
        mtrix.mostrar(matriz);
        System.out.println("La suma de la primera diagonal es "+(mtrix.sumdiagonalone(matriz)));
        System.out.println("La suma de la segunda diagonal es "+(mtrix.sumdiagonaltwo(matriz)));
    }
}
    class matrices {
        Random ran = new Random();

        public int maxelem(int[][] mlocal) {
            int maxelem = 0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (mlocal[i][j] > maxelem) {
                        maxelem = mlocal[i][j];
                        ;
                    }
                }
            }
            return maxelem;
        }

        public int[][] turnninty(int[][] mlocal) {
            int rows = mlocal.length;
            int cols = mlocal[0].length;
            int[][] rotatedMatrix = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    rotatedMatrix[j][rows - i - 1] = mlocal[i][j];
                }
            }
            return rotatedMatrix;
        }

        public int[][] invertrows(int[][] mlocal) {
            int[][] mlocalrowsinv;
            int rowslenght = mlocal.length - 1;
            mlocalrowsinv = new int[mlocal.length][mlocal[0].length];
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal[i].length; j++) {
                    mlocalrowsinv[i][j] = mlocal[rowslenght][j];
                }
                rowslenght -= 1;
            }
            return mlocalrowsinv;
        }

        public int sumdiagonalone(int[][] mlocal) {
            int sumfirstdiag = 0;
            for (int i = 0; i < mlocal.length; i++) {
                sumfirstdiag += mlocal[i][i];
            }
            return sumfirstdiag;
        }
        public int sumdiagonaltwo(int[][]mlocal){
            int sumsecondiag=0;
            for(int i=0;i< mlocal.length;i++){
                sumsecondiag+=mlocal[i][mlocal.length-1-i];
            }
            return sumsecondiag;
        }
        public int[][] idenmatrix(int [][] mlocal){
            for(int i=0;i< mlocal.length;i++){
                for(int j=0; j< mlocal.length;j++){
                    if((j==0 || j==mlocal[i].length-1) && i!=0 && i!= mlocal.length-1){
                        mlocal[i][j]=0;
                    }else if(i==0 && j==0){
                        mlocal[i][j]=1;
                    }else if(i==mlocal[i].length-1 && j==mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }else if(i!=0 && i!= mlocal.length-1 && j!=0 & j!=mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }
                }
            }
            return mlocal;
        }
        public boolean isdiagonal(int [][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (i != j && mlocal[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        public int evens(int [][] mlocal){
            int evens=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                if(mlocal[i][j]%2==0){
                    evens+=1;
                }
                }
            }
            return evens;
        }
        public int valueinmatrix(int[][]mlocal, int number){
            int counter=0;
            for (int i = 0; i < mlocal.length; i++){
                for (int j = 0; j < mlocal.length; j++){
                    if(number==mlocal[i][j]){
                        counter+=1;
                    }
                }
            }
            return counter;
        }
        public int odds(int [][] mlocal){
            int odds=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]%2!=0){
                        odds+=1;
                    }
                }
            }
            return odds;
        }
        public int sumrow(int[][]mlocal, int numrow){
            int rowsum=0;
            for(int i = numrow; i < numrow+1; i++){
                for(int j = 0; j < mlocal.length; j++){
                    rowsum+=mlocal[i][j];
                }
            }return rowsum;
        }
        public int cordiinmatrix(int [][] mlocal, int cord){
            int icord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        icord=i;
                    }
                }
            }return icord;
        }
        public int cordjinmatrix(int [][] mlocal, int cord){
            int jcord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        jcord=j;
                    }
                }
            }return jcord;
        }
        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] productomatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 101);
                }
            }
            return matrizlocal;
        }

        public void mostrar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    System.out.printf("[" + matrizlocal[i][j] + "]");
                }
                System.out.println();
            }
        }
//--------------------------------------------------------------------------------
//16_
import java.util.Scanner;
import java.util.Random;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        matrices mtrix = new matrices();
        double[][] matriz={
                {1.0, 0.0},
                {0.0, 1.0}
        };
        System.out.println("Matriz: ");
        mtrix.mostrar(matriz);
        if(mtrix.esMatrizOrtogonal(matriz)){
            System.out.println("La matriz es ortogonal");
        }else System.out.println("La matriz no es ortogonal");
    }
}
    class matrices {
        public boolean esMatrizOrtogonal(double[][] matriz) {
            if (matriz.length != matriz[0].length) {
                // Verifica si la matriz es cuadrada
                return false;
            }

            int n = matriz.length;
            double[][] transpuesta = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    transpuesta[i][j] = matriz[j][i];
                }
            }

            double[][] inversa = calcularMatrizInversa(matriz);

            // Compara si la transpuesta es igual a la inversa
            return sonMatricesIguales(transpuesta, inversa);
        }
        public boolean sonMatricesIguales(double[][] matriz1, double[][] matriz2) {
            int filas = matriz1.length;
            int columnas = matriz1[0].length;
            if (filas != matriz2.length || columnas != matriz2[0].length) {
                return false;
            }

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (matriz1[i][j] != matriz2[i][j]) {
                        return false;
                    }
                }
            }

            return true;
        }
        public double[][] calcularMatrizInversa(double[][] matriz) {
            if (matriz.length != 2 || matriz[0].length != 2 || matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0] == 0) {
                return null;
            }

            double determinante = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
            double[][] inversa = new double[2][2];

            inversa[0][0] = matriz[1][1] / determinante;
            inversa[0][1] = -matriz[0][1] / determinante;
            inversa[1][0] = -matriz[1][0] / determinante;
            inversa[1][1] = matriz[0][0] / determinante;

            return inversa;
        }
        Random ran = new Random();

        public int maxelem(int[][] mlocal) {
            int maxelem = 0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (mlocal[i][j] > maxelem) {
                        maxelem = mlocal[i][j];
                        ;
                    }
                }
            }
            return maxelem;
        }

        public int[][] turnninty(int[][] mlocal) {
            int rows = mlocal.length;
            int cols = mlocal[0].length;
            int[][] rotatedMatrix = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    rotatedMatrix[j][rows - i - 1] = mlocal[i][j];
                }
            }
            return rotatedMatrix;
        }

        public int[][] invertrows(int[][] mlocal) {
            int[][] mlocalrowsinv;
            int rowslenght = mlocal.length - 1;
            mlocalrowsinv = new int[mlocal.length][mlocal[0].length];
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal[i].length; j++) {
                    mlocalrowsinv[i][j] = mlocal[rowslenght][j];
                }
                rowslenght -= 1;
            }
            return mlocalrowsinv;
        }

        public int sumdiagonalone(int[][] mlocal) {
            int sumfirstdiag = 0;
            for (int i = 0; i < mlocal.length; i++) {
                sumfirstdiag += mlocal[i][i];
            }
            return sumfirstdiag;
        }
        public int sumdiagonaltwo(int[][]mlocal){
            int sumsecondiag=0;
            for(int i=0;i< mlocal.length;i++){
                sumsecondiag+=mlocal[i][mlocal.length-1-i];
            }
            return sumsecondiag;
        }
        public int[][] idenmatrix(int [][] mlocal){
            for(int i=0;i< mlocal.length;i++){
                for(int j=0; j< mlocal.length;j++){
                    if((j==0 || j==mlocal[i].length-1) && i!=0 && i!= mlocal.length-1){
                        mlocal[i][j]=0;
                    }else if(i==0 && j==0){
                        mlocal[i][j]=1;
                    }else if(i==mlocal[i].length-1 && j==mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }else if(i!=0 && i!= mlocal.length-1 && j!=0 & j!=mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }
                }
            }
            return mlocal;
        }
        public boolean isdiagonal(int [][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (i != j && mlocal[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        public int evens(int [][] mlocal){
            int evens=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                if(mlocal[i][j]%2==0){
                    evens+=1;
                }
                }
            }
            return evens;
        }
        public int valueinmatrix(int[][]mlocal, int number){
            int counter=0;
            for (int i = 0; i < mlocal.length; i++){
                for (int j = 0; j < mlocal.length; j++){
                    if(number==mlocal[i][j]){
                        counter+=1;
                    }
                }
            }
            return counter;
        }
        public int odds(int [][] mlocal){
            int odds=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]%2!=0){
                        odds+=1;
                    }
                }
            }
            return odds;
        }
        public int sumrow(int[][]mlocal, int numrow){
            int rowsum=0;
            for(int i = numrow; i < numrow+1; i++){
                for(int j = 0; j < mlocal.length; j++){
                    rowsum+=mlocal[i][j];
                }
            }return rowsum;
        }
        public int cordiinmatrix(int [][] mlocal, int cord){
            int icord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        icord=i;
                    }
                }
            }return icord;
        }
        public int cordjinmatrix(int [][] mlocal, int cord){
            int jcord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        jcord=j;
                    }
                }
            }return jcord;
        }
        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] productomatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 101);
                }
            }
            return matrizlocal;
        }

        public void mostrar(double[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    System.out.printf("[" + matrizlocal[i][j] + "]");
                }
                System.out.println();
            }
        }
//----------------------------------------------------------------------------------
//17_	
import java.util.Scanner;
import java.util.Random;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        matrices mtrix = new matrices();
        int[][] matriz;
        int[] minsarray;
        matriz=new int[3][3];
        mtrix.llenar(matriz);
        minsarray=mtrix.mininrows(matriz);
        System.out.println("Matriz: ");
        mtrix.mostrar(matriz);
        System.out.println("Los minimos en cada filas son: ");
        mtrix.mostrararrray(minsarray);
    }
}
    class matrices {
        public boolean esMatrizOrtogonal(double[][] matriz) {
            if (matriz.length != matriz[0].length) {
                // Verifica si la matriz es cuadrada
                return false;
            }

            int n = matriz.length;
            double[][] transpuesta = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    transpuesta[i][j] = matriz[j][i];
                }
            }

            double[][] inversa = calcularMatrizInversa(matriz);

            // Compara si la transpuesta es igual a la inversa
            return sonMatricesIguales(transpuesta, inversa);
        }
        public boolean sonMatricesIguales(double[][] matriz1, double[][] matriz2) {
            int filas = matriz1.length;
            int columnas = matriz1[0].length;
            if (filas != matriz2.length || columnas != matriz2[0].length) {
                return false;
            }

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (matriz1[i][j] != matriz2[i][j]) {
                        return false;
                    }
                }
            }

            return true;
        }
        public int[] mininrows(int[][]mlocal){
            int[] minrowsarray;
            minrowsarray=new int[mlocal.length];
            int max=0, min=max;
            for(int i=0;i< mlocal.length;i++){
                for(int j=0;j<mlocal[i].length;j++){
                    if(mlocal[i][j]>max){
                        max=mlocal[i][j];
                    }
                }
            }
            min=max;
            for(int i=0;i< mlocal.length;i++){
                for(int j=0;j<mlocal[i].length;j++){
                    if(mlocal[i][j]<min){
                        min=mlocal[i][j];
                    }
                }
                minrowsarray[i]=min;
                min=max;
            }
            return minrowsarray;
        }
        public double[][] calcularMatrizInversa(double[][] matriz) {
            if (matriz.length != 2 || matriz[0].length != 2 || matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0] == 0) {
                return null;
            }

            double determinante = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
            double[][] inversa = new double[2][2];

            inversa[0][0] = matriz[1][1] / determinante;
            inversa[0][1] = -matriz[0][1] / determinante;
            inversa[1][0] = -matriz[1][0] / determinante;
            inversa[1][1] = matriz[0][0] / determinante;

            return inversa;
        }
        Random ran = new Random();

        public int maxelem(int[][] mlocal) {
            int maxelem = 0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (mlocal[i][j] > maxelem) {
                        maxelem = mlocal[i][j];
                        ;
                    }
                }
            }
            return maxelem;
        }

        public int[][] turnninty(int[][] mlocal) {
            int rows = mlocal.length;
            int cols = mlocal[0].length;
            int[][] rotatedMatrix = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    rotatedMatrix[j][rows - i - 1] = mlocal[i][j];
                }
            }
            return rotatedMatrix;
        }

        public int[][] invertrows(int[][] mlocal) {
            int[][] mlocalrowsinv;
            int rowslenght = mlocal.length - 1;
            mlocalrowsinv = new int[mlocal.length][mlocal[0].length];
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal[i].length; j++) {
                    mlocalrowsinv[i][j] = mlocal[rowslenght][j];
                }
                rowslenght -= 1;
            }
            return mlocalrowsinv;
        }

        public int sumdiagonalone(int[][] mlocal) {
            int sumfirstdiag = 0;
            for (int i = 0; i < mlocal.length; i++) {
                sumfirstdiag += mlocal[i][i];
            }
            return sumfirstdiag;
        }
        public int sumdiagonaltwo(int[][]mlocal){
            int sumsecondiag=0;
            for(int i=0;i< mlocal.length;i++){
                sumsecondiag+=mlocal[i][mlocal.length-1-i];
            }
            return sumsecondiag;
        }
        public int[][] idenmatrix(int [][] mlocal){
            for(int i=0;i< mlocal.length;i++){
                for(int j=0; j< mlocal.length;j++){
                    if((j==0 || j==mlocal[i].length-1) && i!=0 && i!= mlocal.length-1){
                        mlocal[i][j]=0;
                    }else if(i==0 && j==0){
                        mlocal[i][j]=1;
                    }else if(i==mlocal[i].length-1 && j==mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }else if(i!=0 && i!= mlocal.length-1 && j!=0 & j!=mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }
                }
            }
            return mlocal;
        }
        public boolean isdiagonal(int [][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (i != j && mlocal[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        public int evens(int [][] mlocal){
            int evens=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                if(mlocal[i][j]%2==0){
                    evens+=1;
                }
                }
            }
            return evens;
        }
        public int valueinmatrix(int[][]mlocal, int number){
            int counter=0;
            for (int i = 0; i < mlocal.length; i++){
                for (int j = 0; j < mlocal.length; j++){
                    if(number==mlocal[i][j]){
                        counter+=1;
                    }
                }
            }
            return counter;
        }
        public int odds(int [][] mlocal){
            int odds=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]%2!=0){
                        odds+=1;
                    }
                }
            }
            return odds;
        }
        public int sumrow(int[][]mlocal, int numrow){
            int rowsum=0;
            for(int i = numrow; i < numrow+1; i++){
                for(int j = 0; j < mlocal.length; j++){
                    rowsum+=mlocal[i][j];
                }
            }return rowsum;
        }
        public int cordiinmatrix(int [][] mlocal, int cord){
            int icord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        icord=i;
                    }
                }
            }return icord;
        }
        public int cordjinmatrix(int [][] mlocal, int cord){
            int jcord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        jcord=j;
                    }
                }
            }return jcord;
        }
        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] productomatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 101);
                }
            }
            return matrizlocal;
        }

        public void mostrar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    System.out.printf("[" + matrizlocal[i][j] + "]");
                }
                System.out.println();
            }
        }
        public void mostrararrray(int[] arraylocal) {
            for (int i = 0; i < arraylocal.length; i++) {
                    System.out.printf("[" + arraylocal[i] + "]");
                }
                System.out.println();
            }
        public int[][] trans(int[][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    mlocal[i][j] = mlocal[j][i];
                }

            }
            return mlocal;
        }
//------------------------------------------------------------------------------
//18_
import java.util.Scanner;
import java.util.Random;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        misc mis= new misc();
        matrices mtrix = new matrices();
        int[][] matriz, matriztwo, matrizres;
        matriz=new int[mis.randomnumber()][mis.randomnumber()];
        matriztwo=new int[mis.randomnumber()][mis.randomnumber()];
        if(matriz.length>matriztwo.length){
            matrizres=new int[matriz.length][matriz[0].length];
        }else matrizres=new int[matriztwo.length][matriztwo[0].length];
        mtrix.llenar(matriztwo);
        mtrix.llenar(matriz);
        matrizres=mtrix.multiplicarMatrices(matriz, matriztwo);
        System.out.println("Primera matriz: ");
        mtrix.mostrar(matriz);
        mtrix.llenar(matriztwo);
        System.out.println("Segunda matriz: ");
        mtrix.mostrar(matriztwo);
        if(matrizres!=null){
            System.out.println("Matriz resultante: ");
            mtrix.mostrar(matrizres);
        }else System.out.println("La matriz resultante es nula, no se pueden multiplicar las matrices ingresadas");

    }
}
class misc{
    public int randomnumber(){
        Random ran = new Random();
        int rannumber=ran.nextInt(1, 10);
        return rannumber;
    }
}
    class matrices {
            public int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
                int filasA = matrizA.length;
                int columnasA = matrizA[0].length;
                int filasB = matrizB.length;
                int columnasB = matrizB[0].length;

                if (columnasA != filasB) {
                    return null;
                }

                int[][] resultado = new int[filasA][columnasB];

                for (int i = 0; i < filasA; i++) {
                    for (int j = 0; j < columnasB; j++) {
                        int sum = 0;
                        for (int k = 0; k < columnasA; k++) {
                            sum += matrizA[i][k] * matrizB[k][j];
                        }
                        resultado[i][j] = sum;
                    }
                }

                return resultado;
            }
        public boolean esMatrizOrtogonal(double[][] matriz) {
            if (matriz.length != matriz[0].length) {
                return false;
            }

            int n = matriz.length;
            double[][] transpuesta = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    transpuesta[i][j] = matriz[j][i];
                }
            }

            double[][] inversa = calcularMatrizInversa(matriz);
            return sonMatricesIguales(transpuesta, inversa);
        }
        public boolean sonMatricesIguales(double[][] matriz1, double[][] matriz2) {
            int filas = matriz1.length;
            int columnas = matriz1[0].length;
            if (filas != matriz2.length || columnas != matriz2[0].length) {
                return false;
            }

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (matriz1[i][j] != matriz2[i][j]) {
                        return false;
                    }
                }
            }

            return true;
        }
        public int[] mininrows(int[][]mlocal){
            int[] minrowsarray;
            minrowsarray=new int[mlocal.length];
            int max=0, min=max;
            for(int i=0;i< mlocal.length;i++){
                for(int j=0;j<mlocal[i].length;j++){
                    if(mlocal[i][j]>max){
                        max=mlocal[i][j];
                    }
                }
            }
            min=max;
            for(int i=0;i< mlocal.length;i++){
                for(int j=0;j<mlocal[i].length;j++){
                    if(mlocal[i][j]<min){
                        min=mlocal[i][j];
                    }
                }
                minrowsarray[i]=min;
                min=max;
            }
            return minrowsarray;
        }
        public double[][] calcularMatrizInversa(double[][] matriz) {
            if (matriz.length != 2 || matriz[0].length != 2 || matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0] == 0) {
                return null;
            }

            double determinante = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
            double[][] inversa = new double[2][2];

            inversa[0][0] = matriz[1][1] / determinante;
            inversa[0][1] = -matriz[0][1] / determinante;
            inversa[1][0] = -matriz[1][0] / determinante;
            inversa[1][1] = matriz[0][0] / determinante;

            return inversa;
        }
        Random ran = new Random();

        public int maxelem(int[][] mlocal) {
            int maxelem = 0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (mlocal[i][j] > maxelem) {
                        maxelem = mlocal[i][j];
                        ;
                    }
                }
            }
            return maxelem;
        }

        public int[][] turnninty(int[][] mlocal) {
            int rows = mlocal.length;
            int cols = mlocal[0].length;
            int[][] rotatedMatrix = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    rotatedMatrix[j][rows - i - 1] = mlocal[i][j];
                }
            }
            return rotatedMatrix;
        }

        public int[][] invertrows(int[][] mlocal) {
            int[][] mlocalrowsinv;
            int rowslenght = mlocal.length - 1;
            mlocalrowsinv = new int[mlocal.length][mlocal[0].length];
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal[i].length; j++) {
                    mlocalrowsinv[i][j] = mlocal[rowslenght][j];
                }
                rowslenght -= 1;
            }
            return mlocalrowsinv;
        }

        public int sumdiagonalone(int[][] mlocal) {
            int sumfirstdiag = 0;
            for (int i = 0; i < mlocal.length; i++) {
                sumfirstdiag += mlocal[i][i];
            }
            return sumfirstdiag;
        }
        public int sumdiagonaltwo(int[][]mlocal){
            int sumsecondiag=0;
            for(int i=0;i< mlocal.length;i++){
                sumsecondiag+=mlocal[i][mlocal.length-1-i];
            }
            return sumsecondiag;
        }
        public int[][] idenmatrix(int [][] mlocal){
            for(int i=0;i< mlocal.length;i++){
                for(int j=0; j< mlocal.length;j++){
                    if((j==0 || j==mlocal[i].length-1) && i!=0 && i!= mlocal.length-1){
                        mlocal[i][j]=0;
                    }else if(i==0 && j==0){
                        mlocal[i][j]=1;
                    }else if(i==mlocal[i].length-1 && j==mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }else if(i!=0 && i!= mlocal.length-1 && j!=0 & j!=mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }
                }
            }
            return mlocal;
        }
        public boolean isdiagonal(int [][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (i != j && mlocal[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        public int evens(int [][] mlocal){
            int evens=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                if(mlocal[i][j]%2==0){
                    evens+=1;
                }
                }
            }
            return evens;
        }
        public int valueinmatrix(int[][]mlocal, int number){
            int counter=0;
            for (int i = 0; i < mlocal.length; i++){
                for (int j = 0; j < mlocal.length; j++){
                    if(number==mlocal[i][j]){
                        counter+=1;
                    }
                }
            }
            return counter;
        }
        public int odds(int [][] mlocal){
            int odds=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]%2!=0){
                        odds+=1;
                    }
                }
            }
            return odds;
        }
        public int sumrow(int[][]mlocal, int numrow){
            int rowsum=0;
            for(int i = numrow; i < numrow+1; i++){
                for(int j = 0; j < mlocal.length; j++){
                    rowsum+=mlocal[i][j];
                }
            }return rowsum;
        }
        public int cordiinmatrix(int [][] mlocal, int cord){
            int icord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        icord=i;
                    }
                }
            }return icord;
        }
        public int cordjinmatrix(int [][] mlocal, int cord){
            int jcord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        jcord=j;
                    }
                }
            }return jcord;
        }
        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] productomatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1[i].length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 101);
                }
            }
            return matrizlocal;
        }

        public void mostrar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    System.out.printf("[" + matrizlocal[i][j] + "]");
                }
                System.out.println();
            }
        }
