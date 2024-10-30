import java.util.function.BiFunction;

public class FractionOperations
{
    public static void main(String[] args)
    {
        BiFunction<Double, Double, Double> addFractions = (a, b) -> a + b;
        System.out.println("Sum: " + addFractions.apply(0.5, 0.25));
        BiFunction<Double, Double, Double> subtractFractions = (a, b) -> a - b;
        System.out.println("Difference: " + subtractFractions.apply(0.5, 0.25));
        BiFunction<Double, Double, Double> multiplyFractions = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplyFractions.apply(0.5, 0.25));
        BiFunction<Double, Double, Double> divideFractions = (a, b) ->
        {
            if (b == 0)
            {
                throw new ArithmeticException("Dividing by zero!");
            }
            return a / b;
        };
        System.out.println("Dividing: " + divideFractions.apply(0.5, 0.25));
    }
}
