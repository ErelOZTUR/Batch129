package practice.practice_nighttime.nighttime02;

public class New01 {
    //    public static void main(String[] args) {
//        System.out.println(dikdörtgeninAlanı(4,7));
//
//
//    }//main
//    public static int dikdörtgeninAlanı(int a,int b){
//        return a*b;
//    }
    public static void main(String[] args) {
        System.out.println("dikdörtgeninCevresi(10,15) = " + dikdörtgeninCevresi(10, 15));
        System.out.println("dikdörtgeninAlanı(5,9) = " + dikdörtgeninAlanı(5, 9));
        System.out.println("kareninAlanı(7) = " + kareninAlanı(7));

    }//main

    public static int dikdörtgeninCevresi(int a, int b) {
        return 2 * (a + b);

    }

    public static int dikdörtgeninAlanı(int c, int d) {
        return c * d;
    }

    public static int kareninAlanı(int e) {
        return e * e;
    }
}
