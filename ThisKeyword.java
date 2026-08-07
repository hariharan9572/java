class Human{
    private int age;
    private String name;

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

// this - this keyword refer to the current object.

public class ThisKeyword {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(24);
        obj.setName("Hari");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
