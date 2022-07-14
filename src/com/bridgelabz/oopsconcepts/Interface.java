package com.bridgelabz.oopsconcepts;

interface Language
{
    void getName(String name);
}
class LanguagesOfProgramming implements Language
{
    @Override
    public void getName(String name) {
        System.out.println("Programming Language are given below \n"+name);
    }
}
public class Interface {
    public static void main(String[] args) {
        LanguagesOfProgramming lop = new LanguagesOfProgramming();
        lop.getName("JAVA, PYTHON, HTML, CSS");
    }
}