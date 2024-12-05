// The first input is a string that corresponds to the name of the event.
// The second input is a string that corresponds to the type of event.
// The third input is an integer that corresponds to the number of people expected for the event.
// The fourth input is a character that corresponds to Y or N, telling whether the event is going to be a paid entry or not.
// The fifth input is a double value that corresponds to the projected expenses (in lakhs) for the event
// You are using Java
import java.util.Scanner;
class Main 
{
    public static void ex4(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String Name = input.nextLine();
        String Type = input.nextLine();
        int num = input.nextInt();
        input.nextLine();
        char paid = input.next().charAt(0);
        double expense = input.nextDouble();
        System.out.print("Event Name : "+Name+"\nEvent Type : "+Type+"\nExpected Count : "+
        num+"\nPaid Entry : "+paid+"\nProjected Expense : "+expense+"L");
        input.close();
	}

}