public class Doubleforloop {
    public static void main(String[]args){
        for (int i = 0; i<2; i++){
            for (int j = 0; j<3 ;j++){
                System.out.println("i = " +i+" , j = "+j);
            }
        }
    }
}
// for i loop in frist round i = 0, get into the for j loop, for j loop in frist round j =0 → 2nd =1 3rd = 2
// so print               Ans:  [i = 0 j = 0] [i = 0 j = 1] [ i = 0 j = 2]
//2nd i=1 , j =0 , 1 , 2. Ans:  [i = 1 j = 0] [i = 1 j = 1] [ i = 1 j = 2]