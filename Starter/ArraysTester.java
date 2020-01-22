/* 
 *  Name: John Doe
 *  Login: cs8bwi20XX
 *  File: ArraysTester.java
 *  Sources of Help: None
 *
 *  CSE8B assignment 1.
 *  This tests the class FunWithIntArrays.  FunWithIntArrays is buggy, so
 *  you may wish to test with just pieces of this code before testing
 *  all of it.  We will use our own copy of this file, so when you do
 *  your final testing, ensure it is with the original.
 *  
 */

/*
 * Name:    ArraysTester
 * Purpose: To test the class FunWithIntArrays.
 */
public class ArraysTester 
{
    
  /*
   * Name:       main
   * Purpose:    To call methods in FunWithIntArrays and test them
   * Parameters: String[] args - command line arguments that are unused
   * Return:     void
   */
  public static void main(String[] args) 
  {
    
    int [] tester = {7,4,1,8,12,32,64,13};
    System.out.println("Creating Initial Array:");
    FunWithIntArrays.printArray(tester);

    //check array copy
    System.out.println("\nCreating Array Copy:");
    int [] copy = FunWithIntArrays.arrayCopy(tester);
    FunWithIntArrays.printArray(copy);

    //check range
    System.out.println("\nMax element - Min element is: "+
    FunWithIntArrays.findRange(tester));

    //check average
    System.out.println("\nAverage value is: "+
    FunWithIntArrays.findAvg(tester));

    //check reverse
    System.out.println("\nTesting Reversed Array");
    FunWithIntArrays.reverseArray(tester);
    FunWithIntArrays.printArray(tester);

    //check sort
    System.out.println("\nTesting Sorted Array");
    FunWithIntArrays.arraySort(tester);
    FunWithIntArrays.printArray(tester);
  }
}