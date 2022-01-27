package WinnersTest;

import BLackJack.BlackJack;
import Cards.Ace;
import Cards.Card;
import Cards.Figures;
import Cards.PipCard;
import Player.Player;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author saul
 */
public class CroupierGetWinnersTest {
    
    @Test
    public void CroupierBlackJackTest(){
        Card[] p1 = new Card[]{new Figures("J"),new Ace()};
        Card[] p2 = new Card[]{new Ace(), new Ace()};
        Card[] p3 = new Card[]{new PipCard("5"), new PipCard("10")};
        Card[] c = new Card[]{new Ace(), new Figures("K")};Card[] d = new Card[]{};
        Player[] winners = {new Player(0)};
        assertArrayEquals(winners, BlackJack.getWinners(p1,p2,p3,c,d));
    }
    
    @Test
    public void Croupier21JackTest(){
        Card[] p1 = new Card[]{new Figures("J"),new Ace(), new Figures("J")};
        Card[] p2 = new Card[]{new Ace(), new Ace()};
        Card[] p3 = new Card[]{new PipCard("5"), new PipCard("10")};
        Card[] c = new Card[]{new Ace(), new Figures("K")};Card[] d = new Card[]{};
        assertArrayEquals(new Player[]{new Player(0)}, BlackJack.getWinners(p1,p2,p3,c,d));
    }
    
    @Test
    public void Croupier1DrawJackTest(){
        Card[] p1 = new Card[]{new Figures("J"),new Ace(), new Figures("J")};
        Card[] p2 = new Card[]{new Ace(), new Ace()};
        Card[] p3 = new Card[]{new PipCard("5"), new PipCard("10")};
        Card[] c = new Card[]{new Figures("J"),new Ace(), new Figures("J")};Card[] d = new Card[]{};
        assertArrayEquals( new Player[]{new Player(0)}, BlackJack.getWinners(p1,p2,p3,c,d));
    }
    

}
