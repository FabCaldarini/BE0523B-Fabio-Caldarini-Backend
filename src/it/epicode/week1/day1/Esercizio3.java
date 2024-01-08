package it.epicode.week1.day1;

import java.util.Scanner;
public class Esercizio3 {
    public static void main(String[]args){



        Scanner scanner = new Scanner(System.in);

        double[] sides = new double[2];
        System.out.println("insert x side length : ");
        sides[0] = scanner.nextDouble();
        System.out.println("insert y side length : ");
        sides[1] = scanner.nextDouble();

        double perimetro = rettangoloPerimetro(sides[0],sides[1]);
        System.out.println(perimetro);

        int number = scanner.nextInt();
        pariDispari(number);

        double[] lato = new double [2];
        lato[0]= scanner.nextDouble();
        lato[1]= scanner.nextDouble();
        double area = areaTriangolo(lato[0],lato[1]);

    }
    public static double rettangoloPerimetro(double lato, double lato2) {
        return (lato * 2) + (lato2 * 2);
    }
    public static void pariDispari(int number){
        if (number % 2 == 0 )
             System.out.println("Pari");
        else {
             System.out.println("Dispari");
        }

    }

    public static double areaTriangolo(double a, double b){
        return (a * b)/2;
    }
}
