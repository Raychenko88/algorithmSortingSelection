package org.example;


import java.util.Arrays;

public class App {

    // Проходим по массиву
    // Ищем минимальный элемент
    // Меняеем местами первый первый и минимальный элемент
    // Повторяем пока не пройдем по всему массиву

    public static void main(String[] args) {
        int[] unsortedArray = {2, 3, 5, 1, 4, 6, 8, 7};
        System.out.println(Arrays.toString(selectionSorting(unsortedArray)));
    }

    private static int[] selectionSorting(int[] arrToSort) {
        for (int i = 0; i < arrToSort.length - 1; i++) {
            int indexMin = i;
            for (int indexToScan = i; indexToScan < arrToSort.length; indexToScan++) {
                if (arrToSort[indexMin] > arrToSort[indexToScan]) {
                    indexMin = indexToScan;
                }
                int temp = arrToSort[i];
                arrToSort[i] = arrToSort[indexMin];
                arrToSort[indexMin] = temp;
            }
        }
        return arrToSort;
    }
}
