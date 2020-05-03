/**
*
* @author: KOFI MEIGHAN
* @date: 2/16/20
*
*/
import java.util.Scanner;
public class E63e
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a string letters:");
    String string_input = input.nextLine();
    int i = 0;
    String index_list = "";
    while(i<string_input.length())
    {
        if((string_input.charAt(i) == 'a')||(string_input.charAt(i) == 'e')||(string_input.charAt(i) == 'i')||(string_input.charAt(i) == 'o')||(string_input.charAt(i) == 'u')||(string_input.charAt(i) == 'A')||(string_input.charAt(i) == 'E')||(string_input.charAt(i) == 'I')||(string_input.charAt(i) == 'O')||(string_input.charAt(i) == 'U'))
        {
            int index = string_input.indexOf(string_input.charAt(i));
            index_list = index_list + "," + string_input.indexOf(string_input.charAt(i));
        }
    i++;
    }
    System.out.println(index_list);
    }
}