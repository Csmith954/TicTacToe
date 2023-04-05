package ui;

import application.TicTacToe;

import java.util.Scanner;

/*
 * All code getting input from the user goes here
 */
public class UserInput {
    private Scanner scanner = new Scanner(System.in);

    public String getSelection(){
        System.out.println();
        System.out.println("What spot would you like to take?");
        String selection = scanner.nextLine();
        return selection;
    }

}
