import java.util.function.Function;

public class Min4
{
    public static void main(String[] args)
    {
        Function<int[], Integer> minOfFour = (numbers) ->
        {
            if (numbers.length != 4) throw new IllegalArgumentException("Must be 4 numbers");
            int min = numbers[0];
            for (int i = 1; i < numbers.length; i++)
            {
                if (numbers[i] < min)
                {
                    min = numbers[i];
                }
            }
            return min;
        };
        int[] numbers = {10, 25, 5, 15};
        System.out.println("Min from 4: " + minOfFour.apply(numbers));
    }
}
