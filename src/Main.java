//import entities.Audio;

//import entities.Image;

import entities.Video;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----MULTIMEDIAL PLAYER-----");
//        System.out.println("Prova audio");
//        Audio audio1 = new Audio("Prayer of the refugee", 1);
//        audio1.play();
//        audio1.turnUpVolume();
//        audio1.play();

//        System.out.println("Prova immagine");
//        Image image1 = new Image("Bobby");
//        image1.turnUpBrightness();
//        image1.show();

        System.out.println("Prova video");
        Video video1 = new Video("Prova", 1);
        video1.turnUpBrightness();
        video1.lowerVolume();
        video1.play();
    }
}