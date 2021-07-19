package com.balda;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Balda {

    private static HashSet<Character> getLetters(String word){

        HashSet<Character> letters = new HashSet<Character>();
        for (int i = 0; i < word.length(); i++) {
            letters.add(word.charAt(i));
        }
        return letters;
    }

    public static boolean checkWord(String word, HashSet<Character> letters, String firstWord, HashSet player) {

        boolean boll = true;
        for (int i = 0; i < word.length(); i++) {
            if(!letters.contains(word.charAt(i))) {
                System.err.println("the symbol '" +  word.charAt(i) + "' isn't in word \"" + firstWord + "\"");
                boll = false;
           }
        }
        if (boll && !word.contains(" ") && !word.isEmpty()) {
            if (player.contains(word)) {
                System.out.println("The word \"" + word + "\" was already");
            }
            else {
                System.out.println("GOOD!");
                player.add(word);
            }
        }
        return  boll;
   }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("WELCOME TO THE GAME 'BALDA'");
        System.out.println("Enter word: ");

        String word = scan.nextLine();


        HashSet<String> firsrPlayer = new LinkedHashSet<String>();
        HashSet<String> secondPlayer = new LinkedHashSet<String>();

        HashSet<Character> letters = getLetters(word);

        String word1= "word1";
        String word2= "word2";
        int numSimbolsPlayerOne = 0;
        int numSimbolsPlayerTwo = 0;

        while(!word1.isEmpty() || !word2.isEmpty())
        {

            System.out.println("Player one enter your word");
            word1 = scan.nextLine();
            if (checkWord(word1, letters, word, firsrPlayer)) {
                numSimbolsPlayerOne += word1.length();
            }

            System.out.println("Player two enter your word");
            word2 = scan.nextLine();
            if (checkWord(word2, letters, word, secondPlayer)) {
                numSimbolsPlayerTwo += word2.length();
            }
        }

        System.out.println("Player one has " + firsrPlayer.size() + " words");
        System.out.print("Words:" + firsrPlayer);
        System.out.println();

        System.out.println("Player two has " + secondPlayer.size() + " words");
        System.out.print("Words:" + secondPlayer);
        System.out.println();

        if (numSimbolsPlayerOne > numSimbolsPlayerTwo) {
            System.out.println("Conngratulations to the FIRST player to win on score "
            + numSimbolsPlayerOne + ":" + numSimbolsPlayerTwo);
        }
        else if (numSimbolsPlayerOne < numSimbolsPlayerTwo){
                System.out.println("Conngratulations to the SECOND player to win on score "
                        + numSimbolsPlayerTwo + ":" + numSimbolsPlayerOne);
         }
        else {
            System.out.println("The winner is BALDA!!! \n" +
                    "Number of player characters = " + numSimbolsPlayerOne);
        }

    }

}

