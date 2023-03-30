/* DESCRIPTION:
   If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
   Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
   Note: If the number is a multiple of both 3 and 5, only count it once. */

package algorithms;

class Multiples3Or5 {

    public int solution(int n) {
        /* To get the number of multiples less than n, subtract 1 from n. */
        n--;
        /* Use integer division with 3 and 5, after obtain the multiples of 15 using n5. */
        int n3 = n / 3;
        int n5 = n / 5;
        int n15 = n5 / 3;
        
        /* Now we can express the numbers as a sum from the first multiple to the last:
         * 
         * The general formula:
         *      Sum(n = 1, n) (n) = (n * (n + 1)) / 2
         * 
         * Refactor the formula:
         *      Sum(n = 1, n) (n) = (n++ * n) >> 1
         * 
         * Applying the formula to multiples of 3, 5 and 15:
         *      (3 * n3++ * n3) >> 1
         *      (5 * n5++ * n5) >> 1
         *      (15 * n5++ * n5) >> 1
         * 
         * Grouping everything and simplifying, we are left with:
         */
        return (3 * n3++ * n3 + 5 * n5++ * n5 - 15 * n15++ * n15) >> 1;
    }
}