// Jeevan is running a sports club. He already had N number of customers and due to the offer that he declared yesterday a lot of new members have joined the club today. Tell the total number of customers that he has.

// Input format :
// N1 denotes the customers that he already has N2 denotes the customer added today separated by a space.

// Output format :
// The output prints the total number of customers that Jeevan has.
import java.util.Scanner;
public class ex2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.print(n1+n2);
        input.close();
    }
}