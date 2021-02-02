package ru.job4j.calculator;

public class Fit {

        public static double manWeight(double height) {
            double rsl = (height - 100) * 1.15;
            return rsl; }

            public static double womanWeight(double height) {
            double rsl = (height - 110) * 1.15;
            return rsl; }

            public static void main(String[] args) {
            double man = Fit.manWeight((double) 185);
            double heightman = (man / 1.15 + 100);
            System.out.println("Man " + heightman + " is " + man);

            double woman = Fit.womanWeight((double) 185);
            double heightwoman = woman / 1.15 + 110;
            System.out.println("Woman " + heightwoman + " is " + woman); }

    }

