import java.util.Scanner;

public class homework03 {
    public static void main(String[]args){
        try(Scanner inputnumber = new Scanner(System.in)){
            int Num = inputnumber.nextInt();
            int one = Num/100;
            int two = (Num%100)/10;
            int three = Num%10;
            double onepow = Math.pow(one,3);
            double twopow = Math.pow(two,3);
            double threepow = Math.pow(three,3);
            int Totle = (int)onepow+(int)twopow+(int)threepow;
            
            if(Totle ==Num){
                System.out.println("這是一個水仙數");
                System.out.println(Totle);

            }
            else{
                System.out.println("這不是一個水仙數");
                System.out.println(Totle);

            }
            
        }
    }
}
