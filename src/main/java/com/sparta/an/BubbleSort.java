package com.sparta.an;

public class BubbleSort {
    static int[] integerSorter(int[] numbers) {
        for (int loops = 0; loops < numbers.length - 1; loops++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                numberSwapper(numbers, i);
            }
        }
        return numbers;
    }

    private static void numberSwapper(int[] numbers, int i) {
        int temp;
        if (numbers[i] > numbers[i + 1]) {
            temp = numbers[i];
            numbers[i] = numbers[i + 1];
            numbers[i + 1] = temp;
        }
    }

    static String[] stringSorter(String[] wordsArray){
        for (int loops = 0; loops < wordsArray.length - 1; loops++){
            for (int currIndex = 0; currIndex < wordsArray.length - 1; currIndex++){
                wordSwapper(wordsArray, currIndex);
            }
        }
        return wordsArray;
    }

    private static void wordSwapper(String[] wordsArray, int currIndex) {
        String temp;
        if (wordsArray[currIndex].toLowerCase().compareTo(wordsArray[currIndex +1].toLowerCase()) >= 1){
            temp = wordsArray[currIndex];
            wordsArray[currIndex] = wordsArray[currIndex +1];
            wordsArray[currIndex + 1] = temp;
        }
    }
}
