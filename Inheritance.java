public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        int r3 = obj.mul(5, 3);
        int r4 = obj.div(15, 4);
        int r5 = obj.power(4,2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
