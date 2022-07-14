package com.bridgelabz.oopsconcepts;

class Cars
{
    private String name;
    private int price;
    private String topSpeed;
    public Cars(String name, int price, String topSpeed)
    {
        this.name = name;
        this.price = price;
        this.topSpeed = topSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
         Cars c = new Cars("Honda City",1150000,"200kmph");
        System.out.println("Name->"+c.getName()+ "\nPrice->"+c.getPrice()+ "\nTop Speed->"+c.getTopSpeed());
    }
}