package lesson8.inner;

public class WrapperString {
    private String str;

    public WrapperString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public String replace(char oldChar, char newChar){

        char[] chars = new char[str.length()];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == oldChar){
                chars[i] = newChar;
                break;
            }
        }

        return new String(chars);
    }
}
