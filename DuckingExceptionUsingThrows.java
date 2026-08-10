// class A{
//     public void show(){
//         try{
//             Class.forName("Calc");
//         }catch(ClassNotFoundException e){
//             System.out.println("Not able to find the class");
//         }
//     }
// }

class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}

public class DuckingExceptionUsingThrows {

    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {

        // try{
        //     Class.forName("Calc");
        // }catch(ClassNotFoundException e){
        //     System.out.println("Not able to find the class");
        // }

        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
