public class ArrayExercise01 {
    public static void main(String[]args){
    char []word =new char [27];
    int index =0;
    //存放數組元素的方式，word[i] = 某個值
    for(int i = 65;i<65+26;i++)
    {
        word[index] = (char)i;
        index++;
    }
    for(int j = 0;j<=26;j++)
    {
    System.out.print(word[j]);   
    }
    }}
