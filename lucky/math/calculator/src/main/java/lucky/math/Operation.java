package lucky.math;

public interface Operation <T> {
	T operation(T a , T b); 
	default T binaryOperation(T a , T b) {
		T t =null;
		return t;
	}
}