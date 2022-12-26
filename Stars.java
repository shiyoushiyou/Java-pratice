public class Stars {
    public static void main(String[]args){
    //印金字塔
    int limit = 5;

    for(int i = 1; i<=limit;i++){
        for (int x =1; x <=limit-i;x++){
            System.out.print(" ");}
        for(int j = 1;j <=2*i-1;j++){
            if(j==1||j == 2*i-1 || i == limit){
            System.out.print("*");
        }else{
            System.out.print(" ");}
        }System.out.println("");}
}
}


