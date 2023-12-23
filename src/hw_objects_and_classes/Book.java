package hw_objects_and_classes;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Наименование книги = " + nameBook +
                ", " + name.toString() +
                ", Год публикации книги = " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(nameBook, book.nameBook) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, name, yearOfPublication);
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
