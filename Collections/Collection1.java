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




//LinkedList

LinkedList<Integer> ll = new LinkedList<>();

ll.add(10);
ll.add(20);
ll.add(30);
ll.add(40);

System.out.println("LinkedList = > " + ll);


LinkedList<String> ll1 = new LinkedList<>();

ll1.add("Harsh");
ll1.add("20");
ll1.add("30");
ll1.add("40");

System.out.println("LinkedList = > " + ll1);

ll1.addFirst("5");
ll1.addFirst("Ram");
ll1.addFirst("Lakshman");

System.out.println("LinkedList = > " + ll1);

ll1.addLast("8");
ll1.addLast("Modi");

System.out.println("LinkedList = > " + ll1);

System.out.println(ll1.getFirst());
System.out.println(ll1.getLast());

ll1.removeFirst();
System.out.println(ll1);
System.out.println(ll1.getFirst());

ll1.removeLast();
System.out.println(ll1);
System.out.println(ll1.getLast());



//Vector

Vector<Integer> vector = new Vector<>();
vector.add(11);
vector.add(11);
vector.add(12);
vector.add(13);
System.out.println("Vector => " + vector);

vector.addElement(67);
vector.addElement(77);
System.out.println(vector);

//get

System.out.println(vector.firstElement());
System.out.println(vector.lastElement());




//Stack

Stack<Integer> stack = new Stack<>();
stack.push(10);
stack.push(20);
stack.push(30);

System.out.println("Stack == > " + stack);

System.out.println(stack.pop());
System.out.println(stack);

System.out.println(stack.peek());

stack.push(30);
stack.push(40);
stack.push(50);
stack.push(20);
System.out.println(stack);
System.out.println(stack.peek());

System.out.println(stack.isEmpty());
System.out.println(stack.search(20));
































 }
}