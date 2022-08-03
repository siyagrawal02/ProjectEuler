package ProjectEuler;

import java.math.BigInteger;

/*Author: Siya Agrawal
 Date: 03/08/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,July,Wednesday
 Description:n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
 */
public class Question20 {
    public static void main(String[] args) {
        BigInteger n,product,sum,r[];
        n=new BigInteger("100");
        product=new BigInteger("1");
        sum=new BigInteger("0");
        while(n.compareTo(new BigInteger("1"))==1){
            product=product.multiply(n);
            n=n.subtract(new BigInteger("1"));
        }
        while(product.compareTo(new BigInteger("0"))==1){
            r=product.divideAndRemainder(new BigInteger("10"));
            sum=sum.add(r[1]);
            product=product.divide(new BigInteger("10"));
        }
        System.out.println(sum);
    }
}
