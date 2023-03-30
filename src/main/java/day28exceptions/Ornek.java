package day28exceptions;

public class Ornek {
    public static void main(String[] args) {
        int a=12;
        int b=0;
        divide(a,b);
    }
    public static void divide(int a, int b){
       try {
           System.out.println(a/b);
       }catch (ArithmeticException e){
           System.out.println("Do not divide by zero");
       }
    }
}
