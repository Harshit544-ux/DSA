class Max_Min{
    public static void main (String [] args){
   
   // wap to find the maximum element in the array
      int arr[]={7,2,1,9,3,2,43,90};
      //max=7
      int max=arr[0];
      int size=arr.length;

    
      //traverse the loop
      for(int i=0;i<size;i++){
        // check conditon max ki value or baaki sb value se agar koi or value badi toh max ko update krdo 
        // max < arr[0]
        // max < arr[1]
         if(max<arr[i]){
            // max ko update krdo 
            max=arr[i];
         }
   
      }
      
      // loop khatam hu or last mein max ko print krdo
      System.out.println("the max = " + max);

   
     //wap to find the min element in the array
      int brr[]={7,2,1,9,3,2,43,90};
      
      //array ki first index value esme initialise kr diya hu
      // minValue=7
      int minValue=brr[0]; 

      for(int index=0;index<brr.length;index++){
        if(minValue>brr[index]){
            minValue=brr[index];
        }
      }  

      System.out.println("the min value is = " + minValue);



    }
}