/* Multiples of 3 and 5
 *
 * Question: If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Link: https://projecteuler.net/problem=1
 */

public class Problem1 {

    public static void main(String []args) {
        System.out.println(sumofmultiple(1000));
    }

    public static int sumofmultiple(int maximum){
        int sum = 0;
        for(int i=0; i < maximum; i++){
            if(i%3==0 || i%5==0){
                sum += i;
            }
        }
        return sum;
    }
}