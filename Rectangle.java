package org.darmokhval.tasks3and4;

public class Rectangle {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public Rectangle(double sideA) {
        this.sideA = sideA;
        this.sideB = 5;
    }
    public Rectangle() {
        this.sideA = 4;
        this.sideB = -3;
    }
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double area() {
        return sideA * sideB;
    }
    public double perimeter() {
        return 2 * (sideA + sideB);
    }
    public boolean isSquare() {
        return sideA == sideB;
    }
    public void replaceSides() {
        double temp = sideA;
        sideA = sideB;
        sideB = temp;
    }

    public static void main(String[] args) {
        Rectangle re = new Rectangle(3, 2);
        Rectangle re1 = new Rectangle(3);
        Rectangle re2 = new Rectangle();
        System.out.println(re.area());
        System.out.println(re.perimeter());
        System.out.println(re.isSquare());
        System.out.println(re.getSideA());
        System.out.println(re.getSideB());
        re.replaceSides();
        System.out.println(re.getSideA());
        System.out.println(re.getSideB());
        System.out.println(re1.area());
        System.out.println(re2.area());
    }
}
