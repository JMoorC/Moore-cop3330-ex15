/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);
        String[][] database = new String[3][2];
        database[0][0] = "jimbob1257";
        database[0][1] = "BithloBoy22";
        database[1][0] = "CadiaStands01";
        database[1][1] = "SayNo2Kaos";
        database[2][0] = "SonOfBrady";
        database[2][1] = "IK122mYd@d)";

        System.out.print("What is your username? ");
        String userName = inScan.next();
        int userVal = -1;
        for (int i = 0; i < 3; i++){
            if (userName.equals(database[i][0]) ){
                userVal = i;
            }
        }
        if (userVal == -1){
            System.out.println("Sorry, I don't know you.");
            return;
        }
        
        System.out.print("What is your password? ");
        String password = inScan.next();
        if (password.equals(database[userVal][1]) ){
            System.out.println("Welcome!");
            return;
        }
        System.out.println("Wrong Password.");
    }
}
