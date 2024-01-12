package it.epicode.week1.day5;

public class Audio extends Multimediali implements Riproducibile{
    private int volume;
    public Audio(String titolo, int durata ,int volume) {
        super(titolo, durata);
        this.volume = volume;
        this.durata = durata;

    }

    public void alzaVolume(int volume){
        if ((this.volume + volume) > 100 ){
            this.volume = 100;
            System.out.println("Volume già al massimo");
        } else { this.volume += volume ;
            System.out.println("Volume incrementato a: " + this.volume);

        }
    }



    public void abbassaVolume(int volume) {
        if ((this.volume - volume) < 0) {
            this.volume = 0;
            System.out.println("Volume già al minimo");
        } else {
            this.volume -= volume;
            System.out.println("Volume decrementato a: " + this.volume);

        }


    }

    @Override
    public void play() {
        for (int i = 0; i < this.durata; i++ ){
            System.out.print(titolo);
            for (int x = 0; x < this.volume; x++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }
}
