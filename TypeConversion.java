class TypeConversion{
    public static void main(String[] args){
        byte b = 127;
        int a = 12;

        b = (byte) a; // Explicit type casting from int to byte
        System.out.println("Value of b after type casting: " + b);

        a = b; // Implicit type casting from byte to int
        System.out.println("Value of a after type casting: " + a);
    }
}