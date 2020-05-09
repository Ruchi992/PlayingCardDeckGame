/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruchi.cardproject;

/**
 *
 * @author Ruchi Devi
 */
import java.util.Random;
public class Deck {
	
	private Card[] myCards;
	
	
	private int numCards;
	
	public Deck() {
		
		this(1, false);
	}
	
	
	// Constructor that defines the number of decks for example how many  may sets of 52 cards are in the deck
	// Also whether is should be shuffled.
	
	public Deck(int numDecks, boolean shuffle) {
	
			
		this.numCards = numDecks * 52;
		this.myCards = new Card[this.numCards];
		
		// we need the card index
		int c = 0;
		
		// In here we have to do for each deck
		for(int i= 0; i <numDecks; i++ )
		{
			
			// for loop for the suit
			
			for(int j = 0; j <4; j++)
			{
			// for loop for the number
				for(int n =1;n<=13; n++)
				{
				// In here I'm adding the new card in a deck
					this.myCards[c] = new Card(Suit.values()[j],n);
					c++;
				}
			}
		}


		
	}
   

	
	public void shuffle() {

		
		// this is a random number generator
		
		Random rng = new Random();
		 // here is the temporary  card
		Card temp;
		int s;
		for(int n =0; n <this.numCards; n++) {
			
			// To get a random card s to swap n value with
			
			s = rng.nextInt(this.numCards);
			
			// Do swap
			temp =this.myCards[n];
			this.myCards[n] = this.myCards[s];
			this.myCards[n] = temp;
			
			
		}
		
		
	}

	
	public Card dealNextCard() {
		
		// To get the top card
		Card top = this.myCards[0];
		
		
		// shift all the subsequence cards to the left by one index
		for(int j = 1; j < this.numCards; j++)
		{
			this.myCards[j-1] = this.myCards[j];
		}
		this.myCards[this.numCards-1] = null;
		
		// decrement of the number of cards in the deck
		this.numCards--;
		
		return top;
				
	}
	/**
	 * print the top cards in the deck
	 * @param numToPrint
	 */
	public void  printDeck(int numToPrint) {
		for(int c = 0; c < numToPrint; c++) {
		System.out.printf("% 3d/%d  %s\n",  c+1, this.numCards,	this.myCards [c].toString());
		
	   }
		System.out.printf("\t\t [%d other] \n", this.numCards-numToPrint);
	}

}
