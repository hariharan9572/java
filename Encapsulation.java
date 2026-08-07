class Human{
    private String name;
    private int age;

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }

    public void setName(String n){
        name = n;    
    }

    public String getName(){
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(24);
        obj.setName("Hari");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
