package Project1.ProjectOne;

import java.io.Serializable;

public class Columns implements Serializable {

    //Declaring & Initializing all needed variables
    private int age;
    private int zero;
    private int one;
    private int two;
    private int three;
    private int four;
    private int five;
    private int six;
    private int seven;
    private int eight;
    private int nine;
    private int ten;
    private int eleven;
    private int twelve;
    private int thirteen;
    private int fourteen;
    private int fifteen;

    public Columns()
    {
        this.age = 1;
        this.zero = 1;
        this.one = 1;
        this.two = 1;
        this.three = 1;
        this.four = 1;
        this.five = 1;
        this.six = 1;
        this.seven = 1;
        this.eight = 1;
        this.nine = 1;
        this.ten = 1;
        this.eleven = 1;
        this.twelve = 1;
        this.thirteen = 1;
        this.fourteen = 1;
        this.fifteen = 1;
    }

    //Creating Column object, all its parameters

    public Columns(int age, int zero, int one, int two, int three, int four, int five,
                   int six, int seven, int eight, int nine, int ten,
                   int eleven, int twelve, int thirteen, int fourteen, int fifteen){

        this.age = age;
        this.zero = zero;
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.six = six;
        this.seven = seven;
        this.eight = eight;
        this.nine = nine;
        this.ten = ten;
        this.eleven = eleven;
        this.twelve = twelve;
        this.thirteen = thirteen;
        this.fourteen = fourteen;
        this.fifteen = fifteen;
    }

    //Getters and Setters

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getZero() {
        return zero;
    }

    public void setZero(int zero) {
        this.zero = zero;
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public int getThree() {
        return three;
    }

    public void setThree(int three) {
        this.three = three;
    }

    public int getFour() {
        return four;
    }

    public void setFour(int four) {
        this.four = four;
    }

    public int getFive() {
        return five;
    }

    public void setFive(int five) {
        this.five = five;
    }

    public int getSix() {
        return six;
    }

    public void setSix(int six) {
        this.six = six;
    }

    public int getSeven() {
        return seven;
    }

    public void setSeven(int seven) {
        this.seven = seven;
    }

    public int getEight() {
        return eight;
    }

    public void setEight(int eight) {
        this.eight = eight;
    }

    public int getNine() {
        return nine;
    }

    public void setNine(int nine) {
        this.nine = nine;
    }

    public int getTen() {
        return ten;
    }

    public void setTen(int ten) {
        this.ten = ten;
    }

    public int getEleven() {
        return eleven;
    }

    public void setEleven(int eleven) {
        this.eleven = eleven;
    }

    public int getTwelve() {
        return twelve;
    }

    public void setTwelve(int twelve) {
        this.twelve = twelve;
    }

    public int getThirteen() {
        return thirteen;
    }

    public void setThirteen(int thirteen) {
        this.thirteen = thirteen;
    }

    public int getFourteen() {
        return fourteen;
    }

    public void setFourteen(int fourteen) {
        this.fourteen = fourteen;
    }

    public int getFifteen() {
        return fifteen;
    }

    public void setFifteen(int fifteen) {
        this.fifteen = fifteen;
    }
}
