class ArithmeticOperators {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;

        int sum = num1 + num2; // Addition
        int difference = num1 - num2; // Subtraction
        int product = num1 * num2; // Multiplication
        int quotient = num1 / num2; // Division
        int remainder = num1 % num2; // Modulus 

        num1 += 2; // Increment num1 by 2
        num2 -= 1; // Decrement num2 by 1

        num1++; // Increment num1 by 1
        num2--; // Decrement num2 by 1
        ++num1; // Pre-increment num1 by 1
        --num2; // Pre-decrement num2 by 1

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        System.out.println("num1 after all operations: " + num1);
        System.out.println("num2 after all operations: " + num2);
    }
}