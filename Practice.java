 class Main{


  static int sumOfDigit(int n){

    // int n=5345;
    int sum=0;
    while(n!=0){
    int digit = n%10;
    sum=sum+digit;

    n=n/10;
   }
   
   return sum;

  }



 static int reverse(int n){
   int reverse=0;

   while(n!=0){
    
    int remainder = n%10;
    reverse=reverse*10+remainder;
    n=n/10;
   }
   return reverse;

 }

 static boolean pallendrome(int n){
   
   int original=n;
   int reverse=0;

   while(n!=0){

     int remainder=n%10;
     reverse=reverse*10+remainder;
     n=n/10;
   }
   if(reverse==original)
   return true;
   else
   return false;
 }


 static boolean isArmstrong(int n){
        //n=153
        int original=n;
        int sum=0;
        while(n!=0){
        int digit = n%10;
        int value = digit*digit*digit;
        sum=sum+value;
        n=n/10;

        }
        
        if(original == sum){
            return true;
        }
        else { 
            return false;
        }

  }



    static boolean isPrime(int n){

        if(n <= 1) return false;
        //n=6;

        for(int i=2;i<n;i++){
            if(n%2==0){
                return false;
            }

        }
    return true;
    }






      static void printDigit(int n){
           //int n=5345

           while(n!=0){
           //separate the digit
               int digit=n%10;
               System.out.println(digit);

            //remove the number 
            n=n/10;

           }


      }



   public static void main (String[] args){

    int num=153;
    // printDigit(num);
//    System.out.println(sumOfDigit(num));
    //  System.out.println(isArmstrong(num));
    //  System.out.println(isPrime(num=7));

    //    System.out.println(reverse(num=123));
       System.out.println(pallendrome(num=121));
   }



 }