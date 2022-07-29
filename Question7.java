package ProjectEuler;

/*Author: Siya Agrawal
 Date: 29/07/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,July,Friday
 Description: By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can 
 see that the 6th prime is 13.

 What is the 10 001st prime number?
 */
public class Question7 {
    //function for counting the factors
    public static int isPrime(int val){
        int factor=0;
        for (int i=1;i<=val;i++){
            if (val%i==0){
                factor++;
            }
        }
        if (factor==2) return val;
        else return 0;
    }
    public static void main(String[] args) {
        //variable declaration
        int flag=0,i=2,c=0;
        //iterating using while loop
        while(flag==0){
            //checking the number is prime or not
            if (isPrime(i)!=0)
            //counting which th element it is
            c++;
            //if it is 10001st element then displaying it 
            if (c==10001) {
                System.out.println(i);
                //update expression to terminate the loop if got the expected output
                flag=1;
                break;
            }
            //updating the value
            i++;
        }
    }
}
