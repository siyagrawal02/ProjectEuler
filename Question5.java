package ProjectEuler;
/*
 Author: Siya Agrawal
 Date: 28/07/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,July,Thrusday
 Description: 2520 is the smallest number that can be divided by each of the numbers 
 from 1 to 10 without any remainder.

 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Question5 {
    public static void main(String[] args) {
        //variable declaration
        int min=0,flag=0,i=1;

        //loop to iterate till the smallest positive number is found
        while(flag==0){
            int factor=0;
            //dividing the number with 1..20 each
            for (int j=1;j<=20;j++){
                //checking if it is evenly divisible by the numbers
                if (i%j==0){
                    factor++;
                }
            }
            //checking if the factor is equal to 20 and assigning minimum number(i) to min 
            if (factor==20 && min<i){
                min=i;
                flag=1;
            }
            //update expression
            i++;

         
        }
        //printing the smallest value divisible by each 1 to 20
        System.out.println(min);
    }
    
}
