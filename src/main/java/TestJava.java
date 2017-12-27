import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestJava {
    public static void main(String[] args) {
        List dims = new ArrayList();
        dims.add("aa");
        dims.add("cc");
        Map<String, Integer> event = new HashMap<>();
        event.put("aa", 1);
        event.put("bb", 2);
        event.put("cc", 3);


        System.out.println(event.entrySet()
                .stream()
                .filter(e -> dims.contains(e.getKey()))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList()));
    }
}
