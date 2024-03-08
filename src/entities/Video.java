package entities;

import interfaces.AudioVideo;
import interfaces.ImageVideo;

public class Video extends MultimedialContent implements ImageVideo, AudioVideo {
    //    ATTRIBUTES
    int duration;
    int volume = 5;
    int brightness = 5;

    //    CONSTRUCTORS
    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }


//    METHODS

    //    PLAY PART
    @Override
    public void play() {
        if (this.duration > 0 && this.volume >= 0 && this.volume <= 10 && this.brightness >= 0 && this.brightness <= 10) {
            for (int i = 0; i < duration; i++) {
                System.out.println(this.title);
            }
            printVolume();
            printBrightness();
        }
    }

    //    VOLUME PART
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

    //    BRIGHTNESS PART
    public void setBrightness(int brightness) {
        if (brightness < 0) {
            System.err.println("You can't reduce the brightness below 0");
        } else {
            if (brightness > 10) {
                System.err.println("You can't raise the brightness over 10");
            } else {
                this.brightness = brightness;
            }
        }
    }

    @Override
    public void turnUpBrightness() {
        setBrightness(this.brightness + 1);
    }

    @Override
    public void lowerBrightness() {
        setBrightness(this.brightness - 1);
    }

    @Override
    public void printBrightness() {
        for (int i = 0; i < this.brightness; i++) {
            System.out.println("*");
        }
    }

}
