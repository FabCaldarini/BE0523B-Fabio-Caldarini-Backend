package it.epicode.week2.day1;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
        }


        System.out.print("Array iniziale: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        while (true) {
            try {
                System.out.print("Inserisci un numero (0 per uscire): ");
                int num = scanner.nextInt();
                if (num == 0) {
                    break;
                }
                System.out.print("Inserisci la posizione (da 1 a 5): ");
                int pos = scanner.nextInt();
                if (pos < 1 || pos > 5) {
                    System.out.println("Posizione non valida. Riprova.");
                    continue;
                }
                array[pos - 1] = num;


                System.out.print("Nuovo stato dell'array: ");
                for (int n : array) {
                    System.out.print(n + " ");
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Si è verificato un errore. Assicurati di inserire un numero valido.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
