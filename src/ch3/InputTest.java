package ch3;

import java.util.Scanner;
/** 
 * This program demonstrates console input.
 * @version 1.10 2002-02-10
 * @author Cay Hostmann
 *
 */

public class InputTest 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		// get first input
		System.out.println("What is your name?");
		String name = in.nextLine();
		
		// get second input
		System.out.println("How old are you?");
		int age = in.nextInt();
		
		// display output on console
		System.out.println("Hello, " + name + ". Next year, you'll be " + (age+1));
	}
}
