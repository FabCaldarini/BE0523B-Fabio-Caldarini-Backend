package it.epicode.week1.day5;

public class Immagini extends Multimediali implements Mostra {
    private int luminosità;

    public Immagini(String titolo, int durata, int luminosità) {
        super(titolo, durata);
        this.luminosità = luminosità;
    }

    public void abbassaLuminosità(int luminosità) {
        if ((this.luminosità - luminosità) < 0) {
            this.luminosità = 0;
            System.out.println("Luminosità già al minimo");
        } else {
            this.luminosità -= luminosità;
            System.out.println("Luminosità decrementata a:" + this.luminosità);
        }
    }

    public void alzaLuminosità(int luminosità) {
        if ((this.luminosità + luminosità) > 100) {
            this.luminosità = 100;
            System.out.println("Luminosità già al massimo");
        } else {
            this.luminosità += luminosità;
            System.out.println("Luminosità incrementata a:" + this.luminosità);
        }
    }


    @Override
    public void show() {
        for (int i = 0; i < this.luminosità; i++) {
            System.out.print(titolo);
            for (int y = 0; y < this.luminosità; y++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
