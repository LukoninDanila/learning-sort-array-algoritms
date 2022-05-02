package ru.learning.sort;

import java.util.Arrays;

// O(n^2)
public class BubbleSortService {

  public static void bubbleSort(int[] array) {
    System.out.println(">>>=== Bubble sort ===<<<");
    System.out.println("source array = " + Arrays.toString(array));

    boolean sorted = false;
    int temp;
    while(!sorted) {
      sorted = true;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i+1]) {
          String prefix = "change [" + i + "] <--> [" + (i+1) + "]";
          temp = array[i];
          array[i] = array[i+1];
          array[i+1] = temp;
          sorted = false;
          System.out.println("Step " + i + ": " + prefix + ", current array = " + Arrays.toString(array));
        }
      }
    }

    System.out.println("result array = " + Arrays.toString(array));
  }

}
