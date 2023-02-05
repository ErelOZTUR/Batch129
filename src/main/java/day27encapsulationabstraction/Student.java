package day27encapsulationabstraction;

public class Student {
    private String stdId="AC123";
    private double gpa=3.99;
    private boolean poor=true;
    //Encapsulation yapılmış datayı okuyabilir miyiz?
    // get methodlar(getter) encapsule edilmiş(saklanmış) datayı okumamıza yarar
    //get methodlar(getter) her zaman "puplic" olur
    //get methodlar(getter) return type  i variable in data type i ile aynı olur.
    //get methodlar(getter) isimleri "get + variable name" şeklinde olur.
    //get methodlar(getter) isimleri variable boolean ise "is + variable name1" şeklinde olur.
    //get methodlar(getter) parametre kullanmazlar.
    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }
    //Encapsulation yapılmış data larin değeri değiştirilebilir mi?
    //set method lar(setter) encapsule edilmiş dataların değerlerini değiştirmemize yarar.
    //set method lar(setter)her zaman "public" olur.
    //set method lar(setter) return type i her zaman void olur.
    //set method lar(setter) isimleri "set + variable name" şeklinde olur.
    //set method lar(setter) variable ile aynı data type inda parametre kullanırlar.

    //getter ve setter ların ikisine birden "Java Beans" denir.
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
}
