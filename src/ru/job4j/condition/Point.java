package ru.job4j.condition;
public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int first = x1 - x2;
        int second = y1 - y2;
        double third = Math.pow(first, 2);
        double four = Math.pow(second, 2);
        double five = third + four;
        double rsl = Math.sqrt(five);
        return rsl;
    }


    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 =Point.distance(4,3,5,4);
        System.out.println("result (4,3) to (5,4) " +result1);
        double result2= Point.distance(9,7,5,2);
        System.out.println("result (9,7) to (5,2) " + result2);
    }
}