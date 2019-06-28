package lucky.math;

public class Calculator<T> {
	
	public Operation<Integer> getAddition() {
		return addition;
	}
	public void setAddition(Operation<Integer> addition) {
		this.addition = addition;
	}
	public Operation<Integer> getSubtraction() {
		return subtraction;
	}
	public void setSubtraction(Operation<Integer> subtraction) {
		this.subtraction = subtraction;
	}
	public Operation<Integer> getDivide() {
		return divide;
	}
	public void setDivide(Operation<Integer> divide) {
		this.divide = divide;
	}
	public Operation<Integer> getMultiply() {
		return multiply;
	}
	public void setMultiply(Operation<Integer> multiply) {
		this.multiply = multiply;
	}
	Operation <Integer> addition = (a , b) -> a+b;
	Operation <Integer> subtraction = (a , b) -> a-b;
	Operation <Integer> divide = (a , b) -> a/b;
	Operation <Integer> multiply = (a , b) -> a*b;
}
