package Player;

import Cards.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 *
 * @author saul
 */
public class Player {
    private final int id;
    private ArrayList<Card> cards;

    public Player(int id) {
        this.cards = new ArrayList();
        this.id = id;
    }
    
    public Player(int id, Card[] cards){
        this.cards = new ArrayList();
        Collections.addAll(this.cards, cards);
        this.id = id;
    }
    
    public void addCard(Card card){cards.add(card);}
    public Card[] getCards() {return cards.stream().toArray( n -> new Card[n]);}
    public int getId(){return id;}
    
    @Override
    public String toString() {if(id ==0){return "Croupier";}else{return "Player"+id;}}

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.cards, other.cards);
    }
    
    
}
