class StringPractice{

   static void printString(String str){
    //str="Love"
    int lengthOfString =str.length();

       for(int i=0;i<lengthOfString;i++){
           char ch=str.charAt(i);
           System.out.println(ch + " ");
       }
       
   }

   static int getLengthOfString(String str){
      int n=str.length();
      int count=0;

       for(int i=0;i<n;i++){
           char ch=str.charAt(i);
           count++;
       }

       return count;
   }

   static int  getVowelCount(String str){

      int n = str.length();
      int count = 0;
      for(int i=0;i<n;i++){

           char ch = str.charAt(i);

         // a , e, i , o , u
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
               count++;
          }          
      }

         return count;
     
       
   }
    
   static void reverseOfString(String str){
        int lengthOfString=str.length();
         
         for(int i=lengthOfString-1;i>=0;i--){
             char ch=str.charAt(i);
             System.out.println(ch);
         }
    
    }



    public static void main(String[] args){

   String str="Love Babbar";
   
    printString(str); 
    int receiveLengthOfString = getLengthOfString(str);
     System.out.println("the length of string =  " + receiveLengthOfString);
    int receiveTotalVowels = getVowelCount(str);
     System.out.println("the total vowels in particular string = " + receiveTotalVowels);
   
      reverseOfString(str); //call the function
   






        
    }
}