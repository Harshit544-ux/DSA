class Strings{
    public static void main(String[] args){

     //string ko banate kaise hai 
     String str = "Love Babbar";
     System.out.println(str);


     String str1=new String("Harshit");
     System.out.println(str1);


     //name1 or name2 are referred to same value = Love
     String name1="Love";
     String name2="Love";
     System.out.println(name1);
     System.out.println(name2);


    //String immutable - in java string ko change nhi kya jaa sakta hia jab usko ek baar declare kar chuke hai
    String name="Harshit";
    // name[0]="G"; // it occur error 
    System.out.println(name);


   //Length()
   String name3="Harshit Srivastava";
   System.out.println(name3.length());//18

   String name4="Love Babbar";
   System.out.println(name4.length());//11











    }




}

