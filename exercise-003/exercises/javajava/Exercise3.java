
public class Exercise3 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 77, 49, 20};
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        System.out.printf("Sum is %s%n", sum);
    }
}
