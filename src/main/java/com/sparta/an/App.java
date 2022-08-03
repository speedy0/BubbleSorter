package com.sparta.an;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] newWords = {"blue", "red", "violet", "black", "white", "pink"};
        int[] randNumbers = {5, 3, 0, 9, 11, 17, 404, 50, 58, 36, 17, 52, 5};
        System.out.println(Arrays.toString(BubbleSort.stringSorter(newWords)));
        System.out.println(Arrays.toString(BubbleSort.integerSorter(randNumbers)));
    }
}
