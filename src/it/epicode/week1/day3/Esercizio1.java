package it.epicode.week1.day3;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rettangolo ret1 = new Rettangolo(10,20);
        System.out.println(ret1.calcolaArea());
        System.out.println("Scegli una altezza");
        double a = scanner.nextDouble();
        System.out.println("Scegli una larghezza");
        double b = scanner.nextDouble();

        Rettangolo ret2 = new Rettangolo(a,b);
        System.out.println("risultato del perimetro: " + ret2.calcolaPerimetro());

        ret1.stampaDueRettangoli(ret1,ret2);





    }

}
