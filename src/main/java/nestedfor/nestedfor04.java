package nestedfor;

public class nestedfor04 {
    public static void main(String[] args) {
        // soru 6 Asagidaki sekil cizen kodu yaziniz
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *


         */
//        int input=6;
//        for (int i = 1; i <input ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("* " +" ");
//
//            }
//            System.out.println();
//        }
//
//        for (int i = 1; i <=input ; i++) {
//            for (int j = 1; j <=input-i ; j++) {
//                System.out.print("* "+" ");
//
//            }
//            System.out.println();
//        }
        int input = 6;
        for (int i = 1; i < input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* " + " ");
            }
            System.out.println();
        }
        for (int m = 1; m <input ; m++) {
            for (int n = 5; n >m ; n--) {
                System.out.print("* " + " ");

            }
            System.out.println();
        }
    }
}
