package org.darmokhval.tasks3and4;

public class ArrayRectangles {

    private final Rectangle[] array_of_rectangles;
    private int nextCellIndex;

    public ArrayRectangles(int number) {
        this.array_of_rectangles = new Rectangle[number];
        this.nextCellIndex = 0;
    }
    public ArrayRectangles(Rectangle... rectangle_array) {
        this.array_of_rectangles = rectangle_array;
        this.nextCellIndex = rectangle_array.length;
    }
    public boolean addRectangle(Rectangle rectangle) { //return value of the method is never used. Can it be fixed somehow?
        if (nextCellIndex < array_of_rectangles.length) {
            array_of_rectangles[nextCellIndex] = rectangle;
            nextCellIndex++;
            return true;
        }
        return false;
    }

    public int numberMaxArea() {
        int index = 0;
        double maxArea = array_of_rectangles[0].area();
        for (int i = 1; i < array_of_rectangles.length; i++) {
            if (maxArea < array_of_rectangles[i].area()) {
                index = i;
                maxArea = array_of_rectangles[i].area();
            }
        }
        return index;
    }

    public int numberMinPerimeter() {
        int index = 0;
        double minPerimeter = array_of_rectangles[0].perimeter();
        for (int i = 1; i < array_of_rectangles.length; i++) {
            if (minPerimeter > array_of_rectangles[i].perimeter()) {
                index = i;
                minPerimeter = array_of_rectangles[i].perimeter();
            }
        }
        return index;
    }

    public int numberSquare() {
        int count = 0;
        for (Rectangle array_of_rectangle : array_of_rectangles) {
            if (array_of_rectangle.isSquare()) {
                count++;
            }
        }
        return count;
    }
    //Better to use common or enhanced for loop in "numberSquare"?

    /*public int numberSquare() {
        int count = 0;
        for (int i = 0; i < array_of_rectangles.length; i++) {
            if (array_of_rectangles[i].isSquare()) {
                count++;
            }
        }
        return count;
    }*/

    public static void main(String[] args) {
        ArrayRectangles ar1 = new ArrayRectangles(5);
        ArrayRectangles ar2 = new ArrayRectangles(new Rectangle(3, 7), new Rectangle(1, 2),
                new Rectangle(4, 7), new Rectangle(7, 7), new Rectangle(11, 11));

        ar1.addRectangle(new Rectangle(333, 233));
        ar1.addRectangle(new Rectangle(35, 27));
        ar1.addRectangle(new Rectangle(32, 2));
        ar1.addRectangle(new Rectangle(73, 73));
        ar1.addRectangle(new Rectangle(5, 5));
        System.out.println("First constructor: ");
        System.out.println(ar1.numberMaxArea());
        System.out.println(ar1.numberMinPerimeter());
        System.out.println(ar1.numberSquare());
        System.out.println("Second constructor: ");
        System.out.println(ar2.numberMaxArea());
        System.out.println(ar2.numberMinPerimeter());
        System.out.println(ar2.numberSquare());
        }
}

