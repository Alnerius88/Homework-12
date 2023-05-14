public class Book {
    private String bookName;
    private String bookAuthor;
    int publicationYear;
    public Book (String bookName, String bookAuthor, int publicationYear) {
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
    public void setPublicationYear (int pubYear) {
        this.publicationYear = pubYear;
    }



    public String getAuthor () {return bookAuthor; }


    public class Author {
        private String firstName;
        private String lastName;

        public Author (String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }

        public final String authorFull = firstName + lastName;


    }


}
