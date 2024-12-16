package Sorting;

import java.util.*;

public class BubbleSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 6, 3, 4, 8, 1, 2 };
    int temp = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    sc.close();
  }
}
