import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TryWithResources{
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = 0;
        // BufferedReader br = null;

        // try{
            
        //     // InputStreamReader in = new InputStreamReader(System.in);
        //     br = new BufferedReader(new InputStreamReader(System.in));

        //     num = Integer.parseInt(br.readLine());

        //     System.out.println(num);



        //     // System.out.println("Bye");

        // }
        // // catch(Exception e){
        // //     System.out.println("Something went wrong");
        // //     // System.out.println("Bye");
        // // }
        // finally{
        //     // System.out.println("Bye");
        //     br.close();
        // }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){ // try with resources

            num = Integer.parseInt(br.readLine());

            System.out.println(num);

        }
    }
}