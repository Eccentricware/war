package com.practice.war;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> entrants = new ArrayList<>();
        Player player1 = new Player("Amalia", 1);
        entrants.add(player1);
        Player player2 = new Player("Bino", 2);
        entrants.add(player2);
        Player player3 = new Player("Caleb", 3);
        entrants.add(player3);
        Player player4 = new Player("Dan", 4);
        entrants.add(player4);
        Player player5 = new Player("Errin", 5);
        entrants.add(player5);
        Player player6 = new Player("Jonny", 6);
        entrants.add(player6);
        Player player7 = new Player("Gary", 7);
        entrants.add(player7);
        Player player8 = new Player("Holly", 8);
        entrants.add(player8);
        Player player9 = new Player("Joe", 9);
        entrants.add(player9);
        Player player10 = new Player("Jerome", 10);
        entrants.add(player10);
        Player player11 = new Player("Link", 11);
        entrants.add(player11);
        Player player12 = new Player("Matt", 12);
        entrants.add(player12);
        Player player13 = new Player("Nathan", 13);
        entrants.add(player13);
        Player player14 = new Player("Olivia", 14);
        entrants.add(player14);
        Player player15 = new Player("Paul", 15);
        entrants.add(player15);
        Player player16 = new Player("Qezox", 16);
        entrants.add(player16);
        Player player17 = new Player("Randy", 17);
        entrants.add(player17);
        Player player18 = new Player("Sarah", 18);
        entrants.add(player18);
        Player player19 = new Player("Daisy", 19);
        entrants.add(player19);
        Player player20 = new Player("Ursula", 20);
        entrants.add(player20);
        Player player21 = new Player("Mega Man", 21);
        entrants.add(player21);
        Player player22 = new Player("Vanessa", 22);
        entrants.add(player22);
        Player player23 = new Player("Wolf", 23);
        entrants.add(player23);
        Player player24 = new Player("Jan", 24);
        entrants.add(player24);
        Player player25 = new Player("Yzma", 25);
        entrants.add(player25);
        Player player26 = new Player("Zelda", 26);
        entrants.add(player26);
        int gameNumber = 0;
        for (int p1Index = 0; p1Index < entrants.size(); p1Index++) {
            for (int p2Index = 0; p2Index < entrants.size(); p2Index++) {
                if (p1Index != p2Index) {
                    War game = new War(gameNumber, entrants.get(p1Index), entrants.get(p2Index));
                    game.play();
                    gameNumber++;
                }
            }
        }
        List<Player> seasonRankings = new ArrayList<>();
        System.out.println("Season Rankings:");
        while (entrants.size() > 0) {
            int winnerIndex = 0;
            for (int index = 0; index < entrants.size(); index++) {
                if (entrants.get(index).wins > entrants.get(winnerIndex).wins) {
                    winnerIndex = index;
                }
            }
            seasonRankings.add(entrants.get(winnerIndex));
            entrants.remove(winnerIndex);
        }
        seasonRankings.forEach(player ->
            System.out.printf("%o-%o: %s \n", player.wins, player.losses, player.name)
        );
    }
}
