import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hari", "Divya", "Viji");

        // List<String> uNames = names.stream()
        //                         .map(name -> name.toUpperCase())
        //                         .toList();

        List<String> uNames = names.stream()
                                .map(String :: toUpperCase) // method reference
                                .toList();

        // System.out.println(uNames);

        // uNames.forEach(i -> System.out.println(i));
        uNames.forEach(System.out :: println); // method reference

        
    }
}
