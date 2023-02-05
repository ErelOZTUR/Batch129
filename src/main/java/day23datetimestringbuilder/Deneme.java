package day23datetimestringbuilder;

public class Deneme {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        sb1.append("Florida");

//        sb1.reverse();
//        System.out.println(sb1);
        
        for (int i = sb1.length()-1; i >=0 ; i--) {
            char a = sb1.charAt(i);
            System.out.print(a);

        }
    }
}
