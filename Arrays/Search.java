package Arrays;

import java.util.Scanner;

public class Search {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int size = sc.nextInt();
    int numbers[] = new int[size];
    System.out.println("Enter the elements of array: ");
    for (int i = 0; i < size; i++) {
      numbers[i] = sc.nextInt();
    }
    System.out.println("Enter the search element: ");
    int search = sc.nextInt();
    int searchIndex = 0;
    for (int i = 0; i < size; i++) {
      if(numbers[i] == search) {
        searchIndex = i;
        break;
      }
    }
    System.out.println("Element found at index: " + searchIndex);
    sc.close();
  }
}
