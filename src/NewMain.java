
public class NewMain {
    public static void main (String [] args ) {
        Book phoenix = new Book ("The Phoenix on the Sword", "Robert Howard", 1932 );
        phoenix.setPublicationYear(1933);
        System.out.println("phoenix = " + phoenix.getPublicationYear());
    }
}
