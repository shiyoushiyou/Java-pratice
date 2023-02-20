import java.util.Scanner;
public class Method01{
    public static void main(String[]args){
    Member p1 =new Member();
    p1.cal02();

    }
}
class Member{
    String name;
    int age;
    public void speak(){
        System.out.println("我是一個好人");
}
    public void cal01(){
        int Num = 1000;
        int count = 0;
        for(int i = 1;i<=Num;i++){
            count +=i;
        }
        System.out.println(count);
    }
    public void cal02(){
        try(Scanner inputNum = new Scanner(System.in)){
        System.out.println("給我一個數字");
        int Num = inputNum.nextInt();
        int count = 0;
        for(int i =1;i<=Num;i++){
            count += i;
        }
        System.out.println("總和為: "+count);
        }
        
    }
    }
     
