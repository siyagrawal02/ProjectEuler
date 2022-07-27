package ProjectEuler;
/*
 Author: Siya Agrawal
 Date: 27/07/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,July,Thrusday
 Description: The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */

public class Question10 {
    public static long isPrime(long val){
        int factor=0;
        for (long i=1;i<=val;i++){
            if (val%i==0)
                factor++;
        }
        if (factor==2) return val;
        else return 0;
    }
    public static void main(String[] args) {
        long sum=0;
        for (long i=1;i<=2000000L;i++){
            if (isPrime(i)!=0) sum+=i;

        }
        System.out.println(sum);
    }
}
