import java.util.*;
 public class Main
 {
     public static int[] multiply(int[] arr1, int[] arr2)
     {
         int k, m, indicator = 0; // k --> (smaller array length value) m --> (biggest array length value)
         if(arr1.length>arr2.length) // if first array bigger than second one:
         {
             m = arr1.length;
             k = arr2.length;
             indicator = 1; //save 1 to indicate it for later use
         }
         else if(arr1.length<arr2.length) // if second array bigger than first one:
         {
             m = arr2.length;
             k = arr1.length;
             indicator = 2; //save 2 to indicate it for later use
         }
         else // if both arrays are of same value
         {
            k = arr2.length;
            m = arr2.length;
            //we leave indicator as 0 by defualt;
         }
         int[] output = new int[m]; //set output array size to the bigger array one
         for(int i = 0; i<m; i++) //loop thru every index of the output array
         {
             if(i<k) //if the index is valid for smaller array:
             {
                 output[i] = arr1[i]*arr2[i]; // enter the multipication
             }
             else //otherwise continue filling with values of the bigger array
             {
                 switch(indicator) //depending on the situation fill acordingly to the indicator
                 {
                     case 1: //if 1/arr1 is the bigger array:
                         output[i] = arr1[i];
                         break;
                     case 2: // if 2/arr2 is the bigger array:
                         output[i] = arr2[i];
                         break;
                 }
             }
         }
         return output; //return the new array
     }
     public static Scanner reader = new Scanner(System.in);
     public static void main(String[] args)
     {
         int[] arr1 = {1, 1, 3, 4}; //custom array for testing
         int[] arr2 = {2, 4, 12}; //custom array for testing
         System.out.println(Arrays.toString(multiply(arr1, arr2))); //printing result
     }
 }