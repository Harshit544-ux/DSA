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


    static void isEvenOrOdd(int n){
        int evenCount = 0;
        int oddCount = 0;

        for(int i=1;i<=n;i++){           
            if(i%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
       System.out.println("Total Even Count " + evenCount);
       System.out.println("Total Odd Count " + oddCount);


    }

   static int productOfDigits(int n){
    //n=234

    int product=1;
    //condition false when n==0
    // 0!=0 -> false
    while(n!=0){
        int digit=n%10;
        product=product*digit;
        n=n/10;
    }
    return product;

   }
    
  
  static boolean perfectNumber(int n){
    
   int sum=0;
   for(int i=1;i<n;i++){
    if(n%i==0){
        sum = sum + i;
    }
   }

   return sum == n;

  }


    public static void main(String[] args) {
        int num;
        // printDigit(num=53127);
        // System.out.println(reverseNumber(num=53127)) ;
        // System.out.println(countSumOfDigit(num=53127)) ;
        // System.out.println(isPallendrome(num=1221)) ;
        // System.out.println( isArmstrongNumber(num=153)) ;

        //  isEvenOrOdd(num=15) ;
        //  System.out.println(productOfDigits(num=234)); 
          System.out.println(perfectNumber(num=6)); 
    }

}