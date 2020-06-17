/*****************************************
 * Kofi Meighan
 * @KM3547
 * Zipcode.java - Converts a given zipcode into a barcode, and converts
 * a given barcode into a Zipcode.
 * March 11, 2020
 ****************************************/ 
public class Zipcode
{
    private int zip;
    private String bar;    
    
    public Zipcode(int zip)
    {
        this.zip = zip;
        bar = "";
    }
    
    public Zipcode(String bar)
    {
        zip = 0;
        this.bar = bar;
    }
   
    private String intToBarcode(char charInteger)
    {
            if(charInteger == '1')
            {
                return ":::||";
            }
            else if(charInteger == '2')
            {
                return "::|:|";
            }
            else if(charInteger == '3')
            {
                return "::||:";
            }
            else if(charInteger == '4')
            {
                return ":|::|";
            }
            else if(charInteger == '5')
            {
                return ":|:|:";
            }
            else if(charInteger == '6')
            {
                return ":||::";
            }
            else if(charInteger == '7')
            {
                return "|:::|";
            }
            else if(charInteger == '8')
            {
                return "|::|:";
            }
            else if(charInteger == '9')
            {
                return "|:|::";
            }
            else if(charInteger == '0')
            {
                return "||:::";
            }
        return "||:::";
    }
    
    private int getCheckDigit()
    {
        int i = 0;
        
        //checking for leading 0's
        String zipString = String.valueOf(zip);
        if(zipString.equals("0"))
        {
            zipString = "00000";
        }
        else if(zipString.length()<5)
        {
            for(i=0;i<=(5-zipString.length());i++)
            {
                zipString = '0' + zipString;
            }
        }   
        
        int firstInt = Integer.parseInt(zipString.substring(0,1));
        int secondInt = Integer.parseInt(zipString.substring(1,2));
        int thirdInt = Integer.parseInt(zipString.substring(2,3));
        int fourthInt = Integer.parseInt(zipString.substring(3,4));
        int fifthInt = Integer.parseInt(zipString.substring(4,5));
        int digitSum = firstInt+secondInt+thirdInt+fourthInt+fifthInt;
        
        if(digitSum >= 40)
        {
            return 50 - digitSum;
        }
        else if(digitSum >= 30)
        {
            return 40 - digitSum;
        }
        else if(digitSum >= 20)
        {
            return 30 - digitSum;
        }
        else if(digitSum >= 10)
        {
            return 20 - digitSum;
        }
        else if(digitSum >= 0)
        {
            return 10 - digitSum;
        }
        return 0;
    }
    public String getBarcode()
    {   //checking for leading 0's
        String zipString = String.valueOf(zip);
        System.out.println(zipString);
        int i;
        
        if(zipString.equals("0"))
        {
            zipString = "00000";
        }
        else if(zipString.length()<5)
        {
            for(i=0;i<=(5-zipString.length());i++)
            {
                zipString = '0' + zipString;
            }
        }
        System.out.println(zipString);
        
        bar = "|";
        for(i=0;i<(zipString.length());i++)
        {
            bar = bar + intToBarcode(zipString.charAt(i));
        }
        char checkDigit = (char) (getCheckDigit() + '0');
        System.out.println(intToBarcode(checkDigit));
        bar = bar + intToBarcode(checkDigit) + "|";  
        return bar;
    }
    
    //barcode to int
    private int barcodeToInt(String barcode)
    {
            if(barcode.equals(":::||"))
            {
                return 1;
            }
            else if(barcode.equals("::|:|"))
            {
                return 2;
            }
            else if(barcode.equals("::||:"))
            {
                return 3;
            }
            else if(barcode.equals(":|::|"))
            {
                return 4;
            }
            else if(barcode.equals(":|:|:"))
            {
                return 5;
            }
            else if(barcode.equals(":||::"))
            {
                return 6;
            }
            else if(barcode.equals("|:::|"))
            {
                return 7;
            }
            else if(barcode.equals("|::|:"))
            {
                return 8;
            }
            else if(barcode.equals("|:|::"))
            {
                return 9;
            }
            else if(barcode.equals("||:::"))
            {
                return 0;
            }
        return 0;
    }
    
    public String getZIPcode()
    {
        String digitOne = (bar.substring(1,6));
        String digitTwo = (bar.substring(6,11));
        String digitThree = (bar.substring(11,16));
        String digitFour = (bar.substring(16,21));
        String digitFive = (bar.substring(21,26));
        
        int zipCode = ((barcodeToInt(digitOne)*10000)
                       +(barcodeToInt(digitTwo)*1000)
                       +(barcodeToInt(digitThree)*100)
                       +(barcodeToInt(digitFour)*10)
                       +(barcodeToInt(digitFive));
        String zipCodeString = String.valueOf(zipCode);
        
        int i = 0;
        if(zipCodeString.equals("0"))
        {
            zipCodeString = "00000";
        }
        else if(zipCodeString.length()<5)
        {
            for(i=0;i<=(5-zipCodeString.length());i++)
            {
                zipCodeString = '0' + zipCodeString;
            }
        }
        return zipCodeString;
    }
    
    
}