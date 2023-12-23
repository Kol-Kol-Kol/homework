package hw_objects_and_classes;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Lew", "Tolstoy");
        Author author2 = new Author("Jon", "Duck");

        Book book1 = new Book("Война и мир", author1, 1873);
        Book book2 = new Book("Садовник убийца", author2, 2023);

        book2.setYearOfPublication(2022);
    }
}
