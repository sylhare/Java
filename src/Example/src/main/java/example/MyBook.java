package example;

public class MyBook extends Book {
  private final int price;

  MyBook(String title, String author, int price) {
    super(title, author);
    this.price = price;
  }

  @Override
  void display() {
    System.out.printf("Title: %s\nAuthor: %s\nPrice: %d%n", this.title, this.author, this.price);
  }
}
