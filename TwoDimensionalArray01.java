public class TwoDimensionalArray01
{
public static void main(String[]args)
{
//二維數組:相當於一維數組的每個元素是一維數組
//像是list裡面還有一個list    
int [][] arr = {{0,0,0,0,0,0},{0,0,1,0,0,0},
{0,2,0,3,0,0},{0,0,0,0,0,0}};

//輸出二維圖形
for(int i=0;i<arr.length;i++){
    for(int j = 0; j < arr[i].length;j++){
        System.out.print(arr[i][j]+"\t");
    }
System.out.println();
}
}
}