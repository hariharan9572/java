abstract class A{
    public abstract void show();
    public abstract void config();
}

// class B extends A{
//     public void show(){
//         System.out.println("in B Show");
//     }
// }

public class AbstarctAndAnonumousInnerClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("in new Show");
            }

            public void config(){
                System.out.println("in Config");
            }
        };
    }
}
