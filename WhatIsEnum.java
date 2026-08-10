enum Status{
    Running, Failed, Pending, Success;
}

public class WhatIsEnum {
    public static void main(String[] args) {
        // int i = 5;
        //  Status s = Status.Running;
        //  System.out.println(s.ordinal());

        Status[] ss = Status.values();

        // for(int i=0;i<ss.length;i++){
        //     System.out.println(ss[i]);
        // }
        for(Status s : ss){
            System.out.println(s + " : " + s.ordinal());
        }
    }
}
