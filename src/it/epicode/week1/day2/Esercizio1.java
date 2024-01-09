package it.epicode.week1.day2;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String frase= scanner.next();
        System.out.println(Pari(frase));

        int anno = scanner.nextInt();
        System.out.println(AnnoBisestile(anno));


    }

    public static boolean Pari(String frase) {
        if (frase.length() % 2 == 0) {
            System.out.println("result is even");
            return true;
        } else {
            System.out.println("result is odd");
            return false;
        }
    }

    public static boolean AnnoBisestile(int anno){
        if ((anno % 4 == 0) || (anno % 100 == 0) || (anno % 400 == 0)){
            System.out.println("anno Bisestile");
            return true;
        } else {
            System.out.println("anno non Bisestile");
            return false;
        }
    }
}
