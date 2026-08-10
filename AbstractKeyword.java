abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("play music");
    }
}

abstract class WagonR extends Car{ // Abstract Class
    public void drive(){
        System.out.println("Driving..");
    }
}

class UpdatedWagonR extends WagonR{ // Concerete Class
    public void fly(){
        System.out.println("Flying..");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
