public class Main {
    public static void main (String[] args) {
        Book phoenix = new Book ("The Phoenix on the Sword", "Robert Howard", 1932 );
        Book scarletStudy = new Book("A Study in Scarlet","Arthur Conan Doyle", 1887);
        Author rHoward = new Author("Robert", "Howard");
        Author artConDoyle = new Author("Arthur", "Conan Doyle");
        System.out.println(phoenix.getBookName() + ", " + phoenix.getAuthor() +", "+ phoenix.getPublicationYear());
        System.out.println(scarletStudy.getBookName() + ", " + scarletStudy.getAuthor() + "," + scarletStudy.publicationYear);
        System.out.println(rHoward.getFirstName() +" "+ rHoward.getLastName());
        System.out.println(artConDoyle.getFirstName() + " " + artConDoyle.getLastName());
        System.out.println("Понедельник был легким.");

    }
}