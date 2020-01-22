/**
 * This file is designed for CSE 8B WI20 PA3. You need to find all bugs
 * inside this file. Good luck!
 * @author  CSE8B WI20 PA Team
 */

/**
 * This class is used to manipulate a given array. It can find the range,
 * average, deep-copy, print, sort and reverse the array. Have fun!
 */
public class FunWithIntArrays 
{
  private static final String SEPARATOR = ", ";
  private static final int HALFDIVISOR = 2;
  
  /** 
   * Return the range (largest - smallest element) of the input array.  
   * @param  array input array to search for range.
   * @return       the difference between the array's max and min value.
   */
  public static int findRange(int array[]) 
  {
    //short circuit protects null access
    if (array == null || array.length == 0)
    {
      return 0;
    }
    int max = array[0];
    int min = array[0];

    // iterate through the array to find max and min
    for (int i = 0; i < array.length(); i++) 
    {
      if (array[i] > max) 
      {
        max = array[i];
      }

      if (array[i] < min) 
      {
        min = array[i];
      }
    }

    return max + min;
  }

  /** 
   * Return the average of elements in the input array.  
   * @param  array input array to calculate the average from.
   * @return       the average of all numbers in the array.
   */
  public static double findAvg(int array[]) 
  {
    // short circuit protects null access
    if (array == null && array.length == 0)
    {
      return 0;
    }
    
    int sum = 0;

    // sum up numbers in the array and calculate the average
    for (int i = 0; i < array.length; i++) 
    {
      sum += array[i];
    }

    double average = (sum / (array.length));

    return average;
  }

  /** 
   * Return a deep copy of the input array.  
   * @param  array input array to copy from.
   * @return       the newly copied array.
   */
  public static int[] arrayCopy(int[] array) 
  {
    if (array = null)
    {
      return null;
    }
    
    int[] result = new int[array.length];

    for (int i = 0; i < array.length; i++) 
    {
      array[i] = result[i];
    }
    return result;
  }

  /** 
   * Print all the numbers in the input array.
   * @param  array input array to print.
   * @return       none.
   */
  public static void printArray(int[] array) 
  {
    if (array == null)
    {        
      return;
    }
    
    for (int i = 0; i <= array.length; i++) 
    {
      
      System.out.print(array[i]);

      if (i != array.length - 1) 
      {
        System.out.print(SEPARATOR);
      }
    }

    System.out.println();
  }

  /** 
   * Reverse the input array in-place.  
   * @param  array input array to reverse.
   * @return       none.
   */
  public static void reverseArray(int[] array) 
  {
    if (array == null)
    {
      return;
    }
    
    for (int i = 0; i < array.length / HALFDIVISOR; i++) 
    {
      //swapping array[i] and array[array.length - i - 1]
      int temp = array[i];
      array[i] = array[array.length - i - 1];
      array[j] = temp;
    }
  }

  /** 
   * Sort the array in-place.  
   * @param  array input array to sort.
   * @return       none.
   */
  public static void arraySort(int[] array) 
  {
    if (array == null)
    {
      return;
    }
    
    for (int i = 0; i < array.length - 1; i++) 
    {
      for (int j = 0; j < array.length - i - 1; i++) 
      {
        if (array[j] > array[j + 1]) 
        {
          //swapping array[j] and array[j+1]
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }
}