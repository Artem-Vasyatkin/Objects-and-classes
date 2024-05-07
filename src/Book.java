public class Book {
    private String name;
    private int yearOfPublicationOfTheBook;
    private Author author;

    public Book(String name, int yearOfPublicationOfTheBook, Author author) {
        this.name = name;
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.author = author;
    }

    public void setYearOfPublicationOfTheBook(int year) {
        yearOfPublicationOfTheBook = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublicationOfTheBook() {
        return yearOfPublicationOfTheBook;
    }

}


