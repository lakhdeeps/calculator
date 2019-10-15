package lucky.math;

public class Calculator<T> {

	public static Operation<Integer> addition = (a, b) -> a + b;
	public static Operation<Integer> subtraction = (a, b) -> a - b;
	public static Operation<Integer> divide = (a, b) -> a / b;
	public static Operation<Integer> multiply = (a, b) -> a * b;

	public <T> T calculate(T a, T b, Operation op) {
		return (T) op.operation(a, b);
	}
	
	
}
