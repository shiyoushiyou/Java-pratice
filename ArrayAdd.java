import java.util.Scanner;
public class ArrayAdd {
    public static void main(String[]args)
    {
    try(Scanner InputAnswer = new Scanner(System.in))
    {
    int []arr = {1,2,3};
    while (true)
    {
    System.out.println("Your Answer:'Y'or'N'");
    char Answer = InputAnswer.next().charAt(0);    
    if(Answer =='Y')
    {
    int []arr2 = new int [arr.length+1];
    System.out.println("Give me a number: ");
    arr2[arr2.length-1] = InputAnswer.nextInt();
    arr = arr2;
    }
    else
    {
    System.out.println("Ok!End.");
    System.out.println(arr.length);
    break;
    }
    }
    }
}
}
