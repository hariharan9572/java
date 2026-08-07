class Calculator{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public long add(long a, long b){
        return a+b;
    }
}

public class MethodOverloading {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        Calculator calc = new Calculator();

        int r1 = calc.add(num1, num2);
        int r2 = calc.add(num1, num2, num3);

        System.out.println(r1);
        System.out.println(r2);
    }
}
