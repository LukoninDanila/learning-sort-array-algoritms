package ru.learning.max.min;

public class MaxMinService {

  public static void getSecondMaxValue() {
    Integer max1 = 0;
    Integer max2 = 0;

    Integer[] arr = {1, 2, 4, 2, 7, 3};
    for (int i=0; i < arr.length; i++) {
      Integer tmp = max2;
      max2 = Max(arr[i], max2);
      Integer tmp2 = Min(tmp, max2);
      if (tmp2 > max1 && tmp2 < max2) {
        max1 = tmp2;
      }
    }
    System.out.println("max2 -" + max2 + "; max1 - " + max1);
  }

  private static Integer Min(Integer i1, Integer i2) {
    if (i1 >= i2) {
      return i2;
    } else {
      return i1;
    }
  }

  private static Integer Max(Integer i1, Integer i2) {
    if (i1 > i2) {
      return i1;
    } else {
      return i2;
    }
  }
}
