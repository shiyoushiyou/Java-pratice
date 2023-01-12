import java.util.Scanner;
public class Array01 {

    //用Scanner的方式
    public static void main(String[]args){
    try(Scanner InputNum = new Scanner(System.in)){
    Double Totle =0d;
    for(int i = 0;i<=5;i++){
        Double Weight =InputNum.nextDouble();
        Totle += Weight;
    }
    System.out.println("The totle weight is: "+Totle);
    System.out.println("The average weight is: "+Totle/6);

    }
    }
    
}
//使用Array的方式
class Array02{
    public static void main(String[]args){
        double[]hens ={3,5,1,3.4,2,50};
        double henweight = 0;
        int TotleLen  = hens.length;
    for (int i=0;i<6;i++){
        henweight += hens[i];
    }
    System.out.println("The totle weight is:"+henweight);
    System.out.println("The average weight is:"+henweight/TotleLen);

    }
}