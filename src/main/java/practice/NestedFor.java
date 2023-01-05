package practice;

public class NestedFor {
    public static void main(String[] args) {
        //-1 line + 5
        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <= (-1*i+5) ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println(i);

        }

    }
}
