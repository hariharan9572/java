@FunctionalInterface
interface A{
    void show(int i);
}

// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }
// }

public class LambdaExpression {
    public static void main(String[] args) {
        A obj = i -> System.out.println("in Show " + i);

        obj.show(5);
    }
}
