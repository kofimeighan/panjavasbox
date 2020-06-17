/**
*
* @author: KOFI MEIGHAN
* @date: 2/16/20
*
*/
import java.util.Scanner;
public class E63b
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a string letters:");
    String string_input = input.nextLine(); 
    int i=0;
    String second_letter = "";
    for(i=0;i<(string_input.length());i+=2)
        second_letter = second_letter + string_input.charAt(i); 
    System.out.println(second_letter);   
    }
}