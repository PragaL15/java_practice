// Input format :
// The Input consists of one double value
// Output format :
// The Output Should display the converted value

import java.util.Scanner;
public class ex5{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double num1 = inp.nextDouble();
        int num2 = (int)num1;
        System.out.print(num2);
        inp.close();
    }
}