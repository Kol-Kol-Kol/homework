package hw_objects_and_classes;

import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int yearOfPublication;


    public Book(String nameBook, Author name, int yearOfPublication) {
        this.nameBook = nameBook;
        this.author = name;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    @Override
    public String toString() {
        return "Наименование книги = " + nameBook +
                ", " + author.toString() +
                ", Год публикации книги = " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearOfPublication);
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

}
