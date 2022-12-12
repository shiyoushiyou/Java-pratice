public class DoWhile{
    public static void main(String[]args){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while(i <= 100);
    }
}

class DoWhile2{
    public static void main(String[]args){
        int i = 1;
        int count = 0;
        do{
            count += i;
            i++;
        }
        while(i <= 100);
    System.out.println(count);
    }
}