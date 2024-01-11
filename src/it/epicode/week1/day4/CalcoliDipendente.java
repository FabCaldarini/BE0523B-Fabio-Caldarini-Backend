package it.epicode.week1.day4;

import java.util.Scanner;

public class CalcoliDipendente {
    public static void main(String[] args) {
        Dipendente dipendente = new Dipendente(1200.3,"123",1200,3.2,Livello.QUADRO,Dipartimento.PRODUZIONE);
    dipendente.datiDipendente();
    dipendente.promuovi();
    dipendente.datiDipendente();
    }
}
