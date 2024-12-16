package Strings;

public class StringBuilderExample {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("Kevin");
    System.out.println(str);

    // char at index 0
    System.out.println(str.charAt(0));

    // set char at an index
    str.setCharAt(0, 'P');
    System.out.println(str);
  }
}
