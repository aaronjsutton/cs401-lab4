/* Aaron Sutton
 * ajs377@pitt.edu
 * Lab 4: Title
 *
 * Simple program that reverses a String.
 */

package edu.pitt.ajs377.lab4;

import java.util.Scanner;

public class Reverse {
  private static final Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.printf("Enter a string: ");
    String input = keyboard.nextLine(); 
    
    StringBuilder output = new StringBuilder();
    for (int i = input.length() - 1; i >= 0; i--) {
      output.append(input.charAt(i)); 
    }
    System.out.println(output);
  }
}
