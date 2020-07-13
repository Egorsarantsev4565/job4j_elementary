package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first + second + third;
        return (third > second && third > first) ? third : (second > first) ? second : first;
    }

    public static void main(String[] args) {
        int max = MultiMax.max(2, 7, 1);
        System.out.println(max);
    }
}