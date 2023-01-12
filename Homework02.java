import java.util.Scanner;
public class Homework02 {
    public static void main(String[]args){
    try(Scanner InputNumber = new Scanner(System.in)){
        System.out.println("guve me a number:");
        Double Num = InputNumber.nextDouble();
    if( Num>0){
        System.out.println("This number is over 0!");
    }
    else if(Num == 0)
    {
        System.out.println("This number is 0!");
    }    
    else
    {
        System.out.println("This number is under 0!");
        
    }
}
    }
    
}