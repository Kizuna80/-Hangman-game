package myproject.mojaInicjatywa.hangmangit;

import java.util.Scanner;

public class HangmanMain {
    private static int count = 1;
    public static void main(String[] args) {
        char[] charToString;
        char[] censorship;
        char guess;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter you word to guess: ");

        //our word to guess is entering by the user and getting to upper case
        String wordToGuess = in.nextLine().toUpperCase();

        //there is creating array that will be used to censor our secret word
        censorship = wordToGuess.toCharArray();

        //char array of string
        charToString = wordToGuess.toCharArray();

        //this is loop that where word is getting censored
        for (int i = 0; i < wordToGuess.length(); i++) {
            censorship[i] = '*';
        }
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println(censorship);

        //main loop
        boolean playing = true;
        while (playing) {

            for (int i = 0; i < wordToGuess.length(); i++) {
                System.out.print(censorship[i]);
            }
            System.out.println();

            System.out.println("Enter your guess:");
            guess = in.next().charAt(0);

            boolean isCharInTheWord = false;
            //this is loop where where correct guesses are putted into the word to guess
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (charToString[i] == Character.toUpperCase(guess)) {
                    censorship[i] = Character.toUpperCase(guess);
                    isCharInTheWord = true;
                }
            }
            //this condition checks if we guessed correct or incorrect letter
            if (!isCharInTheWord) {
                System.out.println("You guessed wrong letter.");
                printHangman();
                count++;
            }else if(isCharInTheWord){
                System.out.println("Letter you guessed is in the word.");

            }
            if(count == 15){
                System.out.println("Game Over");
                playing = false;
            }else if(String.valueOf(censorship).equals(wordToGuess)){
                System.out.println("You guessed whole secret word correctly.");
                playing = false;
            }
//            if(!playing){
//                System.out.println("Do you want try again?");
//            }
        }
    }

    private static void printHangman(){
        if (count==1) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("/ \\");
        } else if (count==2) {
            System.out.println();
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println(" / \\");
        } else if (count==3) {
            System.out.println("  ______________");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println(" / \\");
        } else if (count==4) {
            System.out.println("  ______________");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println(" / \\");
        } else if (count==5) {
            System.out.println("  ______________");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println(" / \\          / \\");
        } else if (count==6) {
            System.out.println("  ______________");
            System.out.println("  |/           |");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println(" / \\          / \\");
        } else if (count==7) {
            System.out.println("  ______________");
            System.out.println("  |/          \\|");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println(" / \\          / \\");
        }else if (count==8) {
            System.out.println("  ______________");
            System.out.println("  |/     |    \\|");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println(" / \\          / \\");
        } else if (count==9) {
            System.out.println("  ______________");
            System.out.println("  |/     |    \\|");
            System.out.println("  |      0     |");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println("  |            |");
            System.out.println(" / \\          / \\");
        }else if (count==10) {
            System.out.println("  ______________");
            System.out.println("  |/     |    \\|");
            System.out.println("  |      0     |");
            System.out.println("  |      |     |");
            System.out.println("  |      |     |");
            System.out.println("  |            |");
            System.out.println(" / \\          / \\");
        }else if (count==11) {
            System.out.println("  ______________");
            System.out.println("  |/     |    \\|");
            System.out.println("  |      0     |");
            System.out.println("  |      |     |");
            System.out.println("  |      |     |");
            System.out.println("  |     /      |");
            System.out.println(" / \\          / \\");
        }else if (count==12) {
            System.out.println("  ______________");
            System.out.println("  |/     |    \\|");
            System.out.println("  |      0     |");
            System.out.println("  |      |     |");
            System.out.println("  |      |     |");
            System.out.println("  |     / \\    |");
            System.out.println(" / \\          / \\");
        }else if (count==13) {
            System.out.println("  ______________");
            System.out.println("  |/     |    \\|");
            System.out.println("  |      0     |");
            System.out.println("  |     /|     |");
            System.out.println("  |      |     |");
            System.out.println("  |     / \\    |");
            System.out.println(" / \\          / \\");
        }else if (count==14) {
            System.out.println("  ______________");
            System.out.println("  |/     |    \\|");
            System.out.println("  |      0     |");
            System.out.println("  |     /|\\    |");
            System.out.println("  |      |     |");
            System.out.println("  |     / \\    |");
            System.out.println(" / \\          / \\");
            System.out.println();
        }
    }
}

