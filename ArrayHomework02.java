public class ArrayHomework02 {
    public static void main(String[]args){
    int[]arr = new int[10];
    for(int i = 0;i<arr.length;i++){
    int Num = (int)(Math.random()*100)+1;
    arr[i] = Num;
    }
    int temp = 0;
    for(int i = 0;i<arr.length-1;i++){
        for(int j = 0;j<9-i;j++){
            if(arr[j]<arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp; 
                }

        }
    }
    int count = 0;
    for(int k = 0;k<arr.length;k++){
        System.out.print(arr[k]);
        count += arr[k];
        if (arr[k]==8){
            System.out.println("數組裡面有8");
        }
    }
    System.out.println();
    System.out.println("arr list的最大數為 : "+arr[0]);
    System.out.println("arr list的平均值為 : "+count/arr.length);


    }
}
