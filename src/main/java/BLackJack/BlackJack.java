package BLackJack;

import Cards.Ace;
import Cards.Card;
import Player.Player;
import java.util.ArrayList;

/**
 *
 * @author saul
 */

public class BlackJack {
    
    private static int CROUPIER;
    
    public static Player[] getWinners(Card[] p1, Card[] p2, Card[] p3, 
                                                Card[] croupier, Card[] deck) {
        
        if(IsBlackJack(croupier)){return new Player[]{new Player(0)};}
        CROUPIER = CalculateValue(croupier);
        ArrayList<Player> winners = new ArrayList();
        
        if(IsBlackJack(p1)){winners.add(new Player(1));}else{
        if(CalculateValue(p1) > CROUPIER){winners.add(new Player(1));}}
        
        if(IsBlackJack(p2)){winners.add(new Player(2));}else{
        if(CalculateValue(p2) > CROUPIER){winners.add(new Player(2));}}
        
        if(IsBlackJack(p3)){winners.add(new Player(3));}else{
        if(CalculateValue(p3) > CROUPIER){winners.add(new Player(4));}}
        
        if(winners.isEmpty()){winners.add(new Player(0));}
        return winners.stream().toArray( n -> new Player[n]);
    }
    
    public static boolean IsBlackJack(Card[] player){
        if(player.length == 2){
            if(CalculateValue(player) == 21){return true;}
        }return false;
    }
    
    public static int CalculateValue(Card[] player){
        
        boolean ace = false;
        int value = 0;
        for (Card card : player) { 
            value += card.getValue(); 
            if(card instanceof Ace){ace = true;}
        }
        
        if(ace){if(value<=11){value+=10;}}
        if(value <= 21){return value;}else{return 0;}
    }
}
