package day35lambda;

import java.util.ArrayList;
import java.util.List;

public class Ornek {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        printE1(nums);
        System.out.println();
printE2(nums);
    }

    public static void printE1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");


        }
    }
    public static void printE2(List<Integer> nums){
        nums.stream().forEach(t -> System.out.print(t + " "));


    }
}
