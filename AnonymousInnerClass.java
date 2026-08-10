class A{
    public void show(){
        System.out.println("in A Show");
    }
}

// class B extends A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
               System.out.println("in new Show"); 
            }
        };
        obj.show();
    }
}