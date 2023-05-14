public class Main {
    public static void main (String[] args) {
        Author rHoward = new Author ("Robert ", "Howard ");
        Author artConDoyle = new Author("Arthur ", "Conan Doyle ");
        Book phoenix = new Book("The Phoenix on the Sword", rHoward, 1932);
        Book scarletStudy = new Book("A Study in Scarlet", artConDoyle, 1887);
        System.out.println(phoenix.getBookName() + ", " + phoenix.getAuthor() + ", " + phoenix.getPublicationYear());
        System.out.println(scarletStudy.getBookName() + ", " + scarletStudy.getAuthor() + "," + scarletStudy.publicationYear);
        System.out.println(rHoward.getFirstName() + " " + rHoward.getLastName());
        System.out.println(artConDoyle.getFirstName() + " " + artConDoyle.getLastName());
    }
}