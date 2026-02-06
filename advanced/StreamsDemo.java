import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Beijing", "Shanghai", "Shenzhen", "Hangzhou", "Chengdu");

        List<String> filtered = cities.stream()
                .filter(city -> city.startsWith("S"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("过滤后城市: " + filtered);

        Map<Integer, List<String>> grouped = cities.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("按长度分组: " + grouped);
    }
}
