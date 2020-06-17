/**
 * This program implements the algorithm created by Fredrich Gauss 
 * for determining the date of Easter
 * 
 * @author: KOFI MEIGHAN
 * @date: 2/9/19
 */

import java.util.Scanner;

public class Easter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year to determine a date of Easter during that year:");
        int y = input.nextInt();
        int a = y%19;
        //System.out.println(a);
        int b = y/100;
        int c = y%100;
        //System.out.println(b+" "+c);
        int d = b/4;
        int e = b%4;
        //System.out.println(d+" "+e);
        int g = ((8*b)+13)/25;
        //System.out.println(g);
        int h = ((19*a)+b-d-g+15)%30;
        //System.out.println(h);
        int j = c/4;
        int k = c%4;
        //System.out.println(j+" "+k);
        int m = (a+(11*h))/319;
        //System.out.println(m);
        int r = ((2*e)+(2*j)-k-h+m+32)%7;
        //System.out.println(r);
        int n = (h-m+r+90)/25;
        //System.out.println(n);
        int p = (h-m+r+n+19)%32;
        //System.out.println(p);
        System.out.println("Easter falls on day "+p+" of month "+n+".");
        
        
    }
}	
