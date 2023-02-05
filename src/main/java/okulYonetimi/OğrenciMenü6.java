package okulYonetimi;

import java.util.Scanner;

public class OğrenciMenü6 extends AltMenü5 {
OgrenciIslemleri1 std=new OgrenciIslemleri1();
Scanner input=new Scanner(System.in);


    @Override
    public void add() {
        System.out.println("Lütfen ismi giriniz");
        std.setFirstName(input.nextLine());
        System.out.println("Lütfen soyisim giriniz");
        std.setLastName(input.nextLine());
        System.out.println("Lütfen kimlik numaranizi giriniz: ");
        std.setId(input.nextLine());
        System.out.println("Lütfen yasinizi giriniz: ");
        std.setAge(input.nextInt());
        System.out.println("Lütfen sinifinizi giriniz: ");
        std.setStudentEpisode(input.next());
//std.students();

    }

    @Override
    public void search() {

    }

    @Override
    public void list() {

    }

    @Override
    public void delete() {

    }
}
