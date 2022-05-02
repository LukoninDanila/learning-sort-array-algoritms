package ru.learning.sort;

import java.util.Arrays;

public class SelectionSortService {

  /*
   *  3 5 1 2 4
   *  1 5 3 2 4
   *  1 2 3 5 4
   *  1 2 3 5 4
   *  1 2 3 4 5
   *  1 2 3 4 5
   */
  public static void selectionSort(int[] array) {
    System.out.println(">>>=== Selection sort ===<<<");
    System.out.println("source array = " + Arrays.toString(array));

    for (int i = 0; i < array.length; i++) {

      System.out.println("Addon step A: min <<< '" + array[i] + "'[" + i +"], minId <<< " + i);

      int min = array[i];
      int minId = i;

      System.out.println("Addon step B begin from [" + (i+1) + "]");
      for (int j = i+1; j < array.length; j++) {

        if (array[j] < min) {
          System.out.println("Addon step B: '" + array[j]  + "'[" + j + "] < min=" + min + ", min <<< '" + array[j] + "'[" + minId +"]");
          min = array[j];
          minId = j;
        }
      }

      // swapping
      int temp = array[i];
      array[i] = min;
      array[minId] = temp;
      String prefix = "change [" + i + "] <--> [" + minId + "]";
      System.out.println("Step " + i + ": " + prefix + ", current array = " + Arrays.toString(array));
    }
  }

}
