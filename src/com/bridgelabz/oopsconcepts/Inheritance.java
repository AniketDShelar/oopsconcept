package com.bridgelabz.oopsconcepts;

class Person
{
    int seatNumber, marks;
    String name;
    void input()
    {
        System.out.println("Details of student is given below->");
    }
}
class Student extends Person
{
    void data()
    {
        name = "John"; seatNumber = 12345; marks = 87;
        System.out.println("Name -> "+name+ " \nSeat Number -> "+seatNumber+ " \nMarks -> " +marks);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.data();
    }
}