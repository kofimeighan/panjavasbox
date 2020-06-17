/**
*
* @author: KOFI MEIGHAN
* @date: 2/16/20
*
*/
import java.util.Scanner;
public class E63a
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a string letters:");
    String string_input = input.nextLine();
    String uppercase_string = "";
    int i=0;
    while(i<string_input.length())
    {
        if(Character.isUpperCase(string_input.charAt(i)))
        {
            uppercase_string = uppercase_string + string_input.charAt(i);//System.out.println(string_input.charAt(i));
        }
    i++;
    }
    System.out.println(uppercase_string);
    }
}