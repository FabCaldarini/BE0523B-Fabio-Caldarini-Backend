package it.epicode.week1.day5;

abstract class Multimediali {
    protected String titolo;
    protected int durata;
            public Multimediali(String titolo, int durata){
            this.titolo = titolo;
            this.durata = durata;

            }

    public String getTitolo() {
        return titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
