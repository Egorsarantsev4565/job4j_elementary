package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {

        if (ab + ac > bc && ac + bc > ab && ab + bc > ac) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    return ab + ac > bc && ac + bc > ab && ab + bc > ac; }

    public static void main(String[] args) {
        boolean triangle = Triangle.exist(2, 2, 2);
    }

}