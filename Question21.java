package ProjectEuler;
/*Author: Siya Agrawal
Date: 16/09/22
Email: siya02.agrawal@gmail.com
Published on: 2022,September,Friday
Description:Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000. */

public class Question21 {
    public static int sumOfFactors(int a){
        int sumOfFactors=0;
        for (int i=1;i<a;i++){
            if (a%i==0){
                sumOfFactors+=i;
            }
        }
        return sumOfFactors;
    }
    public static void main(String[] args) {
        int sumOfAmicableNumbers=0;
        for (int i=2;i<=10000;i++){
            int sumOfFactorsOfi=sumOfFactors(i);
            if (sumOfFactorsOfi!=sumOfFactors(sumOfFactorsOfi) && sumOfFactors(sumOfFactorsOfi)==i){
                sumOfAmicableNumbers+=i;
            }
        }
        System.out.println(sumOfAmicableNumbers);
    }
}
