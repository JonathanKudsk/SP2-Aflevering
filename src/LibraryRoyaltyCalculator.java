import java.util.ArrayList;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        ArrayList<Title> titles = new ArrayList<>();

        Author author1 = new Author( "H.C Andersen");
        Title printedBook1 = new PrintedBook("Den lille havfrue", "SKØN", 1000, 500);
        Title printedBook2 = new PrintedBook("Den grimme ælling", "BI", 2000, 250);
        Title audioBook1 = new AudioBook("Den flyvende tæppe", "LYRIK", 3000, 125);

        author1.addTitle(printedBook1);
        author1.addTitle(printedBook2);
        author1.addTitle(audioBook1);

        System.out.println(author1.getName() + " " + author1.calculateTotalPay()+"kr");
    }
}
