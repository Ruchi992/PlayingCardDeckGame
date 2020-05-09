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
public class Player { 

	
	private String name;
	
	private Card[] hand = new Card[10];
	
	private int numCards;
	
	
	public Player(String aName) {
		this.name = aName;
		
		// set a player's hand to empty
		this.emptyHand();
	}
	
	public void emptyHand() {
		for(int c = 0; c < 10; c++)
		{
			this.hand[c] = null;
			
		}
		this.numCards =0;
}
	public  boolean addCard(Card aCard) {
		// print error if we already have the max number of cards
		
		if(this.numCards == 10) {
			System.err.printf("%s 's' hand already has 10 cars;"
					+ " cannot add another \n", this.name);
			System.exit(1);
		}
		// Add new card in the next slot and increment number of cards counter
		this.hand[this.numCards] = aCard;
		this.numCards++;
		return (this.getHandSum()<= 21);
	}

		/**
		 *@param
		 */
		
		public int getHandSum() {
			int handSum =0;
			int cardNum;
			int numAces =0;
		// calc each cards contribution  to the hand sum
			for(int c =0; c <this.numCards; c++) {
				
				// Get the number of current card
				cardNum = this.hand[c].getNumber();	
				if(cardNum == 1) {
					numAces ++;
					handSum+= 11;
					
					
				}else if(cardNum > 10) {
					handSum+= 10;
					
				}else {
					handSum += cardNum;
				}
								
			}
			
			// if  we have aces and our sum is greater 21, set set all the value them 1
			while (handSum > 21 && numAces> 0) {
				handSum -= 10;
				numAces --;
				
			}
			return handSum;
		}
				
						
		public void printHand(boolean showFirstCard){
			System.out.printf("%s's cards: \n", this.name);
			for(int c =0; c <this.numCards; c++) {			
				if(c== 0  && !showFirstCard) {
					System.out.println(" [hidden");
					
				}else {
					System.out.printf(" %s\n",this.hand[c].toString());
				}
			}
		}
}
    
