import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[]args){
        try(Scanner InputAlphbet = new Scanner(System.in)){
            char Alphbet = InputAlphbet.next().charAt(0);
            switch(Alphbet){
                case'a':
                char newAlphbet = Character.toUpperCase(Alphbet);
                System.out.println(newAlphbet);
                break;
                case'b':
                char newAlphbet2 = Character.toUpperCase(Alphbet);
                System.out.println(newAlphbet2);
                break;
                case'c':
                char newAlphbet3 = Character.toUpperCase(Alphbet);
                System.out.println(newAlphbet3);
                break;
                default:
                System.out.println("other!");
            }
        }
    }
}
class SwitchExercise2{
    public static void main(String[]args){
        try(Scanner InputScore = new Scanner(System.in)){
            double TestScore = InputScore.nextInt();
            if(TestScore >= 0 && TestScore <= 100){
                switch((int)(TestScore / 60)){
                    case 1:
                    System.out.println("Qualified!");
                    break;
                    case 0:
                    System.out.println("Failed!");
                    break;
            }
        }
            else {
                System.out.println("please typing correctly!");
            }
            }
        }
}

class SwitchExercise3{
    public static void main(String[]args){
        try(Scanner InputMonth = new Scanner(System.in)){
        int Month = InputMonth.nextInt();
        switch(Month){
            case 3:
            case 4:
            case 5:
            System.out.println("this is season of spring");
            break;
            case 6:
            case 7:
            case 8:
            System.out.println("this is season of summer");
            break;
            case 9:
            case 10:
            case 11:
            System.out.println("this is season of fall");
            break;
            case 12:
            case 1:
            case 2:
            System.out.println("this is season of winnter");
            break;
            default:
            System.out.println("please typing correctly!");

        }
        }
    }
}