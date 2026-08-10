// abstract class A{
//     public abstract void show();
//     public abstract void config();
// }

interface A{ 
    int age = 24;  // final and static
    String area = "Mumbai";

    void show();  // In behind public abstarct
    void config();
}

class B implements A{
    public void show(){
        System.out.println("in show");
    }

    public void config(){
        System.out.println("in config");
    }
}

public class WhatIsInterface {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.area);
    }
}
