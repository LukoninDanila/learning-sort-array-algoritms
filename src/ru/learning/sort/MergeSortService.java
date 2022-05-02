package ru.learning.sort;

import java.util.Arrays;

public class MergeSortService {

  public static void mergeSort(int[] array, int left, int right) {
    System.out.println(">>>=== Insertion sort ===<<<");
    System.out.println("source array = " + Arrays.toString(array));
    internalMergeSort(array, left, right);
  }

  public static void internalMergeSort(int[] array, int left, int right) {
    if (right <= left)
      return;

    System.out.println("source array = " + Arrays.toString(array));
    int mid = (left+right)/2;
    mergeSort(array, left, mid);
    mergeSort(array, mid+1, right);
    merge(array, left, mid, right);
  }

  private static void merge(int[] array, int left, int mid, int right) {

    // calculating lengths
    int lengthLeft = mid - left + 1;
    int lengthRight = right - mid;

    // creating temporary subarrays
    int leftArray[] = new int [lengthLeft];
    int rightArray[] = new int [lengthRight];

    // copying our sorted subarrays into temporaries
    for (int i = 0; i < lengthLeft; i++) {
      leftArray[i] = array[left + i];
    }

    for (int i = 0; i < lengthRight; i++) {
      rightArray[i] = array[mid + i + 1];
    }

    // iterators containing current index of temp subarrays
    int leftIndex = 0;
    int rightIndex = 0;

    // copying from leftArray and rightArray back into array
    for (int i = left; i < right + 1; i++) {

      if (leftIndex < lengthLeft && rightIndex < lengthRight) {

        // if there are still uncopied elements in R and L, copy minimum of the two
        if (leftArray[leftIndex] < rightArray[rightIndex]) {
          array[i] = leftArray[leftIndex];
          leftIndex++;
        } else {
          array[i] = rightArray[rightIndex];
          rightIndex++;
        }

      } else if (leftIndex < lengthLeft) {
        // if all the elements have been copied from rightArray, copy the rest of leftArray
        array[i] = leftArray[leftIndex];
        leftIndex++;
      } else if (rightIndex < lengthRight) {
        // if all the elements have been copied from leftArray, copy the rest of rightArray
        array[i] = rightArray[rightIndex];
        rightIndex++;
      }
    }
  }

}
