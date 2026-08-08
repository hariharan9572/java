public class WrapperClass {
    public static void main(String[] args) {
        int num = 7;
        // Integer num1 = new Integer(num); // boxing
        Integer num1 = num; // auto-boxing

        // int num2 = num1.intValue(); // unboxing
        int num2 = num1; // auto-unboxing

        System.out.println(num1);

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }
}
