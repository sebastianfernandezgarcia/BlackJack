package Tests;

import Model.Cards.Ace;
import Model.Cards.Deck.Deck;
import Model.Cards.face;
import Model.Cards.Pip;
import Model.Players.Croupier;
import Model.Players.Player;
import blackjack.BlackJack;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class Tests {
    
    @Test
    public void P2ganaSinBlackJack() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Croupier croupier = new Croupier();
        Deck deck = new Deck();
        
        player1.addCardToBet(new Pip(6));
        player1.addCardToBet(new Pip(10));
        
        player2.addCardToBet(new face());
        player2.addCardToBet(new face());
        
        player3.addCardToBet(new Ace());
        player3.addCardToBet(new Pip(7));
        player3.addCardToBet(new Pip(8));
        player3.addCardToBet(new face());
        
        croupier.addCardToBet(new Pip(7));
        croupier.addCardToBet(new face());
        
        deck.addCard(new face());
        deck.addCard(new Pip(4));
        deck.addCard(new Ace());
        
        assertEquals("[Player2 wins]", BlackJack.getWinners(
                player1.getCards(), 
                player2.getCards(), 
                player3.getCards(), 
                croupier.getCards(), 
                deck.getCards()).toString());
    }
    
    @Test
    public void P1P2GananSinBlackJack() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Croupier croupier = new Croupier();
        Deck deck = new Deck();
        
        player1.addCardToBet(new Pip(2));
        player1.addCardToBet(new Pip(10));
        player1.addCardToBet(new Pip(9));
        
        player2.addCardToBet(new face());
        player2.addCardToBet(new face());
        
        player3.addCardToBet(new Ace());
        player3.addCardToBet(new Pip(7));
        player3.addCardToBet(new Pip(8));
        player3.addCardToBet(new face());
        
        croupier.addCardToBet(new Pip(7));
        croupier.addCardToBet(new face());
        
        deck.addCard(new face());
        deck.addCard(new Pip(4));
        deck.addCard(new Ace());
        
        assertEquals("[Player1 wins, Player2 wins]", BlackJack.getWinners(
                player1.getCards(), 
                player2.getCards(), 
                player3.getCards(), 
                croupier.getCards(), 
                deck.getCards()).toString());
    }
    
    @Test
    public void todosSinBlackJack() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Croupier croupier = new Croupier();
        Deck deck = new Deck();
        
        player1.addCardToBet(new Pip(2));
        player1.addCardToBet(new Pip(10));
        player1.addCardToBet(new Pip(9));
        
        player2.addCardToBet(new face());
        player2.addCardToBet(new face());
        
        player3.addCardToBet(new Pip(8));
        player3.addCardToBet(new face());
        
        croupier.addCardToBet(new Pip(7));
        croupier.addCardToBet(new face());
        
        deck.addCard(new face());
        deck.addCard(new Pip(4));
        deck.addCard(new Ace());
        
        assertEquals("[Player1 wins, Player2 wins, Player3 wins]", BlackJack.getWinners(
                player1.getCards(), 
                player2.getCards(), 
                player3.getCards(), 
                croupier.getCards(), 
                deck.getCards()).toString());
    }
    
    
    
    
    
    
    @Test
    public void croupierGanaBlackJack() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Croupier croupier = new Croupier();
        Deck deck = new Deck();
        
        player1.addCardToBet(new Pip(6));
        player1.addCardToBet(new Pip(10));
        
        player2.addCardToBet(new face());
        player2.addCardToBet(new face());
        
        player3.addCardToBet(new Ace());
        player3.addCardToBet(new Pip(7));
        player3.addCardToBet(new Pip(8));
        player3.addCardToBet(new face());
        
        croupier.addCardToBet(new Ace());
        croupier.addCardToBet(new face());
        
        deck.addCard(new face());
        deck.addCard(new Pip(4));
        deck.addCard(new Ace());
        
        assertEquals("[Croupier wins]", BlackJack.getWinners(
                player1.getCards(), 
                player2.getCards(), 
                player3.getCards(), 
                croupier.getCards(), 
                deck.getCards()).toString());
    }
    

    @Test
    public void croupierGanaSINBlackJack() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Croupier croupier = new Croupier();
        Deck deck = new Deck();
        
        player1.addCardToBet(new Pip(6));
        player1.addCardToBet(new Pip(10));
        
        player2.addCardToBet(new Pip(4));
        player2.addCardToBet(new face());
        
        player3.addCardToBet(new Ace());
        player3.addCardToBet(new Pip(7));
        player3.addCardToBet(new Pip(8));
        player3.addCardToBet(new face());
        
        croupier.addCardToBet(new Pip(9));
        croupier.addCardToBet(new face());
        
        deck.addCard(new face());
        deck.addCard(new Pip(4));
        deck.addCard(new Ace());
        
        assertEquals("[Croupier wins]", BlackJack.getWinners(
                player1.getCards(), 
                player2.getCards(), 
                player3.getCards(), 
                croupier.getCards(), 
                deck.getCards()).toString());   
    }
    
    @Test
    public void croupierGanaSiTodos21() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Croupier croupier = new Croupier();
        Deck deck = new Deck();
        
        player1.addCardToBet(new Pip(10));
        player1.addCardToBet(new Pip(10));
        player1.addCardToBet(new Pip(3));
        
         player3.addCardToBet(new face());
        player2.addCardToBet(new face());
        
        player3.addCardToBet(new Pip(7));
        player3.addCardToBet(new Pip(8));
        player3.addCardToBet(new Pip(9));
        
        croupier.addCardToBet(new face());
        
        deck.addCard(new Pip(10));
        deck.addCard(new Pip(4));
        deck.addCard(new Ace());
        
        assertEquals("[Croupier wins]", BlackJack.getWinners(
                player1.getCards(), 
                player2.getCards(), 
                player3.getCards(), 
                croupier.getCards(), 
                deck.getCards()).toString());
    }
}