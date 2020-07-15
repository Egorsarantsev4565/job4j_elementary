package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int hold = 0;
        for (int index = 2; index < number; index++) {
            hold += index;
            if (number % hold == 0) {
                prime = false;
                System.out.println("not simple");
                    break;
                } else {

                System.out.println("simple");
                    break;
                }
            }

            return prime;
        }
    }
