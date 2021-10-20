package lesson3;

public class StringClassWork {
    public static void main(String[] args) {
//        String str1 = "Java";
//        String str2 = new String();
//        String str3 = new String(new char[]{'h','e','l','l','o'});
//        String str4 = new String(new char[]{'w','e','l','c','o','m','e'}, 3,4);
//
//        char[] helloArray = str3.toCharArray();
//        System.out.println(helloArray);
//
//
//        String s = null;
//        if (s != null&& s.length() ==0){
//            System.out.println("s");
//        }
//
//        System.out.println(str1.chars().distinct().count());
//
//        String emoji = "\uD83D\uDC7B";
//
//        System.out.println(emoji.codePoints().count());
//
//
//        char[] chars = str1.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (i == 0 || chars[i -1] == ' '){
//                chars[i] = Character.toUpperCase(chars[i]);
//            }
//
//        }
//        System.out.println(new String(chars));
//


        String test = "test 12123123 test";
        String test2 = new String("test").intern();
        System.out.println(test == test2);


        System.out.println(test+test2);


        String str = "hello world";
        String str2 ="I work";
//        int startAt = 6;
//        int endAt = 11;
//        char[] dst = new char[endAt-startAt];
//        str.getChars(startAt, endAt, dst , 0);
//        System.out.println(dst);

//        boolean result = str.regionMatches(6, str2, 2,3);

//        String result = str.replaceAll("[0-9]+","");
//        System.out.println(result);
//
//        String text = "FIFA never regret it";
//        String[] words = text.split("");
//        for (String word: words) {
//            System.out.println(word);
//        }

        String name = "Java";
        StringBuffer stringBuffer = new StringBuffer(name);
        System.out.println("Capacity: " + stringBuffer.capacity());
        stringBuffer.ensureCapacity(32);
        System.out.println("Capacity: " + stringBuffer.capacity());





    }
}
