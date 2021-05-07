/*
 * Pogrammer: Joseph
 * Date: 9/24/19
 * Description: Takes user input and a random number from 1 to 3, and uses those
 * to display a winner in rock paper scissors.
 */
package lab3;

import java.util.Scanner;

public class Problem2 
{
  public static void main(String[] args)
  {
      //takes input from user and generates random number for opponent
      Scanner input = new Scanner(System.in);
      System.out.println("Enter 0 for rock, 1 for paper, or 2 for scissors");
      final int user = input.nextInt();
      final int opponent = (int)(Math.random() * 3);
      
      //displays if user wins, loses, or ties
      switch(user){
          case 0:
              if (opponent == 0) {
                  System.out.println("You both picked rock! Tie");
              } else if (opponent == 1) {
                  System.out.println("Opponent picked paper. You lose");
              } else if (opponent == 2) {
                  System.out.println("Opponent picked scissors. You win!");
              }
              break;
          case 1:
              if (opponent == 0) {
                  System.out.println("Opponent picked rock. You win!");
              } else if (opponent == 1) {
                  System.out.println("You both picked paper! Tie");
              } else if (opponent == 2) {
                  System.out.println("Opponent picked scissors. You lose");
              }
              break;
          case 2:
              if (opponent == 0) {
                  System.out.println("Opponent picked rock. You lose.");
              } else if (opponent == 1) {
                  System.out.println("Opponent picked paper. You win!");
              } else if (opponent == 2) {
                  System.out.println("You both picked scissors! Tie");
              }
              break;
          default:
              System.out.println("Invalid input.");
              
        }
    }        
}
