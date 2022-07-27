package ProjectEuler;
/*
 Author: Siya Agrawal
 Date: 27/07/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,July,Wednesday
 Description: If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 we get 3,5,6 and 9. The sum of these multiples is 23.

 Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Question1 {
    public static void main(String[] args)
    {
        //variable declaration
        int sum=0;

        //for every number until 1000
        for (int i=3;i<1000;i++){
            //checking if the number is divisible by 3 or 5
            if ((i%3==0) || (i%5==0)){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
