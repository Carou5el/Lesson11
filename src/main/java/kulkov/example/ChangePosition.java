package kulkov.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ChangePosition<T> {
    private T[] array;

    private void changePosition(T[] inputArray, int changeFrom, int changeTo) {
        T tempVar = inputArray[changeFrom];
        inputArray[changeFrom] = inputArray[changeFrom];
        inputArray[changeFrom] = tempVar;

    }

    private ArrayList<T> convert(T[] inputArray)    {
        ArrayList<T> arr = new ArrayList<>(Arrays.asList(inputArray));
        return arr;
    }

}
