package hw_objects_and_classes;

public class Author {
    private String name;
    private String surname;

    public Author(String author, String surname) {
        this.name = author;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
