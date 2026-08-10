import java.util.HashMap;
import java.util.Hashtable;

public class Map {
    public static void main(String[] args) {
        java.util.Map<String, Integer> students = new HashMap<>();  // keys are set and values are list.
        // java.util.Map<String, Integer> students = new Hashtable<>();

        students.put("Hari", 56);
        students.put("Divya", 23);
        students.put("Viji", 67);
        students.put("Pooja", 92);
        students.put("Divya", 45);

        // System.out.println(students);
        // System.out.println(students.get("Hari"));
        System.out.println(students.keySet());

        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key) );
        }
        
    }
}
