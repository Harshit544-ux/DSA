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

   
   //Access of string
   // always used charAt(i)

   String str_1="Garvit Srivastava";
   System.out.println(str_1.charAt(0));
   System.out.println(str_1.charAt(1));
   System.out.println(str_1.charAt(5));
   System.out.println(str_1.charAt(7));
   System.out.println(str_1.charAt(13));

   System.out.println(str_1.length());


  //Compare String
    String strs1="Harshit";
    String strs2="Harshit";

    System.out.println(strs1==strs2);//true

    String strs1="Harshit";
    String strs2="Har";
    System.out.println(strs1==strs2);//false

   
    String strs1="Harshit";
    String strs2="HarShit";
    System.out.println(strs1.equals(strs2));//true

    String strs1="Harshit";
    String strs2="HarShit";
    System.out.println(strs1.equals(strs2)); //Case Sensitive :- false

    String strs1="Harshit";
    String strs2="HaRsHit";
    System.out.println(strs1.equalsIgnoreCase(strs2));//true 










    }




}

