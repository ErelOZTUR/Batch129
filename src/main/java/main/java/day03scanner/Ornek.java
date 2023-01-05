package main.java.day03scanner;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//
//        System.out.println("Lütfen yaşınızı girin");
//byte age=input.nextByte();
//
//        System.out.println("Lütfen memleketinizi giriniz....");
//        String memleket=input.nextLine();
//
//        System.out.println("lütfen yaşadığınız yeri sevip sevmediğiniz giriniz");
//        boolean seviyorMu=input.nextBoolean();
//        System.out.println("seviyorMu = " + seviyorMu);
//        System.out.println("age = " + age);
//        System.out.println("memleket = " + memleket);

//       Scanner input=new Scanner(System.in);
//        System.out.println("Lütfen ilk sayıyı giriniz..");
//        double sayi1=input.nextDouble();
//        System.out.println("Lütfen ikinci sayıyı giriniz..");
//        double sayi2=input.nextDouble();
//        System.out.println("Toplam= " + (sayi1+sayi2));
        //Ex : Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        // rakamlari toplamini yazdiran kodu yaziniz

        // input==>12345==> 1+2+4+5
        //output ==> = 12

//        Scanner input=new Scanner(System.in);
//        System.out.println("Lütfen 5 basamaklı sayı girin");
//        int num=input.nextInt();
//
//        int ilkIkıRakam=num/1000;
//        int sayi1=(ilkIkıRakam%10+ilkIkıRakam/10);
//        System.out.println(sayi1);
//        int sonIkıRakam=num%100;
//        int sayi2=(sonIkıRakam/10+sonIkıRakam%10);
//        System.out.println(sayi2);
//        System.out.println("Toplam= "+ (sayi1+sayi2));

        Scanner input=new Scanner(System.in);
//        System.out.println("Dikdörtgenin boyunu giriniz");
//        double boy=input.nextDouble();
//        System.out.println("Dikdörtgenin enini giriniz");
//        double en=input.nextDouble();
//
//        System.out.println("Çevre= " + (en+boy)*2);
//        System.out.println("Alan= " + (en*boy));
        System.out.println("Lütfen karakter giriniz");
        char ch=input.next().charAt(0);
        System.out.println(" "+" "+ch+" "+" ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);
        System.out.println("\t\t"+ch+"\t\t");
        System.out.println("\t"+ch+"\t\t"+ch+"\t");
        System.out.println(ch+"\t\t"+ch+"\t\t"+ch);

    }
}
