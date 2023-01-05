package practice.practice_nighttime.nighttime02;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
         /*
     TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
     salona devam edeceği ay süresi
     bilgilerini alıp aylık $20 olarak toplam ücretini ekrana yazdırınız.
      */
        Scanner input = new Scanner(System.in);
        System.out.println("TechProEd Spor Salonuna Hoş geldiniz");

        System.out.println("Lütfen isim soyisim giriniz");
        String adSoyad = input.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        int yas = input.nextInt();

        System.out.println("Lütfen kilonuzu giriniz");
        double kilo = input.nextDouble();

        System.out.println("Lütfen boyunuzu giriniz");
        double boy = input.nextDouble();

        int aylık_Ucret = 20;
        System.out.println("aylık_Ucret = " + aylık_Ucret + " $");

        System.out.println("Lütfen salona kaç aya devam edeceğinizi giriniz");
        int kacAy = input.nextInt();

        int toplam_Tutar = kacAy * aylık_Ucret;

        System.out.println("toplam_Tutar = " + toplam_Tutar + " $");

        System.out.println("Tam İsim = " + adSoyad +
                "\nYasiniz : " + yas +
                "\nKilo :" + kilo +
                "\nBoyunuz :" + boy +
                "\nKaç ay devam edeceksiniz:" + kacAy + " ay" +
                "\nToplam ödeyeceğiniz miktar " + toplam_Tutar + " $");
        


    }
}
