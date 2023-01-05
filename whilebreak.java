public class whilebreak{
    public static void main(String[]args){
        int Money = 100000;
        int count = 0;
        //因為下方有break，所以while可以直接設成無線循環
        while(true){
        if (Money>50000){
            int Payment = Money/20;
            System.out.println("Please pay the money! "+Payment);
            Money -= Payment;
            System.out.println("Available Balance: "+Money);
            count += 1;        
        }
        else if(Money>=1000)
        {
            int LowPayment = Money-1000;
            System.out.println("Available Balance: "+LowPayment);
            Money = LowPayment;
            count += 1;       
        }
        else {
            System.out.println("You don't have available balance,please chrage");
            break;
        }
        System.out.println("You could take the bus "+count+" times in total.");
        }


    }
}