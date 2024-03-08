package entities;

import interfaces.ImageVideo;

public class Image extends MultimedialContent implements ImageVideo {
    //    ATTRIBUTES
    int brightness = 5;

    //    CONSTRUCTORS
    public Image(String title) {
        super(title);
    }

    //    METHODS
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

    public void show() {
        if (this.brightness >= 0 && this.brightness <= 10) {
            System.out.println(this.title);
            printBrightness();
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
