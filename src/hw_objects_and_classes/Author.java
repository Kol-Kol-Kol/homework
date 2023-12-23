package hw_objects_and_classes;

public class Author {
    private String author;
    private String surname;

    public Author(String author, String surname) {
        this.author = author;
        this.surname = surname;
    }

    public String getName() {
        return author;
    }

    public String getSurname() {
        return surname;
    }
}
