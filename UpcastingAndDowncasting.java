class A{
    public void show1(){
        System.out.println("in A Show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("in B Show");
    }
}


public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        // double d = 4.5;
        // int i = (int) d;

        // System.out.println(i); // Typecasting

        // A obj = (A) new B(); // Upcasting no need to mention (A) new B() -> usaully works in "A obj = new B();"
        A obj = new B(); // Upcasting
        obj.show1();

        B obj1 = (B) obj; // Downcasting
        obj1.show2();
    }
}
