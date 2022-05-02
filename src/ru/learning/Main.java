package ru.learning;

import ru.learning.sort.QuickSortService;

public class Main {

    public static void main(String[] args) {


        // Sorted array algorithms
        int[] source = {4, 2, 1, 5, 3};
        // BubbleSortService.bubbleSort(source);
        // InsertionSortService.insertionSort(source);
        // SelectionSortService.selectionSort(source);
        // MergeSortService.mergeSort(source, 0, source.length - 1);
        QuickSortService.quickSort(source, 0, source.length - 1);
    }


}
