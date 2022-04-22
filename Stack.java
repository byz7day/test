import java.util.ArrayList;

public class Stack<T> extends ArrayList<T>{
	//your code here
	int lange;
	public Stack() {
		lange=-1;
	}
	public Stack(int capacity) {
		lange = capacity;
	}
	public boolean push(T object) {
		if (lange==-1) {
			add(object);
			return true;
		}
		else {
			if (lange <= size()) {
				return false;
			}
			else {
				add(object);
				return true;
			}
		}
	}
	public T pop() {
		if(size() == 0) {
			return null;
		}
		else {
			return remove(size()-1);
		}
	}
	public T peek() {
		if(size() == 0) {
			return null;
		}
		else {
			return get(size()-1);
		}
	}
	public T[] toArray() {
		return (T[])super.toArray();
	}
	public String toString() {
		String Last=""; 
		for (int i=size()-1;i>=0;i--) {
			Last+=("|"+get(i)+"|"+"\n");
		}
		return Last+"===";
	}
}
