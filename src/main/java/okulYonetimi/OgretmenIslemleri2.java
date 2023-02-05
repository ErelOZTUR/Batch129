package okulYonetimi;

import java.util.ArrayList;

public class OgretmenIslemleri2 extends ParentsOrtakOzellikler3 {
    ArrayList<OgretmenIslemleri2>teachers=new ArrayList<>();

    //Öğretmen bilgileri
    private String teacherEpisode;
    private String teacherRegisterNo;

    public OgretmenIslemleri2(String teacherEpisode, String teacherRegisterNo) {
        super();
        this.teacherEpisode = teacherEpisode;
        this.teacherRegisterNo = teacherRegisterNo;
    }

    public String getTeacherEpisode() {
        return teacherEpisode;
    }

    public String getTeacherRegisterNo() {
        return teacherRegisterNo;
    }

    public void setTeacherEpisode(String teacherEpisode) {
        this.teacherEpisode = teacherEpisode;
    }

    public void setTeacherRegisterNo(String teacherRegisterNo) {
        this.teacherRegisterNo = teacherRegisterNo;
    }

    @Override
    public String toString() {
        return "OgretmenIslemleri{" +
                "teachers=" + teachers +
                ", teacherEpisode='" + teacherEpisode + '\'' +
                ", teacherRegisterNo='" + teacherRegisterNo + '\'' +
                "} " + super.toString();
    }
}

