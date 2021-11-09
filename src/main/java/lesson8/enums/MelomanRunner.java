package lesson8.enums;

import java.util.Locale;

public class MelomanRunner {
    public static void main(String[] args) {
        MusicStyle musicStyle = MusicStyle.CLASSIC;
        System.out.println(musicStyle);

        switch (musicStyle){
            case CLASSIC:
                System.out.println(" is Jazz");
                break;


            case JAZZ:
                System.out.println(" is Jazz");
                break;

            case ROCK:
                System.out.println(" is Jazz");
                break;

            case BLUES:
                System.out.println(" is Jazz");
                break;

            default:
                System.out.println("Uncnown music");
        }


        MusicStyle[] values = MusicStyle.values();
        for (MusicStyle value: values){
            System.out.println(value);
        }


        MusicStyle musicStyle1 = MusicStyle.valueOf("new_music_stile".toUpperCase());
        System.out.println(musicStyle1.ordinal());
        System.out.println(musicStyle1.name());
    }
}
