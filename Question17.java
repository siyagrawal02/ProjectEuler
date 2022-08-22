package ProjectEuler;

/*Author: Siya Agrawal
 Date: 22/08/22
 Email: siya02.agrawal@gmail.com
 Published on: 2022,July,Monday
 Description:If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. 
The use of "and" when writing out numbers is in compliance with British usage.
 */
public class Question17 {
    public static int countOfDigits(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int mid(int n){
        //returning the mid element
        int x=n%100;
        int midelement=x/10;
        return midelement;
    }
    public static void main(String[] args) {
        String ones[]={"one","two","three","four","five","six","seven","eight","nine"};
        String tens[]={"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String elevnToNine[]={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        int count=0;
        for(int n=1;n<=1000;n++){
            if (countOfDigits(n)==1){
                count+=ones[n-1].length();
            }

            //two digit
            else if(countOfDigits(n)==2){
                if (n%10==0){
                    count+=tens[(n/10)-1].length();
                }
                else{
                    //11 to 19
                    if (n/10==1){
                        count+=elevnToNine[(n%10)-1].length();
                    }
                    //21 to 99
                    else{
                        count+=tens[(n/10)-1].length()+ones[(n%10)-1].length();
                    }

                }
            }
            else if(countOfDigits(n)==3){
                count+=10;
                //for 100, 700, 400 etc
                if (n%10==0 && mid(n)==0){
                    count+=ones[(n/100)-1].length()-3;
                }
                //for 520,280 etc 
                else if(n%10==0){
                    count+=ones[(n/100)-1].length()+tens[mid(n)-1].length();
                }
                //for 203,501 etc
                else if(mid(n)==0){
                    count+=ones[(n/100)-1].length()+ones[(n%10)-1].length();
                }
                //for 112, 316, 712 etc
                else if(mid(n)==1){
                    count+=ones[(n/100)-1].length()+elevnToNine[(n%10)-1].length();
                }
                //for 564, 327 etc
                else{
                    count+=ones[(n/100)-1].length()+tens[mid(n)-1].length()+ones[(n%10)-1].length();
                }
            }
            else{
                count+=("onethousand").length();
            }
        }
        System.out.println(count);
    }
}
