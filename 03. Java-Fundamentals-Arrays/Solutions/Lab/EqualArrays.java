package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = Arrays.stream(arr1).sum();
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Arrays are identical. Sum: " + sum);
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i] ){
                    System.out.printf("Arrays are not identical. Found difference at %d index.%n", i);
                    break;
                }
            }
        }
    }
}
