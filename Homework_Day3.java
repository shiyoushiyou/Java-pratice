import java.util.Random;
import java.util.Scanner;

public class Homework_Day3 {
    public static void main(String[]args){			
        }
    }    


class practice3_6{//練習　3-6
    public void practice_3_6(){
        //①画面に「【数あてゲーム】」と表示する。	
        System.out.println("【数あてゲーム】");				
        //②0から9までの整数の中からランダムな数を1つ生成して変数ansに代入する。
        Random r =new Random();
        Scanner Sca = new Scanner(System.in);
        //③for文を用いた「5回繰り返すループ」を作る。
        //その際に以下の④～⑦は、ループの中に記述する。				
        for(int i = 0;i<=5;i++){
            int ans = r.nextInt(10);	
            //④画面に「0～9の数字を入力してください0」と表示する。	
            System.out.println("0~9の数字を入力してください");				
             //⑤数字を入力し、変数numに代入する。
            int num = Sca.nextInt();
            //⑥もし変数numが変数ansと等しかったら「アタリ！」と画面に表示して繰り返しを終了する。	
            if( num == ans){
                System.out.println("アタリ！");		
                break;		
            }else{
            //⑦もし変数numが変数ansと等しくない場合は「違います」と表示する。		    				
                System.out.println("違います！");				
            }
        }	
        //⑧繰り返しのブロックの外側で、「ゲームを終了します」と画面に表示する。		
        System.out.println("ゲームを終了します！");				

        
        
    }
}

class AppleStore{//从AppleStore下载
    public void AppDonload(){
        /*
        * 1.刷脸验证
            刷脸成功 直接下载
            刷脸失败 进行密码验证
        2.密码验证
            密码验证成功 直接下载
            密码验证失败 再次输入密码
            如果输入密码失败次数达到三次 账号锁定
        * 
        */
        Random r =new Random();
        Scanner Sca = new Scanner(System.in);
        int falsecount = 0;
        String userPassword = "Hello123";
        System.out.println("請進行Face ID認證");
        int ans = r.nextInt(2);
        switch (ans){
            case 1:
                System.out.println("Face ID認證成功!");
                break;
            default:
                System.out.println("Face ID認證失敗，請輸入密碼驗證!");

            for(int i = 0;i<=2;i++){
                String password = Sca.next();
                if(password.equals(userPassword)){
                    System.out.println("認證成功，下載APP");
                    break;
                    
                }else{
                    System.out.println("認證失敗");
                    falsecount++;
                    if(falsecount==3){ 
                    System.out.println("密碼錯誤超過3次，帳號鎖定。");
                    break;
                    }
            }
        }         
        }
    }
}

class triangle{
    public void NineNineTriangle(){
        //階梯式99乘法表
        for(int j =9;j>=1;j--) {
            for(int k = 8;k>=j;k--){
                System.out.print("\t");
            }
            for(int i = j;i>=1;i--){
                System.out.print(i*j+"\t");

            }
        System.out.println();
        }

        for(int j =1;j<=9;j++) {
            for(int k = 11-j;k<=9;k++){
                System.out.print("\t");
            }
            for(int i = j;i<=9;i++){
                System.out.print(i*j+"\t");

            }
        System.out.println();
        }
  }
}