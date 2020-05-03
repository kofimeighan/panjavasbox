/**
*
* @author: KOFI MEIGHAN
* @date: 2/16/20
*
*/
import java.util.Scanner;
public class E63d
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a string letters:");
    String string_input = input.nextLine();
    int vowel_count = 0;
    int i = 0;
    while(i<string_input.length())
    {
        if((string_input.charAt(i) == 'a')||(string_input.charAt(i) == 'e')||(string_input.charAt(i) == 'i')||(string_input.charAt(i) == 'o')||(string_input.charAt(i) == 'u'))
        {
            vowel_count++;
        }
    i++;
    }  
    System.out.println("There are "+vowel_count+" vowels in your string.");
    }
}
