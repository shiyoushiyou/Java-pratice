import java.util.Scanner;
public class Array02 {
    public static void main(String[]args){
    try(Scanner InputScore = new Scanner(System.in)){
    double []Score =new double[5];
        for(int k = 0; k<=5 ;k++){
            System.out.println("Input your Score:");
            Score[k]= InputScore.nextDouble();
            System.out.println("Your Score is: "+Score[k]);
                    
        }


        }
    }
}
