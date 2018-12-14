package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HiddenWordRunner {

    public static void main(String[] args) {
	    HiddenWord trial1 = new HiddenWord("APPLE");
	    String hint = "";
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String guess = in.nextLine();
        hint = trial1.getHint(guess);
        while(!hint.equals("APPLE"))
        {
            System.out.println("Your hint:" +hint );
            System.out.println("What's your next guess?");
            guess = in.nextLine();
            hint = trial1.getHint(guess);




        }
        System.out.println("Congrats on getting the secret word");
    }
}
