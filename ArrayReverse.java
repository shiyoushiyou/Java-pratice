public class ArrayReverse
{
public static void main(String[]args)
{
    int[] Arr1 = {11,22,33,44,55,66};
    for (int i = 0;i<Arr1.length;i++)
    {
    Arr1[i] = (i-Arr1.length)*11; 
    System.out.println(Arr1[i]);
    }   
    }
}
class ArrayReverse1{
public static void main(String[]args)
{
int[] Array1 = {11,22,33,44,55,66};
int[] Array2 = new int[Array1.length];

for (int j = 0,k = Array1.length-1;k >= 0;j++,k--)
{
Array2[j] = Array1[k]; 
System.out.println(Array2[j]);
}

}
}