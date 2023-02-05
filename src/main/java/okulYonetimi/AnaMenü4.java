package okulYonetimi;

import java.util.Scanner;

public class AnaMenü4 {
    public static void anamenü() {
        Scanner input = new Scanner(System.in);
        int select;


        do {
            System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ HOŞGELDİNİZ");
            System.out.println();
            System.out.println();
            System.out.println("==================================================================");
            System.out.println("ÖGRENCI VE ÖGRETMEN YÖNETIM PANELI");
            System.out.println("==================================================================");
            System.out.println("1-ÖGRENCI ISLEMLERI");
            System.out.println("2-ÖGRETMEN ISLEMLERI");
            System.out.println("0-CIKIS");
            select = input.nextInt();

            switch (select) {

                case 1:
//                    studentMenuService.getSelectionMenu();
                    break;
                case 2:
//                    teacherMenuService.getSelectionMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatali Giris Yaptiniz...!");
            }
        } while (true);
    }
}