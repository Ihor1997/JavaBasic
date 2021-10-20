package lesson3.homework3;

public class Task4 {


    public static void main(String[] args) {
        String str1 = "test string";
        char[] chars = str1.toCharArray();
        System.out.println(chars);
        StringBuffer buffer = new StringBuffer();
        StringBuffer buffer1 = new StringBuffer();


        for (int i = 0; i < chars.length; i++) {
            if (i % 2  == 0){
                System.out.println("Appended: " +buffer.append(chars[i]));
            } else {
                buffer1.append(chars[i]);
                System.out.println("Ignored index : "+ i +" : " + chars[i]);
            }
        }
        System.out.println(buffer);
        System.out.println(buffer1);

    }
}
