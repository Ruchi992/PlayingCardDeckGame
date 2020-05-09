/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruchi.cardproject;

import java.util.Scanner;

/**
 *
 * @author Ruchi Devi
 */
public class GameRunner {    

	public static void main(String[] args) {
		// init
		Scanner scanner = new Scanner(System.in);
		Deck theDeck = new Deck(1, true);
		
		// init the player objects
		Player me = new Player("Josh");
		Player dealer = new Player("Dealer");
		me.addCard(theDeck.dealNextCard());
		dealer.addCard(theDeck.dealNextCard());
		me.addCard(theDeck.dealNextCard());
		dealer.addCard(theDeck.dealNextCard());
		
		// print initial hand
		
		System.out.println("Card are dealt\n");
		me.printHand(true);
		dealer.printHand(false);
		System.out.println("\n");
		
		// Flag for when each player is finished hitting
		boolean meDone = false;
		boolean dealerDone = false;
		
		String ans;
		while(!meDone || !dealerDone) {
			
			// player's turn
			if(!meDone) {
				System.out.println("Hit or Stay (Enter H or S):");
				ans = scanner.next();
				System.out.println();
				
				// if the player hits
				
				if(ans.compareToIgnoreCase("H") == 0) {
					
					// add next card in the deck and store whether player is busted
					meDone =!me.addCard(theDeck.dealNextCard());
					dealer.printHand(true);
					
				}else {
					meDone = true;
					
				}
			}
			
			// dealer's turn
			
			if(!dealerDone) {
				if(dealer.getHandSum() < 17) {
					System.out.println("The dealer hits\n");
					dealerDone = !dealer.addCard(theDeck.dealNextCard());
					dealer.printHand(false);
					
				}else {
					System.out.println("The dealer stays\n");
					dealerDone = true;
										
					
				}
				
			}
			System.out.println();
		}
		// Close scanner
	
		scanner.close();		
		
		// Print final hand
		
		me.printHand(true);

		dealer.printHand(true);
		int mySum = me.getHandSum();
		int dealerSum = dealer.getHandSum();
		
		if(mySum > dealerSum && mySum <= 21 || dealerSum > 21) {
			System.out.println("Your win!");
			
		}else {
			System.out.println("Dealer win");
		
	}

	}
}  

