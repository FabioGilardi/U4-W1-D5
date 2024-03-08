import entities.Audio;
import entities.Image;
import entities.MultimedialContent;
import entities.Video;

import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----MULTIMEDIAL PLAYER-----");
        System.out.println("Now you should add 5 multimedial content at your choice");
        Scanner myScanner = new Scanner(System.in);
        MultimedialContent[] multimedialContents = new MultimedialContent[5];
//        FILE CREATOR ----------------------------------------------------------
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
                    i -= 1; // PERCHE' DEVO FAR SI CHE L'UTENTE CREI ESATTAMENTE 5 ELEMENTI
                }
            }
        }
        System.out.println("Your file are ready to be executed");
//       FILE SELECTOR (SI CONCLUDE DOPO LA FINE DEL PLAYER CONTROL)----------------------------------------------
        int fileSelector = -1; // LA INIZIALIZZO A -1 IN QUANTO E' UN VALORE CHE NON VERRA' UTILIZZATO
        while (fileSelector != 0) {
            System.out.println("Now choose the number corresponding to the file (from 1 to 5)");
            System.out.println("Choose 0 if u want to close the player");
            fileSelector = Integer.parseInt(myScanner.nextLine());
            int playerControl = -1; // LA INIZIALIZZO A -1 IN QUANTO E' UN VALORE CHE NON VERRA' UTILIZZATO
//      PLAYER CONTROL ---------------------------------------------------------------------------
            if (fileSelector > 0 && fileSelector <= 5) {
                while (playerControl != 0) {
//                    CON QUESTO IF VERIFICO LA CLASSE DEL FILE E IN BASE A QUELLA PROPONGO LE SCELTE CONSONE ALL'UTENTE
                    if (multimedialContents[fileSelector - 1] instanceof Audio) {
                        System.out.println("Type:");
                        System.out.println("1 to turn up the volume");
                        System.out.println("2 to lower the volume");
                        System.out.println("3 to play the Audio");
                        System.out.println("0 to return back to file selection");
                        playerControl = Integer.parseInt(myScanner.nextLine());
                        switch (playerControl) {
                            case 1: {
                                ((Audio) multimedialContents[fileSelector - 1]).turnUpVolume();
                                System.out.println("Volume increased");
                                break;
                            }
                            case 2: {
                                ((Audio) multimedialContents[fileSelector - 1]).lowerVolume();
                                System.out.println("Volume lowered");
                                break;
                            }
                            case 3: {
                                ((Audio) multimedialContents[fileSelector - 1]).play();
                                break;
                            }
                            case 0: {
                                System.out.println("File closed correctly");
                                break;
                            }
                            default: {
                                System.out.println("Check if you have written the option correctly");
                            }
                        }
                    }
                    if (multimedialContents[fileSelector - 1] instanceof Image) {
                        System.out.println("Type:");
                        System.out.println("1 to turn up the brightness");
                        System.out.println("2 to lower the brightness");
                        System.out.println("3 to show the Image");
                        System.out.println("0 to return back to file selection");
                        playerControl = Integer.parseInt(myScanner.nextLine());
                        switch (playerControl) {
                            case 1: {
                                ((Image) multimedialContents[fileSelector - 1]).turnUpBrightness();
                                System.out.println("Brightness increased");
                                break;
                            }
                            case 2: {
                                ((Image) multimedialContents[fileSelector - 1]).lowerBrightness();
                                System.out.println("Brightness lowered");
                                break;
                            }
                            case 3: {
                                ((Image) multimedialContents[fileSelector - 1]).show();
                                break;
                            }
                            case 0: {
                                System.out.println("File closed correctly");
                                break;
                            }
                            default: {
                                System.out.println("Check if you have written the option correctly");
                            }
                        }
                    }
                    if (multimedialContents[fileSelector - 1] instanceof Video) {
                        System.out.println("Type:");
                        System.out.println("1 to turn up the brightness");
                        System.out.println("2 to lower the brightness");
                        System.out.println("3 to turn up the volume");
                        System.out.println("4 to lower the volume");
                        System.out.println("5 to play the Video");
                        System.out.println("0 to return back to file selection");
                        playerControl = Integer.parseInt(myScanner.nextLine());
                        switch (playerControl) {
                            case 1: {
                                ((Video) multimedialContents[fileSelector - 1]).turnUpBrightness();
                                System.out.println("Brightness increased");
                                break;
                            }
                            case 2: {
                                ((Video) multimedialContents[fileSelector - 1]).lowerBrightness();
                                System.out.println("Brightness lowered");
                                break;
                            }
                            case 3: {
                                ((Video) multimedialContents[fileSelector - 1]).turnUpVolume();
                                System.out.println("Volume increased");
                                break;
                            }
                            case 4: {
                                ((Video) multimedialContents[fileSelector - 1]).lowerVolume();
                                System.out.println("Volume lowered");
                                break;
                            }
                            case 5: {
                                ((Video) multimedialContents[fileSelector - 1]).play();
                                break;
                            }
                            case 0: {
                                System.out.println("File closed correctly");
                                break;
                            }
                            default: {
                                System.out.println("Check if you have written the option correctly");
                            }
                        }
                    }
                }
            } else if (fileSelector != 0) {
                System.out.println("There is no file corresponding to this number");
            }
        }

        System.out.println("Programme is shutting down...");
        System.out.println("Created by @Fabio Gilardi " + Year.now().getValue()); // IN MODO CHE RITORNI SEMPRE L'ANNO CORRENTE

        myScanner.close();
    }
}