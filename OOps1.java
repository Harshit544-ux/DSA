// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Car {

    String brand;
    String color;
    int price;

    void start(){
        System.out.println("starting the car ");
    }

    
    public static void main(String[] args) {

      //creating the object
        Car c = new Car();
        Car c1=new Car();
        Car c2=new Car();

        c.brand="BMW";
        c.color="Blue";
        c.price=500;

        c1.brand="Audi";
        c1.color="Black";
        c1.price=50000;

        c2.brand="Lamborigin";
        c2.color="Orange";
        c2.price=60000;
        

        System.out.println(c.brand);
        System.out.println(c.color);
        System.out.println(c.price);

        
        System.out.println(c1.brand);
        System.out.println(c1.color);
        System.out.println(c1.price);

        System.out.println(c2.brand);
        System.out.println(c2.color);
        System.out.println(c2.price);

        

        c.start();
        c1.start();
        c2.start();

        
    }
}




class Student{

    String name;
    int id;
    int age;

    void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(age);
    }

     void sleep(){
         System.out.println("sleep");
     }
    
    
    public static void main(String[] args){

     Student s1=new Student();
     s1.name="Azhar";
     s1.id=1;
     s1.age=18;

     s1.display();
     s1.sleep();

        
     Student s2=new Student();
     s2.name="Garvit";
     s2.id=12;
     s2.age=128;

     s2.display();
     s2.sleep();
    

        
    }

    
     
}



class Mobile{

   String brand;
   int price;

  void call(){
      System.out.println(brand + "calling");
  }

    public static void main (String[] args){

     Mobile m1=new Mobile();
        m1.brand="Samsung";
        m1.price=10000;
       System.out.println(m1.brand);
       System.out.println(m1.price);
        
    }

    
}


ENCAPSULATION

class Bank{

    private int balance;

   public int getBalance(){
       return balance;
   }


   public void setBalance(int amount){

       if(amount>0){
           balance=amount;
       }
       else{
           System.out.println("invalid balance");
       }
  

  }

 public static void main(String[] args){
     Bank b=new Bank();
     System.out.println(b.getBalance()); // 0
     b.setBalance(5000);
     System.out.println(b.getBalance()); //5000
 }    





class Employee{

    private int salary;

    public int  getSalary(){
        return salary;
    }

    public void setSalary(int salary){

        if(salary>=1000){
                this.salary=salary;
        }
        else{
            System.out.println("invalid salary");
        }

    }
    

    public static void main(String[] args){
        Employee e=new Employee();
        System.out.println(e.getSalary());

        e.setSalary(3000);

        System.out.println(e.getSalary());


        
        
    }
    
}


class Student{

    private int age;


    public int getAge(){
        return age;
    }

    public void setAge(int age){

        if(age>=18 && age<=100){
            this.age=age;
        }
        else{
            System.out.println("age must be above to 18");
        }
        
    }

public static void main(String [] args){

    Student s=new Student();
    s.setAge(8880);

    System.out.println("the age is " + s.getAge());
    

    
}
    
    
}



class User{

    private String password;

     public void setPassword(String password){

          if(password.length()>=8){
              this.password=password;
          }
         else{
             System.out.println("invalid password");
         }
         
     }

      public boolean checkPassword(String enteredPassword){
         return password!=null && password.equals(enteredPassword);
     }

    
    




    public static void main (String [] args){

        User user=new User();
        user.setPassword("Harshit");
        System.out.println(user.checkPassword("Harshit"));
        

        
    }

    
}





Paramterize constructor

class Student{

   int age;
   String name;

    Student(int age, String name){

      this.age=age;
      this.name=name;
        
    }

   void display(){

   System.out.println("student age and name is " + age + "  " + name);

       
   }
    
    public static void main(String [] args){
        Student s=new Student(9,"harshit");
        s.display();
    }

    
}


class Employee{

    String name;
    int salary;
    int age;

   Employee(String name,int salary, int age){

       this.name=name;
       this.salary=salary;
       this.age=age;
       
   }

    void display(){
        System.out.println(" name = " + name + " salary  = " + salary + " age  = " + age);
    }
    

public static void main(String[]args){

  Employee e=new Employee("Harshit",50000,18);

  e.display();
    
    
}
    
}

class BankAccount{

    private String accountHolder;
    private int balance;

    BankAccount(String accountHolder,int balance){
           System.out.println("constructor inside " + balance);

         this.accountHolder=accountHolder;

        if(balance>=0){
            System.out.println(balance);
            this.balance=balance;
        }
        
    }

    public int getBalance(){
     return balance;    
    }

    public String getAccountHolder(){
        return accountHolder;
    }
    
 
public static void main(String[] args){

    BankAccount b = new BankAccount("Harshit",5000);

    System.out.println(b.getAccountHolder());
    System.out.println(b.getBalance());

    
}

    
}