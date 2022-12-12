import java.util.Scanner;

public class DowhileExercise02 {
    public static void main(String[]args){
    try(Scanner InputAnswer = new Scanner(System.in)){
        String Answer = "";
        do{
            System.out.println("give me money!");
            Answer = InputAnswer.next();
            System.out.println("Your Answer is"+ Answer);
        }
        while(Answer!="Y");
    }
    }
}
