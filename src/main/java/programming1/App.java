/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

/*


Example Output
What is the input string? Homer
Homer has 5 characters.

Constraints
Be sure the output contains the original string.
Use a single output statement to construct the output.
Use a built-in function of the programming language to determine the length of the string.

 */

package programming1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.print("What is the input string? ");
        String input= in.nextLine();

        String output= input + "has"+ input.length()+ "characters.";

        System.out.println(output);

    }
}
