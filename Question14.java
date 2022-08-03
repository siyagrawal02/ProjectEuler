package ProjectEuler;

/*
 Author: Siya Agrawal
 Date: 03/08/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,July,Wednesday
 Description:The following iterative sequence is defined for the set of positive integers:

                            n → n/2 (n is even)
                            n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

                            13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not 
been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class Question14 {
    public static void main(String[] args) {
        //variable declaration
        int number=1000000;
        long max=0;
        long startno=0, a;
        //loop to iterate
        for (int i=2;i<=number;i++){
            int count=1;
            a=i;
            while(a>1){
                //checking condition for even no
                if (a%2==0){
                    a=a/2;
                }
                //checking condition for odd no
                else{
                    a=3*a+1;
                }
                count++;
            }
            //assgining the max count to max variable and also the starting number(i) to startno variable
            if (count>max){
                max=count;
                startno=i;
            }
        }
        //displaying the result
        System.out.println(startno+" produces the largest chain i.e. "+max);
    }
}
