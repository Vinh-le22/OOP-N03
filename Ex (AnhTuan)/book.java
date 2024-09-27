public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}