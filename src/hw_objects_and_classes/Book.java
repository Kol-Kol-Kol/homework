package hw_objects_and_classes;

public class Book {
    String nameBook;
    Author name;
    int yearOfPublication;


    public Book(String nameBook, Author name, int yearOfPublication) {
        this.nameBook = nameBook;
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getName() {
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}