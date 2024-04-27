package Exercise;
import java.math.BigInteger;
import java.util.*;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a= new BigInteger(scanner.nextLine());
        BigInteger b= new BigInteger(scanner.nextLine());
        System.out.println(a.multiply(b));

    }
}
