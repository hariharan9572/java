// class Computer{

// }

// class Laptop extends Computer{

// }

class A{
    public void show(){
        System.out.println("in A Show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B Show");
    }
}

class C extends A{
     public void show(){
        System.out.println("in C Show");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        // Computer obj1 = new Laptop();
    }
}
