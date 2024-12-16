package Strings;

import java.util.*;

public class Concatenation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first name: ");
    String firstname = sc.nextLine();
    System.out.println("Enter last name: ");
    String lastname = sc.nextLine();
    String fullname = firstname + " " + lastname;
    System.out.println("Full name is: " + fullname);
    System.out.println("Length of full name is: " + fullname.length());
    sc.close();
  }
}
