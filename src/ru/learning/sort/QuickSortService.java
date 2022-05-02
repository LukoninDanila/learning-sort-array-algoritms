package ru.learning.sort;

import java.util.Arrays;

public class QuickSortService {

  public static void quickSort(int[] array, int leftBorder, int rightBorder) {
    System.out.println(">>>=== QuickSort sort ===<<<");
    System.out.println("source array = " + Arrays.toString(array));
    sort(array, leftBorder, rightBorder);
    System.out.println("destination array = " + Arrays.toString(array));
  }

  private static void sort(int[] source, int leftBorder, int rightBorder) {
    int index;

    if (source.length > 1) {
      index = partition(source, leftBorder, rightBorder);

      if (leftBorder < index - 1) {
        System.out.println("Step sort: leftBorder: (" + source[leftBorder] + ")[" + leftBorder + "], rightBorder: (" + source[(index - 1)] + ")[" + (index - 1) +"]");
        sort(source, leftBorder, index - 1);
      }

      if (index < rightBorder) {
        System.out.println("Step sort: leftBorder: (" + source[index] + ")[" + index + "], rightBorder: (" + source[rightBorder] + ")[" + rightBorder +"]");
        sort(source, index, rightBorder);
      }
    }
  }

  private static int partition(int[] source, int leftBorder, int rightBorder) {
    int pivotIndx = (int) Math.floor((leftBorder + rightBorder) / 2);
    int pivot = source[pivotIndx];

    System.out.println("Step pivot (" + pivot + ")[" + pivotIndx +"]");

    int partitionIndx = leftBorder;
    int rightIndx = rightBorder;

    while (partitionIndx <= rightIndx) {

      while (source[partitionIndx] < pivot) {
        partitionIndx++;
      }

      while (source[rightIndx] > pivot) {
        rightIndx--;
      }

      if (partitionIndx <= rightIndx) {
        System.out.println("before swap array = " + Arrays.toString(source));
        System.out.println("swap ("+ source[partitionIndx] +")[" + partitionIndx + "]<-->(" + source[rightIndx] + ")[" + rightIndx + "]");
        swap(source, partitionIndx, rightIndx);
        System.out.println("after swap array = " + Arrays.toString(source));
        partitionIndx++;
        rightIndx--;
      }
    }

    System.out.println("return partition index = " + partitionIndx + ", (" + source[partitionIndx] + ")[" + partitionIndx + "]");

    return partitionIndx;
  }

  private static void swap(int[] source, int firstIndex, int secondIndex) {
    int temp = source[firstIndex];
    source[firstIndex] = source[secondIndex];
    source[secondIndex] = temp;
  }
}
