public class Book {
    private final String bookName;
    private final String Author;
    int publicationYear;

    public Book (String bookName, String Author, int publicationYear) {
        this.bookName = bookName;
        this.Author = Author;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return bookName;
    }
    public String getAuthor() {
        return Author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear (int pubYear) {
        this.publicationYear = pubYear;
    }
}
