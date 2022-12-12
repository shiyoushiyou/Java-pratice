public class DowhileExercise01 {
    public static void main(String[] args) {
    int i = 1;
    int EndNum =200;
    int count = 0;
    do{
        if(i%3 != 0 && i%5 ==0){
                count += 1;
        }
        i++;
    }
    while(i <= EndNum);
    System.out.print(count);
}
}
