public class PlaingCard {

Suit suit;
Rank rank;

    public PlaingCard(Suit suit,Rank rank) {
        this.suit = suit;
        this.rank=rank;

    }

    @Override
    public String toString() {
        return "PlaingCard{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}
