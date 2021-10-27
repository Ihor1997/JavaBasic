package lesson6.Dictionary;

public class Dictionary implements Dict{

    private String[] ukWord= {"слово", "читати"};
    private String[] enWord= {"word", "read"};

    public Dictionary(){};



    @Override
    public boolean addWord(String word) {
        return false;
    }

    @Override
    public boolean delWord(String word, String translation) {
        return false;
    }

    @Override
    public String findTranslation(String word) {
        for (int i = 0; i < ukWord.length; i++) {
            if (ukWord[i].compareTo(word) == 0){
                return enWord[i];
            }
            if (enWord[i].compareTo(word) == 0){
                return ukWord[i];
            }

        }
        return "Nothing Found!";
    }
}
