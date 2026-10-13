class Base {
    //  static void print2Table(){

    //    for(int i=1;i<=10;i++){
    
    //     System.out.println(2*i);

    //    }

    //   }


//    static void solve(){
//     System.out.println("Babbar");
//    }


// Parameter vs Non-Parameter

// static void printSum(int a, int b){
//     System.out.println("Parameter = " + a+b);
// }

// static void printSum(){
//    int a=1 ;
//    int b=2;
//    System.out.println("Non paramter = "+ a+b);
// }



  static int add(int p, int q){
    
    int sum = p+q;
    return sum;
   }

   static int multiplication(int p, int q){
    
    int sum = p*q;
    return sum;
   }


    public static void main (String[] args){

     
    //   print2Table();
    //   System.out.println("Hi");
    //   solve();
    //   System.out.println("Bye");

    // printSum();
    // printSum(2,3);


   int ans =  add(2,3);
   System.out.println("ans -> "+ans);
   int ans1=multiplication(1,3);

   System.out.println("an1 -> " + ans1);
//    System.out.println("ans_ =",ans1);

    }
}