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
