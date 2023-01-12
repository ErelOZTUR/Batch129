package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class Deneme {
    public static void main(String[] args) {
//       ArrayList<Integer> ages=new ArrayList<>();
//        System.out.println(ages);    // []
//ages.add(9);
//ages.add(120);
//ages.add(741);
//ages.add(1,98);
//        System.out.println(ages);
//        ArrayList<Integer> newAges=new ArrayList<>();
//        newAges.add(8);
//        newAges.add(10);
//        newAges.add(756);
//        ages.addAll(newAges);
//        System.out.println(ages);
//        ages.addAll(2,newAges);
//        System.out.println(ages);
////        ages.clear();
////        System.out.println(ages);
////        boolean r =ages.contains(755);
////        System.out.println(r);
//
//        ArrayList<Integer> nums1=new ArrayList<>();
//        nums1.add(9);
//        nums1.add(8);
//        nums1.add(10);
//        ArrayList<Integer> nums2=new ArrayList<>();
//        nums2.add(8);
//        nums2.add(10);
//        nums2.add(9);
////       boolean a=nums1.equals(nums2);
////        System.out.println(a);
//        Collections.sort(nums1);
//        System.out.println(nums1);
//        Collections.sort(nums2);
//        System.out.println(nums2);
//        boolean b=nums1.equals(nums2);
//        System.out.println(b);

//        ArrayList<Character> initials=new ArrayList<>();
//        initials.add('A');
//        initials.add('B');
//        initials.add('C');
//        initials.add('D');
//        System.out.println(initials);
//      int newElements=  initials.size();
//        System.out.println(newElements);
//        char u = initials.get(2);
//        System.out.println(u);
        ArrayList<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        System.out.println(cities);

//        int sum=0;
//        for (String w:cities){
//          sum=  sum+w.length();
//            System.out.println(sum);
//        }
//        System.out.println(sum);

//        int toplam=0;
//        for (int i = 0; i <cities.size() ; i++) {
//toplam=toplam+cities.get(i).length();
//        }
//        System.out.println(toplam);
//
//        cities.set(0,"NewYork" );
//        System.out.println(cities);
        ArrayList<Double> salary=new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(13250.0);
        System.out.println(salary);
int idx=0;
        for (Double w:salary){
            salary.set(idx,w*1.55);
            idx++;
        }
        System.out.println(salary);
    }
}
