import java.util.Scanner;

public class ticketsystem {
    public static void main(String[]args){
    try(Scanner Ticket = new Scanner(System.in)){
    System.out.println("which month would you like to pick up?");
    int Month = Ticket.nextInt();
    System.out.println("how old are You?");
    int Age = Ticket.nextInt();

    int ticketfee = 60; 
    if(Month>=4 && Month<=10){
        if(Age > 60)
            System.out.print("you could have the discount,the fee is"+ticketfee/3) ;           
        else if( Age < 18)
            System.out.print("you could have the discount,the fee is"+ticketfee/2);            
        else 
            System.out.print("you couldn't have the discount,the fee is "+ticketfee);            
        }
    else{
        if(Age > 60)
        System.out.print("you could have the discount,the fee is"+ticketfee/3) ;           
        else
        System.out.print(+ticketfee-20);           
    }    
    }    


    }
}
