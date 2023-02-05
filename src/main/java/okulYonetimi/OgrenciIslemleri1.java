package okulYonetimi;

import java.util.ArrayList;

public class OgrenciIslemleri1 extends ParentsOrtakOzellikler3 {
    public ArrayList<OgrenciIslemleri1>students=new ArrayList<>();
  //Öğrenci Bilgileri
private String studentEpisode;
private String studentRegisterNo;

    public OgrenciIslemleri1() {

    }

    public String getStudentEpisode() {

        return studentEpisode;
    }

    public String getStudentRegisterNo() {
        return studentRegisterNo;
    }

    public void setStudentEpisode(String studentEpisode) {
        this.studentEpisode = studentEpisode;
    }

    public void setStudentRegisterNo(String studentRegisterNo) {
        this.studentRegisterNo = studentRegisterNo;
    }

    public OgrenciIslemleri1(String studentEpisode, String studentRegisterNo, String firsttname, String lastName, String id, int age) {
        this.studentEpisode = studentEpisode;
        this.studentRegisterNo = studentRegisterNo;
        super.setFirstName(firsttname);
        super.setLastName(lastName);
        super.setId(id);
        super.setAge(age);

    }

    @Override
    public String toString() {
        return "OgrenciIslemleri{" +
                "students=" + students +
                ", studentEpisode='" + studentEpisode + '\'' +
                ", studentRegisterNo='" + studentRegisterNo + '\'' +
                "} " + super.toString();
    }


}



