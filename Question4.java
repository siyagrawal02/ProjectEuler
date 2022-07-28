package ProjectEuler;

public class Question4 {
    /*
 Author: Siya Agrawal
 Date: 28/07/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,July,Thrusday
 Description: A palindromic number reads the same both ways. The largest palindrome made from 
 the product of two 2-digit numbers is 9009 = 91 × 99.

 Find the largest palindrome made from the product of two 3-digit numbers.
 */

    //reversing the number 
    public static int reverse(int n)
    {
        int r=0;
        while(n!=0)
        {
            int x=n%10;
            r=(r*10)+x;
            n=n/10;
        }
        return r;
    }
    public static void main(String[] args) {

        //variable declaration
        int max=0;

        //loop to iterate over all the three digit numbers
        for(int i=100;i<1000;i++)
        {
            for (int j=100;j<1000;j++){

                //checking if the number is palindrome or not and if it is larger than max value
                if ((i*j)==reverse(i*j) && (i*j)>max){
                    max=i*j;
                }   
            }
        }

        //printing the maximum palindrome number
        System.out.println(max);
    }
}
