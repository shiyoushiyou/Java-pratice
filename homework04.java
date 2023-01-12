public class homework04 {
    public static void main(String[]args){
    int Num = 0;
    int count = 0;
    for(;Num<=100;Num++){       
        if(Num%5 != 0){
            System.out.print(Num);
            count++;
        }
        if(count%5 == 0){
            System.out.println("");

        }
    }
    }
}
