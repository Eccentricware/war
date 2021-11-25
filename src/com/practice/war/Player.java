package com.practice.war;

public class Player {
    String name;
    int id;
    int wins = 0;
    int losses = 0;
    Deck deck;
    Deck spoils;
    Deck reveals;
    Player (String playerName, int id) {
        this.name = playerName;
        this.id = id;
        this.deck = new Deck(playerName + "'s Deck", DeckType.PLAYER_DECK);
        this.spoils = new Deck(playerName + "'s Spoils", DeckType.PLAYER_SPOILS);
        this.reveals = new Deck(playerName + "'s Reveals", DeckType.REVEALS);
    }

    private void removeDeck() {
        this.deck = new Deck(this.name + "'s Deck", DeckType.PLAYER_DECK);
        this.spoils = new Deck(this.name + "'s Spoils", DeckType.PLAYER_SPOILS);
    }

    public void recycleSpoils() {
        this.spoils.shuffle();
        while (this.spoils.cardList.size() > 0) {
            this.spoils.dealTo(this.deck);
        }
    }
}