package ProjectEuler;

import java.math.BigInteger;

/*Author: Siya Agrawal
 Date: 30/07/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,July,Saturday
 Description:2**15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2**1000? */
public class Question16 {
    public static void main(String[] args) {
        //variable declaration using BigInteger as it has more capacity
        BigInteger r,n,power,m,sum;
        n=new BigInteger("2");
        //calculation the power using pow()
        power=n.pow(1000);
        m=new BigInteger("10");
        sum=new BigInteger("0");
        //iterating using while loop till power is greater than 0
        while(power.signum()!=0){
            //getting the last digit as remainder using mod()
            r=power.mod(m);
            //summing the remainder
            sum=sum.add(r);
            //dividing the power by 10 to reduce it's number of digits
            power=power.divide(m);
        }

        //displaying the sum
        System.out.println(sum);
        
    }
}
