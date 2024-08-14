package constructor.chaining;

public class Person {
    String name; int age;

    public Person(String name,int age){          // constructor 1
        this.name=name;
        this.age=age;

    }
    public Person(String name){

        this(name,0); // calling constructor with 0 age

    }

    public static void main(String[] args) {
        Person p1=new Person("SHLOK", 4);
        Person p2=new Person("SACHIN");
        System.out.println(p1.name +  " " + p1.age);
        System.out.println(p2.name +  " " + p2.age);

    }
}


