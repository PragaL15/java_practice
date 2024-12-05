import java.util.Scanner;
public class ex3{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        inp.nextLine();
        double num2 = inp.nextDouble();
        inp.nextLine();
        boolean num3 = inp.nextBoolean();
        inp.nextLine();
        char num4 = inp.next().charAt(0);
        inp.nextLine();
        String num5 = inp.nextLine();
        
        System.out.println("Integer value = "+num);
    
        System.out.println("Double value = "+num2);
      
        System.out.println("Boolean value = "+num3);
      
        System.out.println("char value = "+num4);
     
        System.out.println("String value = "+num5);
        inp.close();
    }
}