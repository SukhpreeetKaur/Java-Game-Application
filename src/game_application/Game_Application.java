/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game_application;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */

   import java.util.Random;
import java.util.Scanner;
public class Game_Application{
public static void main(String[] args){
Random r = new Random();
int numberToguess = r.nextInt(100);
int numberoftries = 0;
Scanner in = new Scanner(System.in);
int guess;
boolean win = false;
while(win == false){
System.out.println("Guess a number between 1 to 100:");
guess = in.nextInt();
numberoftries++;
if(guess == numberToguess){
win = true;
}
else if(guess < numberToguess){
System.out.println("Your guess is too low");
}
else if(guess > numberToguess){
System.out.println("Your guess is too high");
}
}
System.out.println("You wins!!");
System.out.println("The number was"+numberToguess);
System.out.println("It took you" + numberoftries + "tries");
}
}