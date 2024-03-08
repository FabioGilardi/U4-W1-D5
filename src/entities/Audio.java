package entities;

import interfaces.AudioVideo;

public class Audio extends MultimedialContent implements AudioVideo {
    //    ATTRIBUTES
    protected int duration;
    protected int volume = 5;

    //    CONSTRUCTORS
    public Audio(String title, int duration) {
        super(title);
        setDuration(duration);
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
        for (int i = 0; i < this.volume; i++) {
            System.out.println("!");
        }
    }

    @Override
    public void play() {
        if (this.duration > 0 && this.volume >= 0 && this.volume <= 10) {
            for (int i = 0; i < duration; i++) {
                System.out.println(this.title);
            }
            printVolume();
        }
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            System.err.println("You can't reduce the volume below 0");
        } else {
            if (volume > 10) {
                System.err.println("You can't raise the volume over 10");
            } else {
                this.volume = volume;
            }
        }

    }

    public void setDuration(int duration) {
        if (duration <= 0) {
            System.err.println("La durata deve essere maggiore di 0");
        } else {
            this.duration = duration;
        }
    }
}
