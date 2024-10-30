import java.util.function.Predicate;

public class LambdaArraySum
{
    public static int sumByCondition(int[] array, Predicate<Integer> condition)
    {
        int sum = 0;
        for (int number : array)
        {
            if (condition.test(number))
            {
                sum += number;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int[] numbers = {1, -2, 3, 4, -5, 6, 7, 8, -9, 10};
        Predicate<Integer> isEqualTo = number -> number == 4;
        System.out.println("The sum of numbers equal to 4: " + sumByCondition(numbers, isEqualTo));
        int A = 2, B = 8;
        Predicate<Integer> notInRange = number -> number < A || number > B;
        System.out.println("Sum of numbers that are not in the range from 2 to 8: " + sumByCondition(numbers, notInRange));
        Predicate<Integer> isPositive = number -> number > 0;
        System.out.println("Sum of positive numbers: " + sumByCondition(numbers, isPositive));
        Predicate<Integer> isNegative = number -> number < 0;
        System.out.println("Sum of negative numbers: " + sumByCondition(numbers, isNegative));
    }
}
