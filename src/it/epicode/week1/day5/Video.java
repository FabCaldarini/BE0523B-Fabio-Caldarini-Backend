package it.epicode.week1.day5;

public class Video extends Multimediali implements Riproducibile{
    private int luminosità;
    private int volume;

    public Video(String titolo, int durata,int luminosità, int volume) {
        super(titolo, durata);
        this.luminosità = luminosità;
        this.volume =  volume;

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

    public void abbassaLuminosità(int luminosità){
        if ((this.luminosità - luminosità) < 0 ){
            this.luminosità = 0;
            System.out.println("Luminosità già al minimo");
        }else {
            this.luminosità -= luminosità;
            System.out.println("Luminosità decrementata a:" + this.luminosità);
        }
    }
    public void alzaLuminosità(int luminosità){
        if ((this.luminosità + luminosità) > 100 ){
            this.luminosità = 100;
            System.out.println("Luminosità già al massimo");
        }else {
            this.luminosità += luminosità;
            System.out.println("Luminosità incrementata a:" + this.luminosità);
        }
    }



    @Override
    public void play() {
        for (int i = 0; i < this.durata; i++ ){
            System.out.print(titolo);
            for (int x = 0; x < this.volume; x++){
                System.out.print("!");}

            for (int y = 0; y < this.luminosità; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
