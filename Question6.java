package ProjectEuler;
/*Author: Siya Agrawal
 Date: 28/07/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,July,Thrusday
 Description: The sum of the squares of the first ten natural numbers is,
                1**2+2**2+...+10**2=385
The square of the sum of the first ten natural numbers is,
                (1+2+...+10)**2=55**2=3025
Hence the difference between the sum of the squares of the first 
ten natural numbers and the square of the sum is .
                3025-385=2640
Find the difference between the sum of the squares of the first 
one hundred natural numbers and the square of the sum

*/
public class Question6 {
    public static void main(String[] args) {
        //variable declaration
        int sumsq=0,sum=0;
        //iterating using loop 
        for (int i=1;i<=100;i++){
            sumsq+=(i*i);
            sum+=i;
        }
        int sqsum=sum*sum;
        System.out.println(sqsum-sumsq);
    }
    
}
