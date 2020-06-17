/**
*
* @author: KOFI MEIGHAN
* @date: 2/16/20
*
*/
import java.util.Scanner;
public class E63c
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a string letters:");
    String string_input = input.nextLine();
    String new_string = " ";
    int i=0;
    while(i<string_input.length())
    {
        if((string_input.charAt(i) == 'a')||(string_input.charAt(i) == 'e')||(string_input.charAt(i) == 'i')||(string_input.charAt(i) == 'o')||(string_input.charAt(i) == 'u'))
            new_string = new_string + "_";
        else
            new_string = new_string + string_input.charAt(i);    
    i++;
    }
    System.out.println(new_string);
    }
}
    