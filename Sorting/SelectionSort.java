package Sorting;

import java.util.Scanner;

public class SelectionSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 6, 3, 4, 8, 1, 2 };
    int temp = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      int smallest = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[smallest]) {
          smallest = j;
        }
      }
      temp = arr[i];
      arr[i] = arr[smallest];
      arr[smallest] = temp;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    sc.close();
  }
}
