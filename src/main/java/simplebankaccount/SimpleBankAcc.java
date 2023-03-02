package simplebankaccount;

import java.util.logging.Logger;
import java.util.Scanner;

public class SimpleBankAcc{
    private static final Logger log = Logger.getLogger("InfoLogging");
    Scanner sc = new Scanner(System.in);
    String userName;
    long accNumber;
    double balance;

    SimpleBankAcc(){
        log.info("Enter user name: ");
        userName = sc.nextLine();
        log.info("Enter account number: ");
        accNumber = sc.nextLong();
    }
    void deposit(){
        log.info("Enter amount to deposit: ");
        double amt = sc.nextDouble();
        String print = ""+Double.toString(amt)+"Amount credited: "+amt+" INR";
        log.info(print);
        balance += amt;
    }
    void withdrawal(){
        log.info("Enter amount to withdraw: ");
        double withdrawAmt = sc.nextDouble();
        if(withdrawAmt < balance){
            balance-=withdrawAmt;
            String print1 = "Amount Withdrawed: "+withdrawAmt;
            log.info(print1);
        }
        else
        {
            log.info("Insufficient funds, try again.");
        }
    }
    void checkBalance(){
        String print3 = "Your balance is "+balance+" INR";
        log.info(print3);
    }
}
