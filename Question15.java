package ProjectEuler;

import java.math.BigInteger;
/*Author: Siya Agrawal
 Date: 25/08/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,July,Thursday
 Description: Starting in the top left corner of a 2×2 grid, and only being able to move to the 
 right and down, there are exactly 6 routes to the bottom right corner.

 How many such routes are there through a 20×20 grid?*/
public class Question15 {
    public static BigInteger factorial(int n1){
        BigInteger n=BigInteger.ONE;
        for (int i=1;i<=n1;i++){
            n=n.multiply(BigInteger.valueOf(i));
        }
        return n;

    }
    public static void main(String[] args) {
        //variable declaration
       int n=40;
       int r=20;

       //C(n,r)=n!/r!*(n-r)!
       System.out.println(factorial(n).divide(factorial(r).multiply(factorial(n-r)))); 



    }
}
       



