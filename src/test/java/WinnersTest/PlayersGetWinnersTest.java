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
public class PlayersGetWinnersTest {
    
    @Test
    public void p121JackTest(){
        Card[] p1 = new Card[]{new Figures("J"),new Ace(), new Figures("J")};
        Card[] p2 = new Card[]{new Ace(), new Ace()};
        Card[] p3 = new Card[]{new PipCard("5")};
        Card[] c = new Card[]{new Ace(), new Ace(),new PipCard("10")};Card[] d = new Card[]{};
        assertArrayEquals(new Player[]{new Player(1)}, BlackJack.getWinners(p1,p2,p3,c,d));
    }
    
    @Test
    public void p2BlackJackTest(){
        Card[] p2 = new Card[]{new Figures("J"),new Ace()};
        Card[] p1 = new Card[]{new Ace(), new Ace()};
        Card[] p3 = new Card[]{new PipCard("5")};
        Card[] c = new Card[]{new Ace(), new Ace(),new PipCard("10")};Card[] d = new Card[]{};
        assertArrayEquals(new Player[]{new Player(2)}, BlackJack.getWinners(p1,p2,p3,c,d));
    }
    
    @Test
    public void AllPlayersJackTest(){
        Card[] p1 = new Card[]{new Figures("J"),new Ace()};
        Card[] p2 = new Card[]{new Figures("J"),new Ace()};
        Card[] p3 = new Card[]{new Figures("J"),new Ace()};
        Card[] c = new Card[]{new Ace(), new Ace(),new PipCard("10")};Card[] d = new Card[]{};
        assertArrayEquals(new Player[]{new Player(1),new Player(2),new Player(3)},
                                            BlackJack.getWinners(p1,p2,p3,c,d));
    }
}
