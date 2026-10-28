class Maths{
    //print the digit 
      static void printDigit(int num){
       
       //int num = 72812


       //condition false when 0!=0
       while(num!=0){
       
       int digit = num%10;
       System.out.println("the digit is = " + digit);

       num=num/10;

       }



      }
   
    public static void main(String [] args){
        
        int num= 72812;

        //call the function
        printDigit(num);
    
     
  




    }
}