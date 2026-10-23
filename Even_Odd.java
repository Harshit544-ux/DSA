class Even_Odd{
    public static void main(String [] args){

        int arr[] = {2,3,4,8,1,5,6,7};
        int even=0;
        int odd=0;

      for(int i=0;i<arr.length;i++){
          if(arr[i]%2==0){
              even++;
          }
          else{
              odd++;
          }
      }
        System.out.println("the even number = " + even);
        System.out.println("the odd number = " + odd);
    }
}