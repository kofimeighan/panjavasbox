/**
*
* @author: KOFI MEIGHAN
* @date: 2/16/20
*
*/
public class BankAccountTester
{
    public static void main(String[] args)
    {
        BankAccount myaccount = new BankAccount("KOFI!",123456789);
        myaccount.deposit(1000);
        myaccount.withdraw(500);
        myaccount.withdraw(400);
        System.out.println("The expected amount of money in your account is $100.0, and the actual amount in your bank account is $"+myaccount.getBalance());    }
}