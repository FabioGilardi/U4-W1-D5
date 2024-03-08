package entities;

import interfaces.AudioVideo;

public class Audio extends MultimedialContent implements AudioVideo {
    //    ATTRIBUTES
    protected int duration;
    protected int volume;

    //    CONSTRUCTORS
    public Audio(String title, int duration, int volume) {
        super(title);
        this.duration = duration;
        setVolume(volume);
    }


    //    METHODS
    @Override
    public void turnUpVolume() {
        setVolume(this.volume + 1);
    }

    @Override
    public void lowerVolume() {
        setVolume(this.volume - 1);
    }

    @Override
    public void printVolume() {
        System.out.println("Volum now: " + this.volume);
        for (int i = 0; i < this.volume; i++) {
            System.out.println("!");
        }
    }

    @Override
    public void play() {
        System.out.println(this.title);
        printVolume();
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            System.out.println("You can't reduce the volume below 0");
        } else {
            if (volume > 10) {
                System.out.println("You can't raise the volume over 10");
            } else {
                this.volume = volume;
            }
        }

    }
}
