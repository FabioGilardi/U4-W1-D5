import entities.Audio;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----MULTIMEDIAL PLAYER-----");
        System.out.println("Prova audio");
        Audio audio1 = new Audio("Prayer of the refugee", 1);
        audio1.play();
        audio1.turnUpVolume();
        audio1.play();
    }
}