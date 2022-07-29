package ProjectEuler;
/*Author: Siya Agrawal
 Date: 29/07/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,July,Friday
 Description:A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a**2 + b**2 = c**2
For example, 3**2 + 4**2 = 9 + 16 = 25 = 5**2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class Question9 {
    public static void main(String[] args) {
        //iterating using loops
        for (int i=1;i<=1000;i++){
            for (int j=1;j<=1000;j++){
                for (int k=1;k<=1000;k++){
                    //checking condition
                    if ((i*i+j*j==k*k)&& (i+j+k==1000)&&(i<j && j<k)){
                        //printing the product
                        System.out.println(i*j*k);
                        break;
                    }
                }
            }
        }
    }
    
}
