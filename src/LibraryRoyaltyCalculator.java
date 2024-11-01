import java.util.ArrayList;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        ArrayList<Title> titles = new ArrayList<>();

        Author author1 = new Author( "Jonathan Kudsk");
        Title printedBook1 = new PrintedBook("Abdi på en skuter", "BI", 1000, 500);
        Title printedBook2 = new PrintedBook("Eren i bakken", "SKØN", 2000, 250);
        Title audioBook1 = new AudioBook("2 Sjakaler på togt", "LYRIK", 3000, 125);

        author1.addTitle(printedBook1);
        author1.addTitle(printedBook2);
        author1.addTitle(audioBook1);

        System.out.println(author1.getName() + ": " + author1.calculateTotalPay()+" kr");
    }
}
