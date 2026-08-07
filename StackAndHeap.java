class Calculator{
    int num = 5;
    public int add(int a, int b){
        return a + b;
    }
}

public class StackAndHeap {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;

        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();

        obj.num = 8;

        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}

// every methods have their own stack and local variables are part of stack not heap memory.