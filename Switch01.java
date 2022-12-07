import java.util.Scanner;

public class Switch01{
    public static void main(String[]args){
        try(Scanner Input01 = new Scanner(System.in)){
            char alphbet = Input01.next().charAt(0);
            switch(alphbet){
                case'a':
                System.out.println("Today is Monday!");
                break;
                case'b':
                System.out.println("Today is Tuesday!");
                break;
                case'c':
                System.out.println("Today is Wednesday!");
                break;
                default:
                System.out.println("Please typing correctly!");



            }
        }
    }
}