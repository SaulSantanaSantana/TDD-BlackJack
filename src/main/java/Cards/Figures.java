package Cards;

/**
 *
 * @author saul
 */
public class Figures extends Card{

    protected String figure;
    public Figures() {super("10");}
    public Figures(String figure) {
        super("10");
        this.figure = figure;
    }
    
    @Override
    public String toString(){return this.figure;}
    
}
