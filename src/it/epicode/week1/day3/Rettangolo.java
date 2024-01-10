package it.epicode.week1.day3;

public class Rettangolo{
    private double altezza;
    private double larghezza;


    public Rettangolo(double altezza,double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcolaArea(){
        return this.altezza * this.larghezza;


    }
    public double calcolaPerimetro(){
        return (this.altezza * 2) + (this.larghezza * 2) ;
    }

    public void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo  rettangolo2){
        System.out.println("L'area del primo rettangolo è: " + rettangolo1.calcolaArea());
        System.out.println("Il perimetro del primo rettangolo è: " + rettangolo1.calcolaPerimetro());
        System.out.println("L'area del secondo rettangolo è: " + rettangolo2.calcolaArea());
        System.out.println("Il perimetro del secondo rettangolo è:" + rettangolo2.calcolaPerimetro());
        System.out.println("La somma dei perimetri è: " + (rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro()));
        System.out.println("La somma delle aree è: " + (rettangolo1.calcolaArea() + rettangolo2.calcolaArea()));
    }
}
