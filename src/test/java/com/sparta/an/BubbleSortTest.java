package com.sparta.an;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest {
    //Sorting integers
    @Test
    @DisplayName("Is sorting in correct numerical order")
    void isSortingInCorrectNumericalOrder(){
        int[] randNumbers = {5, 3, 0, 9, 11, 17, 404, 50, 58, 36, 17, 52, 5};
        int[] expected = {0, 3, 5, 5, 9, 11, 17, 17, 36, 50, 52, 58, 404};
    Assertions.assertEquals(Arrays.toString(expected),Arrays.toString(BubbleSort.integerSorter(randNumbers)));
    }

    // Sorting Arrays and characters
@Test
@DisplayName("Is string array sorted in alphabethical order")
void isStringArraySortedInAlphabethicalOrder(){
    String[] words = {"blue", "red", "violet", "black", "white", "pink"};
    String[] expected = {"black", "blue", "pink", "red", "violet", "white"};
    Assertions.assertEquals(Arrays.toString(expected),Arrays.toString(BubbleSort.stringSorter(words)));
}

@Test
@DisplayName("Is alphabet sorted correctly")
void isAlphabetSortedCorrectly(){
    String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    String[] mixedAlphabet = {"S", "A", "D", "F", "H", "G", "L", "K", "J", "M", "B", "N", "V", "C", "X", "Z", "Q", "E", "W", "R", "T", "Y", "U", "O", "I", "P"};
    Assertions.assertEquals(Arrays.toString(alphabet),Arrays.toString(BubbleSort.stringSorter(mixedAlphabet)));
}

    @Test
    @DisplayName("When Array Has Different Letter Sizes")
    void WhenArrayHasDifferentLetterSizes(){
        String[] expected = {"An", "ban", "CoRk", "Duck", "Elephant", "Fork", "grudge", "hoax"};
        String[] unorganised = {"Duck", "ban", "Elephant", "hoax", "Fork", "An", "grudge", "CoRk"};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(BubbleSort.stringSorter(unorganised)));
    }

    @Test
    @DisplayName("When Array Has Numbers")
    void WhenArrayHasNumbers(){
        String[] expected = {"1", "5", "An", "Ban", "Cork", "Duck", "Elephant", "Fork", "Grudge", "Hoax"};
        String[] unorganised = {"Duck", "1", "Ban", "Elephant", "Hoax", "Fork", "5", "An", "Grudge", "Cork"};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(BubbleSort.stringSorter(unorganised)));
    }

    @Test
    @DisplayName("When Array Has Numbers and Different Size Letters")
    void WhenArrayHasNumbersAndDifferentSizeLetters(){
        String[] expected = {"1", "5", "An", "ban", "CoRk", "Duck", "Elephant", "Fork", "grudge", "hoax"};
        String[] unorganised = {"Duck", "1", "ban", "Elephant", "hoax", "Fork", "5", "An", "grudge", "CoRk"};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(BubbleSort.stringSorter(unorganised)));
    }

    @Test
    @DisplayName("When Array Has An Empty String")
    void WhenArrayHasAnEmptyString(){
        String[] expected = {"", "1", "5", "An", "ban", "CoRk", "Duck", "Elephant", "Fork", "grudge", "hoax"};
        String[] unorganised = {"Duck", "1", "ban", "Elephant", "", "hoax", "Fork", "5", "An", "grudge", "CoRk"};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(BubbleSort.stringSorter(unorganised)));
    }

    @Test
    @DisplayName("When Array Has An Empty String and Space")
    void WhenArrayHasAnEmptyStringAndSpace(){
        String[] expected = {"", " ", "1", "5", "An", "ban", "CoRk", "Duck", "Elephant", "Fork", "grudge", "hoax"};
        String[] unorganised = {"Duck", "1", "ban", "Elephant", " ", "hoax", "", "Fork", "5", "An", "grudge", "CoRk"};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(BubbleSort.stringSorter(unorganised)));
    }

}
