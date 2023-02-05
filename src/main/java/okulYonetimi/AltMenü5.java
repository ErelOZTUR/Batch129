package okulYonetimi;

import java.util.Scanner;

public abstract class AltMenü5 {
    public abstract void add();

    public abstract void search();

    public abstract void list();

    public abstract void delete ();
    public void getAltMenü() {
        Scanner input=new Scanner(System.in);




    int select=7;
do {

    System.out.println("Lütfen Yapmak istediğiniz İşlemi Seçiniz");

            System.err.println("=================  ISLEMLER  ==========================");
            System.out.println("1-EKLEME");
            System.out.println("2-ARAMA");
            System.out.println("3-LISTELEME");
            System.out.println("4-SILME");
            System.out.println("5-ANA MENU");
            System.out.println("0-CIKIS");

    select = input.nextInt();

            switch (select) {

        case 1:
            this.add();
            break;
        case 2:
            this.search();
            break;
        case 3:
            this.list();
            break;
        case 4:
            this.delete();
            break;
        case 5:
            select=0;
            break;
        case 0:

            System.out.println("Iyi günler, tekrar bekleriz...");
       //     System.exit(0);
            break;
        default:
            System.out.println("Hatali Giris Yaptiniz!!!");
    }
}while (true);

    }

}
