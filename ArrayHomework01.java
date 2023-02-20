public class ArrayHomework01 {
    public static void main(String[]args){
    //有一個list，要在裡面插入23
    int arr[] ={10,12,45,90};
    //首先創建arr2將23放入arr2
    int arr2 [] = new int[arr.length+1];
    arr2[arr2.length-1] = 23;
    //接著將arr的元素用for放入arr2
    for(int i = 0;i<arr.length;i++){
        arr2[i] = arr[i];
    }
    //創建tamp作為暫時儲存的空間，然後使用冒泡排序
    int temp =0;
    //冒泡排序是將前一個數跟後一個數相比然後重新排序，
    //所以需要雙重for因為每一次比較之後都會排序一次
    //4-y是表示index總共是4，y是當前index
    for(int y = 0;y<4;y++){
        for (int k =0;k<4-y;k++){
    //如果arr2[當前座標]>arr2[當前座標+1]
    //那就表示現在這個元素比下一個元素大，
    //所以用temp儲存arr2[k]的值，並且把arr2[k+1]的值
    //放入arr2[k]，最後再將temp的值放回arr2[k+1]完成此次排序
            if(arr2[k]>arr2[k+1]){
                temp = arr2[k];
                arr2[k] = arr2[k+1];
                arr2[k+1] = temp; 
                }
}}
    arr = arr2;
    for(int j = 0;j<arr2.length;j++){
        System.out.print(arr[j]);
}

}}
  
class ArrayHomework01_teacher{
    public static void main(String[]args){
    //老師解法，先將list擴容然後定位
    //1.先訂位要添加的元素應該放入哪個index
    //2.接著將數組擴容
    //先定義原數組
    int []arr = {10,12,45,90};
    int inserNum =23;//要增加的數
    int index = -1;//要添加元素的位置
    //如何確定元素要插入的index:走訪arr數組查詢，
    //如果發現inserNum<=arr[i]，說明arr[i]就是要插入的位置
    //接著使用index變數將index保留起來。
    //如果走訪arr之後inserNum<=arr[i]不成立，說明index = arr.length

    for(int i= 0;i<arr.length;i++){
        if(inserNum<=arr[i]){
            index = i;
            break;//找到元素所屬index後就將程序退出
        }
    }
    if(index ==-1){
        index = arr.length;
    }
    //找到index後擴容
    //先創建一個新的數組
    int [] arrNew =new int[arr.length+1];
    //要有兩個變數是因為arr的空間只有index:3，arrNew的index有4，
    //只用一個變數的話arr會因為元素不夠報錯
    for(int j =0,i = 0;j<arrNew.length;j++){
        if(j!=index){
            arrNew[j] = arr[i];
            i++;
        }
        else{
            arrNew[j] = inserNum;
        }
    }
    arr = arrNew;
    for(int k = 0;k<arrNew.length;k++){
        System.out.print(arr[k]);
    }
}
}