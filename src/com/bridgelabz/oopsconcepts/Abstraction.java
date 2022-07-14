package com.bridgelabz.oopsconcepts;
import java.util.*;
abstract class ShapeArea
{
    int length; int breadth; int base; int height;
    abstract public void printArea();
}
class Rectangle extends ShapeArea
{
    int areaOfRectangle;
    public void printArea()
    {
        System.out.println("Enter length and breadth of rectangle in cm = ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        areaOfRectangle = length * breadth;
        System.out.println("Area Of Rectangle = "+areaOfRectangle+ " sq.cm");
    }
}
class Triangle extends ShapeArea
{
    double areaOfTriangle;
    public void printArea()
    {
        System.out.println("Enter the value of base and height in cm = ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        areaOfTriangle = 0.5 * base * height;
        System.out.println("Area Of Triangle = "+areaOfTriangle+ " sq.cm");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        r.printArea();
        t.printArea();
    }
}