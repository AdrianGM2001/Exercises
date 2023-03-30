/* DESCRIPTION:
   You are given an array (which will have a length of at least 3, but could be very large) containing integers.
   The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. 
   Write a method that takes the array as an argument and returns this "outlier" N. */

package algorithms;

class FindTheParityOutlier {
    
    public int par(int[] integers) {
        /* We create two variables; "parity" will be positive if we are dealing with even numbers and negative if they are odd,
         * "i" will be a counter variable that will be used in loops and for the index of the number to be returned. */
        int parity = 0;
        int i;

        /* We take the first 3 numbers in the array and check if they are even, in that case we add 1 to "parity",
         * otherwise we subtract 1. The "parity" variable will always be greater or less than 0. */
        for (i = 0; i < 3; i++) {
            parity += (integers[i] & 1) == 0 ? 1 : -1;
        }
        
        if (parity > 0)
            /* We look for the odd number. */
            for (i = 0; (integers[i] & 1) == 0; i++);
        else
            /* We look for the even number. */
            for (i = 0; (integers[i] & 1) != 0; i++);
        
        /* The number of position "i" is returned. */
        return integers[i];
    }
}
