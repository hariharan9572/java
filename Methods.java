class Computer{
    public void playMusic(){
        System.out.println("Music Playing..");
    }

    public String getPen(int cost){
        if(cost >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}

public class Methods {
    public static void main(String[] args){
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getPen(5);
        System.out.println(str);
    }
}
