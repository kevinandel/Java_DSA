package Functions;

import java.util.*;

public class Addition {

  public static int addition(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = addition(a, b);
    System.out.println("Sum is: " + sum);
    sc.close();
  }
}
