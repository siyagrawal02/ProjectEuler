package ProjectEuler;
/*
 Author: Siya Agrawal
 Date: 27/07/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,July,Wednesday
 Description: The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
public class Question3 {
    //creating isPrime function to check if the number is prime or not
    public static long isPrime(long val)
    {
        int factor=0;
        //counting the number of factors the number has
        for (long i=1;i<=val;i++){
            if(val%i==0){
                factor++;
            }
        }

        if(factor==2)
        return val;
        return 0;
    }
    public static void main(String[] args) {
        //variable declaration
        long max=0;

        for(long i=1;i<=600851475143L;i++)
        {
            //checking whether it is factor or not
            if((600851475143L)%i==0){
                if (isPrime(i)!=0 && i>=max){
                    max=i;
                }
                
            }
        }
        System.out.println(max);
        
    }
}
