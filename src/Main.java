import entities.Audio;
import entities.Image;
import entities.MultimedialContent;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

//        System.out.println("Prova array");
//        Audio audio1 = new Audio("Prayer of the refugee", 1);
//        Audio audio2 = new Audio("Californication", 1);
//        Image image1 = new Image("Gimmy");
//        Image image2 = new Image("Bobby");
//        Video video1 = new Video("Video 1", 1);
//
//        MultimedialContent[] array = {audio1, audio2, image1, image2, video1};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] instanceof Audio) {
//                ((Audio) array[i]).play();
//            }
//            if (array[i] instanceof Image) {
//                ((Image) array[i]).show();
//            }
//            if (array[i] instanceof Video) {
//                ((Video) array[i]).play();
//            }
//        }
        System.out.println("-----MULTIMEDIAL PLAYER-----");
        System.out.println("Now you should add 5 multimedial content at your choice");
        Scanner myScanner = new Scanner(System.in);
        MultimedialContent[] multimedialContents = new MultimedialContent[5];
        for (int i = 0; i < multimedialContents.length; i++) {
            System.out.println("Type:");
            System.out.println("1 if you want an Audio");
            System.out.println("2 if you want an Image");
            System.out.println("3 if you want a Video");
            int chosenValue = Integer.parseInt(myScanner.nextLine());
            switch (chosenValue) {
                case 1: {
                    System.out.println("You have chosen Audio");
                    System.out.println("Now add the title:");
                    String audioTitle = myScanner.nextLine();
                    System.out.println("Perfect, now add the duration:");
                    int audioDuration = Integer.parseInt(myScanner.nextLine());
                    multimedialContents[i] = new Audio(audioTitle, audioDuration);
                    System.out.println("Audio has been created correctly");
                    break;
                }
                case 2: {
                    System.out.println("You have chosen Image");
                    System.out.println("Now add the title:");
                    String imageTitle = myScanner.nextLine();
                    multimedialContents[i] = new Image(imageTitle);
                    System.out.println("Image has been created correctly");
                    break;
                }
                case 3: {
                    System.out.println("You have chosen Video");
                    System.out.println("Now add the title:");
                    String videoTitle = myScanner.nextLine();
                    System.out.println("Perfect, now add the duration:");
                    int videoDuration = Integer.parseInt(myScanner.nextLine());
                    multimedialContents[i] = new Video(videoTitle, videoDuration);
                    System.out.println("Video has been created correctly");
                    break;
                }
                default: {
                    System.out.println("Check if you have written the option correctly");
                    i -= 1;
                }
            }
        }
   
        myScanner.close();
    }
}