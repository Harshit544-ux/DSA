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
    }
}