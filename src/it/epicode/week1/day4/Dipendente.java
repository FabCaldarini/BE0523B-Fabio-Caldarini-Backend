package it.epicode.week1.day4;

import java.util.logging.Level;

public class Dipendente {
    private double stipendioBase;

    private String matricola;
    private double stipendio;
    private double ImportoOrarioStraordinario;

    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.stipendioBase = 1000;
        this.stipendio = stipendioBase;
        this.ImportoOrarioStraordinario = 30.0;
        this.livello = Livello.OPERAIO;
        this.matricola = matricola;
        this.dipartimento = dipartimento;

    }

    public Dipendente(double stipendioBase, String matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.livello = livello;
        this.dipartimento = dipartimento;
        this.stipendioBase = stipendioBase;
        this.matricola = matricola;
        this.stipendio = stipendio;
        ImportoOrarioStraordinario = importoOrarioStraordinario;


    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return ImportoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        ImportoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public  void datiDipendente() {
        System.out.println("Questo è lo stipendio base: " + stipendioBase);
        System.out.println("Questa è la matricola: " + matricola);
        System.out.println("Questo è lo stipendio:" + stipendio);
        System.out.println("Questo è l'importo dell'orario straordinario: " + ImportoOrarioStraordinario);
        System.out.println("Questo è il livello: " + livello);
        System.out.println("Questo è il dipartimento: " + dipartimento);

    }



    public  Livello promuovi() {
        if (Livello.OPERAIO == livello){
            livello = Livello.IMPIEGATO;
            stipendio *= 1.2;
            System.out.println("Sei stato promosso ad impiegato");
        } else if (Livello.IMPIEGATO == livello) {
            livello = Livello.QUADRO;
            stipendio *= 1.5;
            System.out.println("Sei stato promosso a quadro");
        } else if (Livello.QUADRO == livello) {
            livello = Livello.DIRIGENTE;
            stipendio *= 2;
            System.out.println("Sei stato promosso a dirigente");

        } else if (Livello.DIRIGENTE == livello) {
            livello = Livello.DIRIGENTE;
            System.out.println("Errore, sei già al livello massimo");
            
        }
        return livello;
    }

}

