package Strings;

import java.util.*;

public class UserInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();
    System.out.println("The string is: " + str);
    sc.close();
  }
}
