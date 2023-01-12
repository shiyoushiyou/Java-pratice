public class ArrayExercise02 {
    public static void main(String[]args){
    
    int[] MaxMin = {4,-1,9,10,23,77,101};
    int Max = MaxMin[0];
    for (int i =1;i<MaxMin.length;i++)
    {
        if (Max<MaxMin[i])
        {
            Max = MaxMin[i];
            continue;
        }
    }
    System.out.println(Max);
    }
}

