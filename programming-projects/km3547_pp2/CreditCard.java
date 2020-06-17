//*Kofi Meighan
//*KM3547
//*CreditCard.java - Algorithm made to check if a 12 digit credit card number
//*is valid 
//*February 23, 2019
public class CreditCard
{
    public int errorCode;
    private String creditCardNumber;//string given by scanner from tester class
    
    public CreditCard(String creditCardNumber)
    {
        this.creditCardNumber = creditCardNumber;
        errorCode = 0;
    }
    
    private void check1()
    {
        int firstDigit = Integer.parseInt(creditCardNumber.substring(0,1));
        
        if(firstDigit != 4)
        {
            errorCode = 1;
        }
    }
    
    private void check2()
    {
        int fourthDigit = Integer.parseInt(creditCardNumber.substring(3,4));
        int fifthDigit = Integer.parseInt(creditCardNumber.substring(5,6));

        if(fourthDigit != (fifthDigit+1))
        {
            errorCode = 2;
        }
    }
    
    private void check3()
    {
        int firstDigit = Integer.parseInt(creditCardNumber.substring(0,1));
        int fifthDigit = Integer.parseInt(creditCardNumber.substring(5,6));
        int ninthDigit = Integer.parseInt(creditCardNumber.substring(10,11));

        if(firstDigit*fifthDigit*ninthDigit != 24)
        {
            errorCode = 3;
        }
    }
    
    private void check4()
    {
        int firstDigit = Integer.parseInt(creditCardNumber.substring(0,1));
        int secondDigit = Integer.parseInt(creditCardNumber.substring(1,2));
        int thirdDigit = Integer.parseInt(creditCardNumber.substring(2,3));
        int fourthDigit = Integer.parseInt(creditCardNumber.substring(3,4));
        int fifthDigit = Integer.parseInt(creditCardNumber.substring(5,6));
        int sixthDigit = Integer.parseInt(creditCardNumber.substring(6,7));
        int seventhDigit = Integer.parseInt(creditCardNumber.substring(7,8));
        int eighthDigit = Integer.parseInt(creditCardNumber.substring(8,9));
        int ninthDigit = Integer.parseInt(creditCardNumber.substring(10,11));
        int tenthDigit = Integer.parseInt(creditCardNumber.substring(11,12));
        int eleventhDigit = Integer.parseInt(creditCardNumber.substring(12,13));
        int twelfthDigit = Integer.parseInt(creditCardNumber.substring(13,14));
        //^^^^^^^ instead of declearing it as an instance variable
        //I declared them in each method
        
        if((firstDigit+secondDigit+thirdDigit+fourthDigit+fifthDigit
           +sixthDigit+seventhDigit+eighthDigit+ninthDigit+tenthDigit
           +eleventhDigit+twelfthDigit)%4 != 0)
        {
            errorCode = 4;
        }
    }
    
    private void check5()
    {
        int firstDigit = Integer.parseInt(creditCardNumber.substring(0,1));
        int secondDigit = Integer.parseInt(creditCardNumber.substring(1,2));
        int thirdDigit = Integer.parseInt(creditCardNumber.substring(2,3));
        int fourthDigit = Integer.parseInt(creditCardNumber.substring(3,4));
        int ninthDigit = Integer.parseInt(creditCardNumber.substring(10,11));
        int tenthDigit = Integer.parseInt(creditCardNumber.substring(11,12));
        int eleventhDigit = Integer.parseInt(creditCardNumber.substring(11,12));
        int twelfthDigit = Integer.parseInt(creditCardNumber.substring(12,13));

        if((firstDigit+secondDigit+thirdDigit+fourthDigit)
           == (ninthDigit+tenthDigit+eleventhDigit+twelfthDigit-1))
        {
            errorCode = 5;
        }
    }
    
    private void check6()
    {
        int firstAndSecondDigit = 
        Integer.parseInt(creditCardNumber.substring(0,2));
        int seventhAndEighthsecondDigit = 
        Integer.parseInt(creditCardNumber.substring(7,9));

        if((firstAndSecondDigit+seventhAndEighthsecondDigit) != 100)
        {
            errorCode = 6;
        }
    }
    
    public int getErrorCode() 
    {
        return errorCode;
    }
    
    public boolean check()//check method that calls every preceding check method
    {
        //vvvvvvvv checking if any of the criterion was not met
        check1();
        if(!(errorCode==0))
        {
            return false;
        }
        check2();
        if(!(errorCode==0))
        {
            return false;
        }
        check3();
        if(!(errorCode==0))
        {
            return false;
        }
        check4();
        if(!(errorCode==0))
        {
            return false;
        }
        check5();
        if(!(errorCode==0))
        {
            return false;
        }
        check6();
        if(!(errorCode==0))
        {
            return false;
        }
        return true;
    }
    
    public boolean isValid() //returning if all the checks were passed
    {
        if(check())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}