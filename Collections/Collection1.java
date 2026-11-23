import java.util.*;

class Collections{
    public static void main(String [] args){

// List 
   List<Integer> list = new ArrayList<>();
   list.add(10);
   list.add(290);
   list.add(30);
   list.add(10);
   System.out.println(list);


//ArrayList

ArrayList<String> name=new ArrayList<>();
name.add("Ram");
name.add("Shyam");
name.add("Ganesh");

System.out.println(name);


//get - index access through element

System.out.println(name.get(0));
System.out.println(name.get(1));

//set
name.set(0,"Harshit");
System.out.println(name);

name.add("Raj");
name.add("tam");
name.add("hanesh");

System.out.println(name);

//remove
name.remove(4);
System.out.println(name);
name.remove(4);
System.out.println(name);

//size()
System.out.println("size of an arrayList = " + name.size());


//[Harshit, Shyam, Ganesh, Raj]
System.out.println(name);

//contains
System.out.println(name.contains("Raj")); //true

System.out.println(name.contains(0)); //false , it's not present in the list


//clear 
name.clear(); // remove the entire elements
System.out.println(name); // [] empty array

System.out.println(name.isEmpty());





//traverse the loop

// 1.loop

ArrayList<Integer> list1 = new ArrayList<>();

list1.add(10);
list1.add(20);
list1.add(30);

for(int i = 0; i < list1.size(); i++) {

    System.out.println(list1.get(i));

}

System.out.println("======");

// 2.for each loop

for(Integer num:list1){
    System.out.println(num);
}

System.out.println("======");


// 3.Iterator

Iterator<Integer> it = list.iterator();

while(it.hasNext()) {

    System.out.println(it.next());

}


















































 }
}