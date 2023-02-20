public class RecursionExercise01 {
    /*
     * 問題：猴子每天吃總桃子數的一半+1顆，
     * 吃到第10天時桃子只剩一顆，問桃子原來有幾顆。
     * 
     * 思路
     * 1.第十天時桃子只剩1顆，day10 = 1
     * 倒推回去，之前是吃掉(總桃子數/2)-1反之，
     * 第九天時桃子的數量應該是(day10+1)*2
     * 以此類推。
     * 
     */
    public static void main(String[]args){
       T monkeyEatPeach = new T();
       int day = 9;
       int peachNum = monkeyEatPeach.peach(day);

       if(peachNum!=-1){
        System.out.println("第"+day+"天，猴子吃了"+peachNum+"顆的桃子");
       }
    }
           /* 
        * 遞規的思路→先看對象，"對象.方法(參數)"在這邊會開一個新棧，
        新棧會去執行方法。遞規是方法被呼叫後會再重新開一個新棧執行方法。
        而方法的結果將會返回至上一個呼叫方法的棧。
        由此可知，day = 9 時由於滿足if條件(day>=1 && day<=9)，所以return(peach(day+1)+1)*2
        但由於方法peach(int day)被呼叫，所以又開了新棧，而此時的day的參數

       */
}
class T{
    public int peach(int day){
        if(day==10){
            return 1;
        }
        else if(day>=1 && day<=9){
            return (peach(day+1)+1)*2;
        }
        else {
            System.out.println("超出範圍");
            return -1;
        }

    }
}
