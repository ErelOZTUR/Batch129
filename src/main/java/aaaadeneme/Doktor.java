package aaaadeneme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Doktor extends VeriBankasi {
    public List<Doktor> doktorlar = new ArrayList<>();
    private String unvan;
    private String isim;
    private String soyisim;

    //clear()Map içinde bütün değerleri siler..
    // get(Object key) Anahtara karşılık gelen objeyi getirir.
    // put (Object key,Object value) Anahtar-değer ikilisini kayıt eder.
public void doktorListesi(){
    HashMap<String,String> doctor=new HashMap<String,String>();
        doctor.put("Allergist", "Wilson, Avery");
        doctor.put("Norolog", "John, Abel");
        doctor.put("Genel cerrah", "Robert, Erik");
        doctor.put("Cocuk doktoru", "Marry, Jacob");
        doctor.put("Dahiliye", "Alan, Pedro");
        doctor.put("Kardiolog", "Mahesh, Tristen");
}
    public Doktor() {

    }

    public Doktor(String unvan, String isim, String soyisim) {
        this.unvan = unvan;
        this.isim = isim;
        this.soyisim = soyisim;

    }

    public String getIsim() {

        return isim;
    }

    public void setIsim(String isim) {

        this.isim = isim;
    }

    public String getSoyisim() {

        return soyisim;
    }

    public void setSoyisim(String soyisim) {

        soyisim = soyisim;
    }

    public String getUnvan() {

        return unvan;
    }

    public void setUnvan(String unvan) {

        this.unvan = unvan;
    }

    public void doktorlar() {
    }
}
