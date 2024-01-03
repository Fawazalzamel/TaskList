import java.util.ArrayList;
import java.util.List;

class List {
  public static void main(String[] args) {

    List<String> books = new ArrayList<>();

    books.add("Atomic Habits");
    books.add("Harry Potter");
    books.add("Lord of the Rings");
    books.add("Of Mice and Men");
    books.add("Sherlock Holmes");

    books.remove(3);

    for (String book : books) {

      System.out.println(book);

    }

  }
}
