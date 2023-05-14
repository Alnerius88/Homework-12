public class Author {
    private String firstName;
    private String lastName;

    private String authorFull = firstName + lastName;

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

    public String getAuthor () {return authorFull; }
}
