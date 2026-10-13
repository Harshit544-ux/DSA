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

static void printSum(int a, int b){
    System.out.println("Parameter = " + a+b);
}

static void printSum(){
   int a=1 ;
   int b=2;
   System.out.println("Non paramter = "+ a+b);
}


    public static void main (String[] args){

     
    //   print2Table();
    //   System.out.println("Hi");
    //   solve();
    //   System.out.println("Bye");

    printSum();
    printSum(2,3);

    }
}