package Lab;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> counts = new TreeMap<>();

        for (double number : numbers) {
            if (!counts.containsKey(number)) {
                counts.put(number, 0);
            }

            counts.put(number, counts.get(number) + 1);
        }

        DecimalFormat df = new DecimalFormat("#.####");
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }

    }
}
