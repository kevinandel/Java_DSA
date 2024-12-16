package Strings;

//the main difference between strings and string builders are string builders are mutable and strings in java are immutable

public class StringBuilderExample {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("Kevin");
    System.out.println(str);

    // char at index 0
    System.out.println(str.charAt(0));

    // set char at an index
    str.setCharAt(0, 'P');
    System.out.println(str);

    // insert a character
    str.insert(5, 'o');
    System.out.println(str);

    // delete a character
    str.delete(5, 6);
    System.out.println(str);

    // append a character
    str.append(" Pandel"); // thi does not create a new string object as we use string builders here but if
                           // we used normal strings then a new string object will be created.
    System.out.println(str);
  }
}
