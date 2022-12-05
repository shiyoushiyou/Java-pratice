import java.util.Scanner;
public class Nestedif{
    public static void main(String[]args){
        try(Scanner MyInput = new Scanner(System.in)){
            Double Score = MyInput.nextDouble();
            char Gender = MyInput.next().charAt(0);
        if (Score > 8.0){
            if (Gender == 'M')
                System.out.println("Congratulations,you're the boy.");
            else
                System.out.println("Congratulations,you're the girl.");
        }
        else
            System.out.println("oh,you lose.");
        }
    }
}
