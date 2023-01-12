public class BubbleSort 
{
public static void main(String[]args)
{
//冒泡排序，從最後開始排序起
//arr[0]跟arr[1]比較，大的會被交換位置
//然後再由交換過後的arr[1]跟arr[2]比較，持續比到最後一個元素就是最大的。
//用同樣的方式比較下一輪，直到所有元素由大到小排序完成。
int[] arr = {24, 69, 80, 57, 13};
int temp =0;
for(int i = 0;i<4;i++)
{
for (int j =0;j<4-i;j++)
{
    if(arr[j]>arr[j+1])
{
    temp = arr[j];
    arr[j] = arr[j+1];
    arr[j+1] = temp; 
}
}
System.out.println("//////////////");
for(int k = 0;k<arr.length;k++){
    System.out.print(arr[k]+"\t");
}
}
}
}
