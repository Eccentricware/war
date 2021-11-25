package com.practice.war;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> cardList = new ArrayList<>();
    String name;
    DeckType type;
    public Deck(String deckName, DeckType deckType) {
        this.type = deckType;
        this.name = deckName;
        switch (deckType) {
            case ORIGIN:
                stackOriginDeck();
                shuffle();
//                System.out.println(deckName + " is created");
                break;
            case PLAYER_DECK:
//                System.out.println(deckName + " is created");
                break;
            case PLAYER_SPOILS:
//                System.out.println(deckName + " is created");
                break;
            case REVEALS:
//                System.out.println(deckName + " is created");
                break;
            default:
                System.out.println("Invalid deck type");
        }
    }

    private void stackOriginDeck () {
        Card twoOfClubs = new Card("Two of Clubs", 2);
        this.cardList.add(twoOfClubs);
        Card threeOfClubs = new Card("Three of Clubs", 3);
        this.cardList.add(threeOfClubs);
        Card fourOfClubs = new Card("Four of Clubs", 4);
        this.cardList.add(fourOfClubs);
        Card fiveOfClubs = new Card("Five of Clubs", 5);
        this.cardList.add(fiveOfClubs);
        Card sixOfClubs = new Card("Six of Clubs", 6);
        this.cardList.add(sixOfClubs);
        Card sevenOfClubs = new Card("Seven of Clubs", 7);
        this.cardList.add(sevenOfClubs);
        Card eightOfClubs = new Card("Eight of Clubs", 8);
        this.cardList.add(eightOfClubs);
        Card nineOfClubs = new Card("Nine of Clubs", 9);
        this.cardList.add(nineOfClubs);
        Card tenOfClubs = new Card("Ten of Clubs", 10);
        this.cardList.add(tenOfClubs);
        Card jackOfClubs = new Card("Jack of Clubs", 11);
        this.cardList.add(jackOfClubs);
        Card queenOfClubs = new Card("Queen of Clubs", 12);
        this.cardList.add(queenOfClubs);
        Card kingOfClubs = new Card("King of Clubs", 13);
        this.cardList.add(kingOfClubs);
        Card aceOfClubs = new Card("Ace of Clubs", 14);
        this.cardList.add(aceOfClubs);
        Card twoOfDiamonds = new Card("Two of Diamonds", 2);
        this.cardList.add(twoOfDiamonds);
        Card threeOfDiamonds = new Card("Three of Diamonds", 3);
        this.cardList.add(threeOfDiamonds);
        Card fourOfDiamonds = new Card("Four of Diamonds", 4);
        this.cardList.add(fourOfDiamonds);
        Card fiveOfDiamonds = new Card("Five of Diamonds", 5);
        this.cardList.add(fiveOfDiamonds);
        Card sixOfDiamonds = new Card("Six of Diamonds", 6);
        this.cardList.add(sixOfDiamonds);
        Card sevenOfDiamonds = new Card("Seven of Diamonds", 7);
        this.cardList.add(sevenOfDiamonds);
        Card eightOfDiamonds = new Card("Eight of Diamonds", 8);
        this.cardList.add(eightOfDiamonds);
        Card nineOfDiamonds = new Card("Nine of Diamonds", 9);
        this.cardList.add(nineOfDiamonds);
        Card tenOfDiamonds = new Card("Ten of Diamonds", 10);
        this.cardList.add(tenOfDiamonds);
        Card jackOfDiamonds = new Card("Jack of Diamonds", 11);
        this.cardList.add(jackOfDiamonds);
        Card queenOfDiamonds = new Card("Queen of Diamonds", 12);
        this.cardList.add(queenOfDiamonds);
        Card kingOfDiamonds = new Card("King of Diamonds", 13);
        this.cardList.add(kingOfDiamonds);
        Card aceOfDiamonds = new Card("Ace of Diamonds", 14);
        this.cardList.add(aceOfDiamonds);
        Card twoOfHearts = new Card("Two of Hearts", 2);
        this.cardList.add(twoOfHearts);
        Card threeOfHearts = new Card("Three of Hearts", 3);
        this.cardList.add(threeOfHearts);
        Card fourOfHearts = new Card("Four of Hearts", 4);
        this.cardList.add(fourOfHearts);
        Card fiveOfHearts = new Card("Five of Hearts", 5);
        this.cardList.add(fiveOfHearts);
        Card sixOfHearts = new Card("Six of Hearts", 6);
        this.cardList.add(sixOfHearts);
        Card sevenOfHearts = new Card("Seven of Hearts", 7);
        this.cardList.add(sevenOfHearts);
        Card eightOfHearts = new Card("Eight of Hearts", 8);
        this.cardList.add(eightOfHearts);
        Card nineOfHearts = new Card("Nine of Hearts", 9);
        this.cardList.add(nineOfHearts);
        Card tenOfHearts = new Card("Ten of Hearts", 10);
        this.cardList.add(tenOfHearts);
        Card jackOfHearts = new Card("Jack of Hearts", 11);
        this.cardList.add(jackOfHearts);
        Card queenOfHearts = new Card("Queen of Hearts", 12);
        this.cardList.add(queenOfHearts);
        Card kingOfHearts = new Card("King of Hearts", 13);
        this.cardList.add(kingOfHearts);
        Card aceOfHearts = new Card("Ace of Hearts", 14);
        this.cardList.add(aceOfHearts);
        Card twoOfSpades = new Card("Two of Spades", 2);
        this.cardList.add(twoOfSpades);
        Card threeOfSpades = new Card("Three of Spades", 3);
        this.cardList.add(threeOfSpades);
        Card fourOfSpades = new Card("Four of Spades", 4);
        this.cardList.add(fourOfSpades);
        Card fiveOfSpades = new Card("Five of Spades", 5);
        this.cardList.add(fiveOfSpades);
        Card sixOfSpades = new Card("Six of Spades", 6);
        this.cardList.add(sixOfSpades);
        Card sevenOfSpades = new Card("Seven of Spades", 7);
        this.cardList.add(sevenOfSpades);
        Card eightOfSpades = new Card("Eight of Spades", 8);
        this.cardList.add(eightOfSpades);
        Card nineOfSpades = new Card("Nine of Spades", 9);
        this.cardList.add(nineOfSpades);
        Card tenOfSpades = new Card("Ten of Spades", 10);
        this.cardList.add(tenOfSpades);
        Card jackOfSpades = new Card("Jack of Spades", 11);
        this.cardList.add(jackOfSpades);
        Card queenOfSpades = new Card("Queen of Spades", 12);
        this.cardList.add(queenOfSpades);
        Card kingOfSpades = new Card("King of Spades", 13);
        this.cardList.add(kingOfSpades);
        Card aceOfSpades = new Card("Ace of Spades", 14);
        this.cardList.add(aceOfSpades);
    }

    public void shuffle () {
        List<Card> cardsInShuffle = this.cardList;
        this.cardList = new ArrayList<>();
        while (cardsInShuffle.size() > 0) {
            int randomIndex = (int) (Math.floor(Math.random() * cardsInShuffle.size()));
            this.cardList.add(cardsInShuffle.get(randomIndex));
            cardsInShuffle.remove(randomIndex);
        }
    }

    public Card topCard () {
        return this.cardList.get(this.cardList.size() - 1);
    }

    public void dealTo(Deck receivingDeck) {
        receivingDeck.cardList.add(this.topCard());
        this.cardList.remove(this.cardList.size() - 1);
    }
}
