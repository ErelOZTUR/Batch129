package day25inheritance;

public class Honda extends Car{
    public int price = 10000;

    public void engine(){
        System.out.println("Honda engine..");
    }

    public Honda(){
        this("r8",2023);
        System.out.println("Honda 1");
    }

    public Honda(String model, int year){
        super("Audi");

        System.out.println("Honda 2: " + model + " - " + year);
    }
}
