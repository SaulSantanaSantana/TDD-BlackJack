package Cards;

/**
 *
 * @author saul
 */
public abstract class Card {
    private final String value;
    public Card(String value) {this.value = value;}
    public int getValue(){return Integer.parseInt(value);}
    @Override
    public String toString() {return value;}    
}
