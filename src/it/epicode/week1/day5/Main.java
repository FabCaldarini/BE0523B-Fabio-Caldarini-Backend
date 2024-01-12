package it.epicode.week1.day5;

public class Main {
    public static void main(String[] args) {
        Audio player = new Audio("ciao",4,5);
        player.play();
        player.alzaVolume(5);
        player.abbassaVolume(1);

        Video videoplayer = new Video("bello",3,30,3);
        videoplayer.play();
        videoplayer.alzaLuminosità(10);
        videoplayer.play();
        videoplayer.abbassaLuminosità(5);
        videoplayer.play();
        videoplayer.alzaVolume(15);
        videoplayer.play();
        videoplayer.abbassaVolume(10);
        videoplayer.play();

        Immagini immagini  = new Immagini("spettacolo",3,10);
        immagini.show();
        immagini.alzaLuminosità(10);
        immagini.show();
        immagini.abbassaLuminosità(5);
        immagini.show();



    }

}
