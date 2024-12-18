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
    System.out.println("Each letters are: ");
    for (int i = 0; i < fullname.length(); i++) {
      System.out.println(fullname.charAt(i));
    }
    if (firstname.compareTo(lastname) > 0) {
      System.out.println("Firstname is longer");
    } else if (firstname.compareTo(lastname) == 0) {
      System.out.println("Firstname and lastname has equal length");
    } else {
      System.out.println("Last name is longer");
    }
    System.out.println("Substring of fullname: " + fullname.substring(2, 5));
    sc.close();
  }
}
