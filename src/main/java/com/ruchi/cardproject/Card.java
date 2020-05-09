package com.ruchi.cardproject;

/**
 *
 * @author Ruchi Devi
 */
public class Card {
    
    private Suit mySuit;
	
	// The number of hits card where Ace: 1 jack-king: 11 -13
	private int myNumber;
	
	public Card(Suit Suit, int Number) 
	{
		this.mySuit = Suit;
		if(Number >= 1 && Number <= 13) {
		this.myNumber = Number;
	}
		else {
		System.err.println(Number + "This is not a vaild card number");
			System.exit(1);
		}
	}    

   
	// This is return the number of the card.
	public int getNumber() {
		return myNumber;
		
	}
	public String toString() {
		
		String numStr = "Error";
		
		switch(this.myNumber) {
		case 2: 
			numStr = "2";
			break;
			
		case 3: 
			numStr = "3";
			break;
			
		case 4: 
			numStr = "4";
			break;
			
		case 5: 
			numStr = "5";
			break;
		case 6: 
			numStr = "6";
			break;			
		case 7: 
			numStr = "7";
			break;
			
		case 8: 
			numStr = "8";
			break;
			
		case 9: 
			numStr = "9";
			break;
			
		case 10: 
			numStr = "10";
			break;
		case 11: 
			numStr = "jack";
			break;
			
		case 12: 
			numStr = "Queen";
			break;
			
		case 13: 
			numStr = "King";
			break;
			
		case 1: 
			numStr = "Ace";
			break;
		}
		
		
		return  numStr +  "  of "  + mySuit.toString();
	}

    
	
	

	
}
    

