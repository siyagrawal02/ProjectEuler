package ProjectEuler;
/*
 Author: Siya Agrawal
 Date: 27/07/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,July,Wednesday
 Description: Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class Question2 {
    public static void main(String[] args) {
        //variable declaration
        int a=0,b=1,c=0,sum=0;

        //loop for below 4000000 values
        while(c<4000000){
            c=a+b;
            //checking for even fibonacci values
            if (c%2==0)
            {
                //summing even values
                sum+=c;
            }
            //swapping values
            a=b;
            b=c;
        }
        //printing the sum
        System.out.println(sum);
    }
}
