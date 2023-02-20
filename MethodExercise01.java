public class MethodExercise01 {
    public static void main(String[]args){
        AA a = new AA();
        boolean b = a.isOdd(2);
        System.out.println(b);
        a.print(10,60,'%');
    }
}
class AA{
    public boolean isOdd(int Number) {
        return Number%2!=0;
    }
    public void print(int row,int clo,char words){
        for(int i = 0;i<row;i++){
            for(int j = 0;j<clo;j++){
                System.out.print(words);
            }
            System.out.println();
        }
    }
}

