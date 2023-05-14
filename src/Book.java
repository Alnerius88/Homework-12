public class Book {
    private String bookName;
    private Author bookAuthor;
    int publicationYear;
    public Book (String bookName, Author bookAuthor, int publicationYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.publicationYear = publicationYear;
    }
    public String getBookName() {
        return bookName;
    }
    public int getPublicationYear() {
        return publicationYear;
    }

    public Author getAuthor () {return bookAuthor;}
    public void setPublicationYear (int pubYear) {
        this.publicationYear = pubYear;
    }

}
