package com.bridgelabz.oopsconcepts;

class Bank
{
    float interest;
    void getRateOfInterest()
    {
        System.out.println("Rate of Interest of different banks are as given below ->");
    }
}
class Sbi extends Bank
{
    float interest = 3.4f;
    void getRateOfInterest()
    {
        System.out.println("Rate of Interest of SBI Bank is "+interest);
    }
}
class Icici extends Bank
{
    float interest = 4.6f;
    void getRateOfInterest()
    {
        System.out.println("Rate of Interst of ICICI Bank is "+interest);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Bank b = new Bank();
        Bank i = new Icici();
        Bank sbi = new Sbi();
        b.getRateOfInterest();
        sbi.getRateOfInterest();
        i.getRateOfInterest();
    }
}
