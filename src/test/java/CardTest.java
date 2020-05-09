/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.ruchi.cardproject.Card;
import com.ruchi.cardproject.Suit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ruchi Devi
 */
public class CardTest {
    
   
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    } 


    @Test
    public void card_exception_test(){

        Card card = new Card(Suit.Spades, 99);
        assertEquals("99 This is not a vaild card number", card.toString());
    }

    @Test
    public void getNumber() {
    }
    
    @Test
    public void card_test(){
        
        Card card = new Card(Suit.Spades, 9);
        assertEquals("9  of  Spades", card.toString());
    }

    @Test
    public void card_test_diamonds(){

        Card card = new Card(Suit.Diamonds, 3);
        assertEquals("3  of  Diamonds", card.toString());
    }

    @Test
    public void card_test_clubs(){

        Card card = new Card(Suit.Spades, 9);
        assertEquals("9  of  Spades", card.toString());
    }

    @Test
    public void card_test_hearts(){

        Card card = new Card(Suit.Hearts, 4);
        assertEquals("4  of  Hearts", card.toString());
    }

}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

