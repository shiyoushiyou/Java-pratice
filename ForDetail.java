public class ForDetail {
    public static void main(String[]args){
        int count  =3;
        for(int i = 0, j =0;i<count;i++,j+=2){
            System.out.println("i="+i+"j="+j);
            //Frist time i= 0 ,j =0 , i<count is ture ,so print "i=0 j=0" then i+1 and j+2
            //i = 1 j =2
            //Second time i=1,j =2 ,i <count is ture,so print "i=1 j=2" then i+1 and j+2
            //i = 2 j = 4
            //3rd time i=2,j =4 ,i <count is ture,so print "i=2 j=4" i+1 and j+2
            //i =3 j =6
            //4th time i =3, j=6 i<count is False,for loop will stop.
        }
    }
}
