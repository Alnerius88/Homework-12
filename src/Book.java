public class Book {
    private final String bookName;
    private final String author;
    int publicationYear;

    public Book (String bookName, String author, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return bookName;
    }
    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear (int pubYear) {
        this.publicationYear = pubYear;
    }
}
