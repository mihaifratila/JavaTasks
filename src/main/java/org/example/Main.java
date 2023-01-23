package org.example;


public class Main {

    static boolean checkArrayIsSorted(int size, int[] arr) {
        for(int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if(arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4};
        System.out.println(checkArrayIsSorted(4, intArray));
    }
}