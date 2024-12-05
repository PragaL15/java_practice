// A community is organizing an event and requires a program to handle the registration process for citizens. The program should collect relevant information from the user and display a summary of the registration details.



// Write a program that takes input to register them for the event.



// The program should perform the following tasks:

// Name: a string representing the senior citizen's full name.
// Age: an integer representing the senior citizen's age.
// Contact Number: a string representing the senior citizen's contact number.

import java.util.Scanner;
public class ex1{
public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    // input.nextLine();
    double weight = input.nextDouble();
    input.nextLine();
    String name = input.nextLine();
    System.out.println("Name: "+name);
    System.out.println("Age: "+num);
    System.out.println("Weight: "+weight+" kg");
    input.close();
}
}