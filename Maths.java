class Maths {

    static void printDigit(int num){
          //num=53127;

         while(num!=0){
             int digit=num%10;
             System.out.println(digit);
             num=num/10;
         }
          
         
     }

    static int reverseNumber(int num){
       //num=8941;
            int ans=0;
       //0!=0 condition is false then it outside the loop
       while(num!=0){
   
       //1.separate the digit
           int digit = num%10;

        //2.applies the formulae ans=ans*10+digit
           ans=ans*10+digit;

           //3. removing the digit from num
           num=num/10;
           // System.out.println(num);

       }
       //4.return ans
       return ans;
   }

    static int countSumOfDigit(int num){
        //receive num=53127;

        //initialize the sum =0 for adding the purpose
        int sum=0;
        //0!=0 condition false
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }

        return sum;
        
    }

    static boolean isPallendrome(int num){
        int originalNum=num;
        int reversedNum=reverseNumber(originalNum);

        if(originalNum==reversedNum)
            return true;
        else
            return false;
    }

    static boolean isArmstrongNumber(int num){
        int original=num;
        int sum=0;

       while(num!=0){
           int digit = num%10;
           int cubeDigit=digit*digit*digit;

           sum=sum+cubeDigit;

           num=num/10;
       }

        return sum == original;
    }


    
    public static void main(String[] args) {
        int num;
        // printDigit(num=53127);
        // System.out.println(reverseNumber(num=53127)) ;
        // System.out.println(countSumOfDigit(num=53127)) ;
        // System.out.println(isPallendrome(num=1221)) ;
          System.out.println( isArmstrongNumber(num=153)) ;
    }
}