package day20passbyvaluemethodoverloading;

public class Deneme {
    public static void main(String[] args) {

        double shirt = 100;
        double asd = discount("student", shirt);
        System.out.println(shirt);
        System.out.println(asd);

    }


    public static double discount(String state, double shirt) {

        switch (state) {
            case "student":
                shirt = shirt * 0.8;
                break;
            case "veteran":
                shirt = shirt * 0.9;
                break;
            default:
                shirt = shirt;

        }
        return shirt;
    }
}
