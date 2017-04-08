package com.company;

public class Main {

    public static void main(String[] args) {

        int finalScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was" + finalScore);

        int finalScore2 = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was" + finalScore2);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("john", position );

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("sadie", position );

        position = calculateHighScorePosition(900);
        displayHighScorePosition("bob", position );

        position = calculateHighScorePosition(400);
        displayHighScorePosition("jackie", position );

        position = calculateHighScorePosition(50);
        displayHighScorePosition("mao", position );
    }

    // modifier = public method, return type = no return (void keyword), () = where you list parameters
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver){
            int finalScore = score + levelCompleted * bonus;
            return finalScore;
        }
        return -1;
    }
    // define variables in the parameters of the method. assign the variables values when you call the method. then you can call the assigned variables in the method itself
    // naming variables in parameters is more important here compared to ruby.

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " came in position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        } else if (score < 1000 && score >= 500) {
            return 2;
        } else if (score < 500 && score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
