package org.example.FunctionalInterface;

public class GetEvenImpl implements GetEven {
    @Override
    public int[] getEven(int[] arr) {
        int [] newArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
}
