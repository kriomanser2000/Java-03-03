import java.util.function.Function;

public class Max4
{
    public static void main(String[] args)
    {
        Function<int[], Integer> maxOfFour = (numbers) ->
        {
            if (numbers.length != 4) throw new IllegalArgumentException("Must be 4 numbers");
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++)
            {
                if (numbers[i] > max)
                {
                    max = numbers[i];
                }
            }
            return max;
        };
        int[] numbers = {10, 25, 5, 15};
        System.out.println("Max from 4: " + maxOfFour.apply(numbers));
    }
}
