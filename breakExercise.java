import java.util.Scanner;

public class breakExercise {
    public static void main(String[]args){
        
        int Bingo = 0;
        int CountNumber =0;
        int EndNumber = 97;
        while(Bingo != EndNumber){
            int bingo =(int)(Math.random()*100)+1;
            Bingo = bingo;
            CountNumber ++;
            System.out.println(" Not yet");
            if (Bingo==EndNumber){
                break;
            } 
        }
        System.out.println("總共用了"+CountNumber+"次");

        }
    } 
    
class BreakExercise02{
    public static void main(String[]args){
        int Sum = 0;
        int Now = 1;
        for (; Now<=100;Now++){
            Sum +=Now;
            if (Sum >20){
                break;
            }            
        }
        System.out.println("現在的數字"+Now);

    }
}

class BreakExercise03{
   public static void main(String[]args){ 
    try(Scanner UserInfo = new Scanner (System.in)){
        //用戶名稱//用戶密碼//錯誤次數
        String UserInfoName = "SHIYOU";
        String UserInfoPassword = "666";
        int MissCount = 3;
        
    while (MissCount != 0){
        System.out.println("plz type username");
        String UserName = UserInfo.next();
        System.out.println("plz type password");
        String UserPassword = UserInfo.next();
        if (UserInfoName.equals(UserName)&&UserInfoPassword.equals(UserPassword)){
            System.out.println("Bingo!your Username is "+UserName+" & password is "+UserPassword);
            break;
        }else if(!(UserInfoName.equals(UserName))||
        !(UserInfoPassword.equals(UserPassword)));{
            MissCount--;
            System.out.println(
            "Your user information is wrong!");}
        if(MissCount!=0){
            System.out.println("You only have "+MissCount+" chance.");}
        else{
            System.out.println("You don't have any chance.");}
        }
        }
    }
}

