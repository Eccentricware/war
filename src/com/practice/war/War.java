package com.practice.war;

public class War {
    int gameNumber;
    Player player1;
    Player player2;
    boolean finished = false;

    War (int gameNumber, Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.gameNumber = gameNumber;
        Deck origin = new Deck("Origin", DeckType.ORIGIN);
        while (origin.cardList.size() > 0) {
            if (origin.cardList.size() % 2 == 0) {
                origin.dealTo(player1.deck);
            } else {
                origin.dealTo(player2.deck);
            }
        }
    }

    public void battle(int revealCount) {
        int cardsP1Revealed = 0;
        int cardsP2Revealed = 0;
        while (cardsP1Revealed < revealCount) {
            if (player1.deck.cardList.size() == 0 && player1.spoils.cardList.size() > 0) {
                player1.recycleSpoils();
            }
            if (player1.deck.cardList.size() > 0) {
                player1.deck.dealTo(player1.reveals);
            }
            cardsP1Revealed++;
        }
        while (cardsP2Revealed < revealCount) {
            if (player2.deck.cardList.size() == 0 && player2.spoils.cardList.size() > 0) {
                player2.recycleSpoils();
            }
            if (player2.deck.cardList.size() > 0) {
                player2.deck.dealTo(player2.reveals);
            }
            cardsP2Revealed++;
        }
//        System.out.println(player1.name + ": " + player1.reveals.topCard().name);
//        System.out.println(player2.name + ": " + player2.reveals.topCard().name);
        if (player1.reveals.topCard().power > player2.reveals.topCard().power) {
            //System.out.println(player1.name + " wins this round");
            while (player1.reveals.cardList.size() > 0) {
                player1.reveals.dealTo(player1.spoils);
            }
            while (player2.reveals.cardList.size() > 0) {
                player2.reveals.dealTo(player1.spoils);
            }
        } else if (player1.reveals.topCard().power < player2.reveals.topCard().power) {
            //System.out.println(player2.name + " wins this round");
            while (player1.reveals.cardList.size() > 0) {
                player1.reveals.dealTo(player2.spoils);
            }
            while (player2.reveals.cardList.size() > 0) {
                player2.reveals.dealTo(player2.spoils);
            }
        } else {
            //System.out.println("There is a tie");
            battle(4);
        }
    }

    public void play() {
        while (!finished) {
            if (player1.deck.cardList.size() == 0 && player1.spoils.cardList.size() != 0) {
                player1.recycleSpoils();
            }
            if (player2.deck.cardList.size() == 0 && player2.spoils.cardList.size() != 0) {
                player2.recycleSpoils();
            }
            if (player1.deck.cardList.size() == 0 || player2.deck.cardList.size() == 0) {
                //System.out.println("Game is over");
                if (player1.deck.cardList.size() + player1.spoils.cardList.size() == 52) {
                    player1.wins++;
                    player2.losses++;
                    System.out.println(String.format(
                        "Game %o: %s wins (%o-%o) vs %s (%o-%o)",
                        this.gameNumber, player1.name, player1.wins, player1.losses, player2.name, player2.wins, player2.losses
                    ));
                } else {
                    player1.losses++;
                    player2.wins++;
                    System.out.println(String.format(
                        "Game %o: %s wins (%o-%o) vs %s (%o-%o)",
                        this.gameNumber, player2.name, player2.wins, player2.losses, player1.name, player1.wins, player1.losses
                    ));
                }
                this.finished = true;
            } else {
                battle(1);
            }
        }
    }
}