package ru.learning.sort;

import java.util.Arrays;

public class InsertionSortService {

  public static void insertionSort(int[] array) {
    System.out.println(">>>=== Insertion sort ===<<<");
    System.out.println("source array = " + Arrays.toString(array));
    for (int i = 1; i < array.length; i++) {
      int current = array[i];
      int j = i - 1;
      while (j >= 0 && current < array[j]) {
        array[j + 1] = array[j];
        System.out.println("Addon step [" + j + "], tmpValue = " + current + ", copy [" + j + "] --> [" + (j + 1) + "] , current array = " + Arrays.toString(array));
        j--;
      }
      // at this point we've exited, so j is either -1
      // or it's at the first element where current >= a[j]
      array[j + 1] = current;
      String prefix = "change [" + i + "] <--> [" + (j + 1) + "], set tmpValue --> [" + (j + 1) + "]";
      System.out.println("Step " + i + ": " + prefix + ", current array = " + Arrays.toString(array));
    }
  }

}
