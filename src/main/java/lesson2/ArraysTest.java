package lesson2;

public class ArraysTest {

    public static void main(String[] args) {
        int[] array = {3,43,32,54,3};
        int x;
//        Random random = new Random();
//        int indefiend;
//
//        for (int i = 0; i < m ; i++) {
//            for (int j = 0; j < n; j++) {
//                indefiend = random.nextInt(40);
//                array[i][j] = indefiend;
//            }
//        }
//
//        for (int i = 0; i < m ; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(array[i][j]+"  ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < array.length -1 ; i++) {
            for (int j = i; j >=0 ; j--) {
                if (array[j] > array[i +1]){
                    x = array[j];
                    array[j] = array[j +1];
                    array[j +1] = x;
                }

            }

        }


    }
}
