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
        System.out.println();
        printE3(nums);
        System.out.println();
        printE4(nums);
        System.out.println();
        printE5(nums);
        System.out.println();
        printE6(nums);
        System.out.println();
        printE7(nums);
        System.out.println();
        getMaxValue(nums);

    }

    public static void printE1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");


        }
    }
    public static void printE2(List<Integer> nums){
        nums.stream().forEach(t -> System.out.print(t + " "));


    }
    public static void printE3(List<Integer> nums){
        nums.stream().
                filter(t -> t%2==0).
                forEach(t-> System.out.print(t + " "));


    }public static void printE4(List<Integer> nums){
        nums.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t + " "));


    }
    public static void printE5(List<Integer> nums){
        nums.stream().
                filter(t->t%2!=0).
                distinct().map(t->t*t*t).
                forEach(t-> System.out.print(t+ " "));

    }
    public static void printE6(List<Integer> nums){
      Integer sum= nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);

        System.out.println(sum);

    }
    public static void printE7(List<Integer> nums){
      Integer product=  nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(1,(t,u)->t*u);

        System.out.println(product);
    }
    public static void getMaxValue(List<Integer> nums){

Integer a= nums.stream().
        distinct().
        reduce(Integer.MIN_VALUE,(t,u)->t>u ? t: u);
        System.out.println(a);

    }
}
