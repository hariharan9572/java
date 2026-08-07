class Human{
    private int age;
    private String name;

    public Human(){
        // System.out.println("in constructor");
        age = 24;
        name = "Jhon";
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

public class Constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());

        obj.setAge(24);
        obj.setName("Hari");

        //System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
