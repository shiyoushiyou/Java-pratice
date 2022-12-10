public class ForExercise {
    public static void main(String[]args){
        //print 1~100 
    int i= 1;    
    int countNumber = 0;
    int countall = 0;
    for (;i<101;i++){
        System.out.println(i);
        if(i%9 == 0){
            countNumber +=1 ;
            countall += i;
        }

    }
    System.out.println(countNumber);
    System.out.println(countall);

    }
}
class ForExercise02{
    public static void main(String[]args){
        int i = 0;
        int j =5;
        for(;i<6;i++,j--){
            System.out.println(i+"+"+j+"="+(i+j));
        }
    }
}