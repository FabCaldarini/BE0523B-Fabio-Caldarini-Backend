package it.epicode.week1.day2;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Scrivi un numero");
        int a= scanner.nextInt();
        Program(a);
    }
    public static void Program(int a){
        for (int i = a; i >= 0;i -- ) {
            System.out.println(i);
        }
    }
}
