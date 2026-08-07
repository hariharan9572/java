class Human{
    private int age;
    private String name;

    public Human(){ // Default constructor
        // System.out.println("in constructor");
        age = 24;
        name = "Jhon";
    }

    public Human(int age, String name){ // Paramerterized constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}

public class  DefaultvsParameterizedConstructor {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(12, "Hari");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());

        obj.setAge(24);
        obj.setName("Hari");

        //System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
