import entities.Audio;
import entities.Image;
import entities.MultimedialContent;
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

//        System.out.println("Prova video");
//        Video video1 = new Video("Prova", 1);
//        video1.turnUpBrightness();
//        video1.lowerVolume();
//        video1.play();

        System.out.println("Prova array");
        Audio audio1 = new Audio("Prayer of the refugee", 1);
        Audio audio2 = new Audio("Californication", 1);
        Image image1 = new Image("Gimmy");
        Image image2 = new Image("Bobby");
        Video video1 = new Video("Video 1", 1);

        MultimedialContent[] array = {audio1, audio2, image1, image2, video1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Audio) {
                ((Audio) array[i]).play();
            }
            if (array[i] instanceof Image) {
                ((Image) array[i]).show();
            }
            if (array[i] instanceof Video) {
                ((Video) array[i]).play();
            }
        }
    }
}