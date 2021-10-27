package lesson6.Dictionary;

import lesson4.Main;
import lesson6.Game.MainClass2;

public  class MainClass {
    WorldTranslator worldTranslator;
    Dictionary dictionary;

    MainClass(){
        dictionary = new Dictionary();
        worldTranslator = new WorldTranslator(dictionary);
    }

    public static void main(String[] args) {
        new MainClass();
    }
}
