package ru.job4j.converter;
public class Converter {
        public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl; }

        public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl; }

        public static int rubleToGbr(int value) {      /*GBR это фунты стерлинга, 1 GBR = 85 rubles*/
        int rsl = value / 85;
        return rsl; }

        public static void main(String[]args) {
        int euro = Converter.rubleToEuro(140);
        int rubles1 = euro * 70;
        System.out.println(rubles1 + " rubles are " + euro + " euro");

        int dollar = Converter.rubleToDollar(300);
        int rubles2 = dollar * 60;
        System.out.println(rubles2 + " rubles are " + dollar + " dollar");

        int gbr = Converter.rubleToGbr(170);
        int rubles3 = gbr * 85;
        System.out.println(rubles3 + " rubles are " + gbr + " gbr");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println(rubles1 + " rubles are " + euro + " euro. Test result : " + passed);

    int in1 = 300;
    int expected1 = 5;
    int out1 = rubleToDollar(in1);
    boolean passed1 = expected1 == out1;
    System.out.println(rubles2 + " rubles are " + dollar + " dollar. Test result : " + passed1);

    int in2 = 170;
    int expected2 = 2;
    int out2 = rubleToGbr(in2);
    boolean passed2 = expected2 == out2;
    System.out.println(rubles3 + " rubles are " + gbr + " gbr. Test result : " + passed2);
    }
}


