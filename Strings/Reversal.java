package Strings;

import java.util.*;

public class Reversal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();
    String rev = new String("");
    int len = str.length();
    for (int i = 0; i < len; i++) {
      rev += str.charAt(len - 1 - i);
    }
    System.out.println(rev);
    sc.close();
  }
}
