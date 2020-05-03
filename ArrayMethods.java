/*
* KOFIMEIGHAN
*
* KM3547 
*
* ArrayMethods.java - Methods corresponding to E7.11 in Big Java
*/

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayMethods 
{

	// private instance variables
	private int[] values;
	// this is for  resetting purposes, otherwise not needed
	private int[] originalValues; 

	//constructor
	public ArrayMethods(int[] initialValues) 
    {
		values = initialValues;
		originalValues = Arrays.copyOf(values, values.length);
	}

	// pretty printing for testing purposes
	public void printArray() 
    {
		for (int i : values)
        {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	// resetting back to original values for testing purposes
	public void resetValues() 
    {
		values = Arrays.copyOf(originalValues, originalValues.length);
	}

	// a. swap the first and last elements
	public void swapFirstAndLast() 
    {
        int tempFirst = values[0];
        values[0] = values[(values.length)-1];
        values[(values.length)-1] = tempFirst;
	}

	// b. shift all element to right and wraparound
	public void shiftRight() 
    {
        int[] temp = new int[values.length];
        for(int i = 0; i<values.length-1; i++)
        {
            temp[i+1] = values[i];
        }
        temp[0]=values[(values.length)-1];
        values=temp;
	}

	// c. replace even elements with zero
	public void replaceEven() 
    {
        for(int i = 0; i< values.length; i = i+2)
        {
            values[i] = 0;
        }
	}

	// d. replace middle elements with larger of two neighbors 
	public void replaceMiddle() 
    {
        int[] temp = new int[values.length];
        //int largest;
        temp[0]=values[0];
        temp[(values.length)-1] = values[(values.length)-1];
        if(values.length>2)
        {
            for(int i = 1; i<values.length-1; i++)
            {
                if(values[i-1]>values[i+1]) 
                {
                    temp[i]=values[i-1];
                }
                else 
                {
                    temp[i] = values[i+1];
                }
            }
        }
        values = temp;
	}

	// e. Remove middle one or two elements
	public void removeMiddle() //return an array that is smaller
    {

        int j=0;
        // if original array is of size 1 or 2, return empty array
        if((values.length)<=2)
        {
            int[] temp = new int[0];
            values = temp;
        }
            //if original array is greater than size 2
        else
        {
  
         // values length is even and greater than 2     
            if((values.length)%2 == 0)
            {
                
                int[] temp = new int[(values.length)-2];
                for(int i=0; i<values.length; i++)
                {
                    if(((i != values.length/2)) 
                       && (i != ((values.length)/2)-1))
                    {
                        
                        temp[j]=values[i];
                        j++;
                    }
                }
                values=temp;
            }
            //values length is odd and greater than 2
            else
            {
                int[] temp = new int[(values.length)-1];
                for(int i=0; i<values.length; i++)
                {
                    if(i != (values.length/2))
                    {
                        temp[j]=values[i];
                        j++;
                    }
                }
                values=temp;
            }   
        }
    }
        
     

	// f. Move even elements to the front
	public void moveEven() 
    {
        int index = 0;
        int[] temp = new int[values.length];
        
        for(int i = 0; i<values.length; i+=2)
        {
            temp[index] = values[i];
            index++;
        }
        
        for(int j = 1; j<values.length; j+=2)
        {
            temp[index] = values[j];
            index++;
        }
        
        values = temp;
	}

	// g. Return second-largest element
	public int secondLargest()
    {
        //checking if the length doesn't equal 1
        int largest;
        int secondLargest;
        if(values.length!=1)
        {
            if(values[0]>values[1])
            {
                largest = values[0];
                secondLargest = values[1];
            }
            else
            {
                largest = values[1];
                secondLargest = values[0];
            }
        }
        else
        {
            System.out.println("There is only 1 element in this array.");
            largest = values[0];
            secondLargest = values[0];
        }
        
        for(int i = 0; i<values.length; i++)
        {
            for(int j = i+1; j<values.length; j++)
            {
               if(values[j] > largest)
                {
                    secondLargest = largest;
                    largest = values[j];
                }         
            }
        }
        return secondLargest;
	}

	// h. Check if sorted in increasing order
	public boolean sortedIncreasing() 
    {
        boolean sorted = true;
        for(int i = 0; i<values.length-1; i++)
        {
            if(values[i]<values[i+1])
            {
                sorted = true;
            }
            else
            {
                return false;
            }
        }
        return true;
	}

	// i. Check if contains two adjacent duplicate elements
	public boolean adjacentDups() 
    {
        for(int i = 0; i<values.length-1; i++)
        {
            if(values[i]==values[i+1])
            {
                return true;          
            } 
        }
        return false;
	}

	// j. Check if contains any duplicate elements
	public boolean containsDups() 
    {
        int dupCounter = 0;
        for(int element:values)
        {
           for(int checkingElement:values)
           {
               if(element==checkingElement)
               {
                   dupCounter++;
               }
               
           }
           if(dupCounter >= 2)
           {
               return true;
           }
           else
           {
               dupCounter = 0;
           }
        }
        return false;
		// O(n^2)
		// your code here
	}
}
