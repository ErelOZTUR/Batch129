package day18lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deene {
    public static void main(String[] args) {
//        List<Integer> ages = new ArrayList<>();
//        ages.add(10);
//        ages.add(25);
//        ages.add(12);
//        ages.add(8);
//        ages.add(12);
//   //     ages.remove(Integer.valueOf(12));
//       // System.out.println(ages);
//       ages.remove(ages.indexOf(12));
//        System.out.println(ages);
//        List<Integer> nums=new ArrayList<>();
//        nums.add(12);
//        nums.add(23);
//        nums.add(9);
//        nums.add(11);
//        nums.add(13);

//        System.out.println(nums);
//        Collections.sort(nums);
//        System.out.println(nums);
//        int minDiff=nums.get(1)-nums.get(0);
//        System.out.println(minDiff);
//        for (int i = 1; i <nums.size() ; i++) {
//         minDiff  = Math.min(minDiff,nums.get(i)-nums.get(i-1));
//
//        }
//        System.out.println(minDiff);
//        for (int i = 1; i <nums.size() ; i++) {
//            if (nums.get(i)-nums.get(i-1)==minDiff){
//                System.out.println(nums.get(i)+" and "+ nums.get(i-1));
//            }
//
//        }
List<Integer> nums=new ArrayList<>();
nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(12);
        nums.add(11);
        nums.set(1,27);
        System.out.println(nums);
        for (Integer w:nums){
            if (w==7){
                continue;
            }
            nums.set(nums.indexOf(w),w+3);
        }
        System.out.println(nums);

        for (int i = 0; i <nums.size() ; i++) {
int element=nums.get(i);
            if (element==7){
                continue;

            }
            nums.set(i,element+3);
        }
        System.out.println(nums);
    }
}
