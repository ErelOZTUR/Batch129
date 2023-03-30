package day29exceptions;

public class Ornek {
    public static void main(String[] args) {
      try {
          printAge(-18);
      }catch (IllegalArgumentException e){
          System.out.println(e.getMessage());
          System.out.println(e.getCause());
      }
    }
    public static void printAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Age must not be below zero");
        }else
            System.out.println(age);
    }
}
