package practice.practice_nighttime.nighttime05;

import java.util.Arrays;

public class C03_KelimeleriTersSiraliArray {
    /*INTERWIEW SORUSU
    Her girdi satırı,tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
    Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasın
    tersine çevirmek için kod yazınınız.
    Çıktınızın satırlarında sonunda veya başında boşluk olmalıdır.

    Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir.
     */
    public static void main(String[] args) {
        String str = " Kemal Can Kuzu ";
        String arr[] = str.split(" ");
        String tersString = "";
        for (int i = arr.length - 1; i >= 0; i--) {

            tersString += arr[i] + " ";
        }
        System.out.print(tersString);
        System.out.println("deneme");
        System.out.print(tersString.trim());
        System.out.print("deneme");
    }
}
