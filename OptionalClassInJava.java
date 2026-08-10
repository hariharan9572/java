import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassInJava {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hari", "Divya", "Viji", "Latha");

        // Optional<String> name = names.stream()
        //                 .filter(str -> str.contains("y"))
        //                 .findFirst();

        String name = names.stream()
                        .filter(str -> str.contains("x"))
                        .findFirst()
                        .orElse("Not found");

        // System.out.println(name.orElse("Not found"));
        System.out.println(name);
    }
}
