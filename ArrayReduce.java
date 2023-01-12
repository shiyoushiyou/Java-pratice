import java.util.Scanner;
public class ArrayReduce
{
public static  void main(String[]args)
{
try(Scanner inputanswer = new Scanner(System.in))
{
int []arr ={1,2,3,4,5};
while(true)
{
System.out.println("Did you Would like to reduce the list? Y/N :");
char Answer = inputanswer.next().charAt(0);    
if(Answer =='Y'&& arr.length>1)
{
int []arr2 = new int[arr.length-1];
for (int i =0;i<=arr2.length-1;i++)
{
arr2[i] =arr[i];
System.out.println(arr2[i]);
}
arr =arr2;
}
else if(Answer =='Y'&&arr.length<=1)
{
System.out.println("You couldn't reduce the list anymore!");
break;
}
else
{
System.out.println("OK! it's end!");
break;
}
}
}
}
}
