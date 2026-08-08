package Others;

class Launch{
    public void abc(){
        A obj = new A();
        System.out.println(obj.marks);
    }
}

public class A {
    protected int marks = 6;

    public void show(){
        System.out.println("in A show");
    }
}
