package lesson6.Dictionary;

public interface Dict {

    boolean addWord(String word);
    boolean delWord(String word, String translation);
    String  findTranslation(String word);
}
