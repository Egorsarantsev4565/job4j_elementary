package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
       for (int index = 0; index < post.length; index++) {
           if (word[index] == post[index]) {
               result = true;
               break;
           }
       }
        return result;
    }
}
