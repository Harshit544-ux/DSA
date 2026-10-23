class Arrays{
    public static void main(String[] args){

    //   int arr[]={8,5,7,6};
    //   int sizeOfArray=arr.length;

    //   for(int i=0;i<=sizeOfArray-1;i++){
    //     System.out.println(arr[i]+" ");
    //   }

    //sum of an array
    int arr[]={8,5,7,6};
    int sizeOfArray=arr.length;
    int sum=0;

   for(int i=0;i<sizeOfArray;i++){
      int val=arr[i];
      sum = sum+val;
   }

   System.out.print("the sum value should be " + sum);










    }
}