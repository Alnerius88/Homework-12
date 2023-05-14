public class Main {
    public static void main (String[] args) {
        Book phoenix = new Book("The Phoenix on the Sword", "Robert Howard", 1932);
        Book scarletStudy = new Book("A Study in Scarlet", "Arthur Conan Doyle", 1887);
        Book.Author rHoward = phoenix.new Author ("Robert ", "Howard ");
        Book.Author artConDoyle = scarletStudy.new Author("Arthur ", "Conan Doyle ");
        System.out.println(phoenix.getBookName() + ", " + phoenix.getAuthor() + ", " + phoenix.getPublicationYear());
        System.out.println(scarletStudy.getBookName() + ", " + scarletStudy.getAuthor() + "," + scarletStudy.publicationYear);
        System.out.println(rHoward.getFirstName() + " " + rHoward.getLastName());
        System.out.println(artConDoyle.getFirstName() + " " + artConDoyle.getLastName());
    }
}