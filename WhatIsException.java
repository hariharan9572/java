class Calc{
    public int add(int n1, int n2){
        return n1+n2+1; // Logical Error.
    }
}

public class WhatIsException {
    public static void main(String[] args) {
        // System.out.Println(); // compile time error
        System.out.println();
        
        Calc obj = new Calc();
        int result = obj.add(2, 2);
        System.out.println(result); // expect output: 4 but actal output is 5.
    }
}
