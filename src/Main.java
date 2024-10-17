import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<PlaingCard> hand = new ArrayList<>();
        hand.add(new PlaingCard(Suit.HEARTS,Rank.SEVEN));
        hand.add(new PlaingCard(Suit.SPADES, Rank.TEN));
        hand.add(new PlaingCard(Suit.DIAMONDS, Rank.ACE));
        hand.add(new PlaingCard(Suit.CLUBS, Rank.KING));
        hand.add(new PlaingCard(Suit.SPADES, Rank.ACE));

        //System.out.println("hand =" +hand);


        hand.sort(Comparator.comparing(a -> a.suit));

        System.out.println("Отсортирвоаны по масти:"+ hand);
        hand.forEach(System.out::println);
        hand.sort(Comparator.comparing(a -> a.rank));

        System.out.print("Отсортированы по достоинству" + hand+ " ");

        hand.forEach(System.out::println); // для красивого вывода


    }
}