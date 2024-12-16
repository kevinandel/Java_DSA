package Arrays;

import java.util.Scanner;

public class TwoDSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int m = sc.nextInt();
    int n = sc.nextInt();
    int numbers[][] = new int[m][n];
    System.out.println("Enter the elements of array: ");
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        numbers[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(numbers[i][j] + "  ");
        ;
      }
      System.out.print("\n");
    }
    System.out.println("Enter the search element: ");
    int search = sc.nextInt();
    int searchIndexOne = 0;
    int searchIndexTwo = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (numbers[i][j] == search) {
          searchIndexOne = i;
          searchIndexTwo = j;
          break;
        }
      }
    }
    System.out.println("Element found at position i: " + searchIndexOne + " and j: " + searchIndexTwo);
    sc.close();
  }
}
