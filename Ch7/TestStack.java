// This class defines an integer stack that can hold 10 values.
class Stack {
	/* Now, both stck and tos are private. This means that they cannot be accidentally
	 * or maliciously altered in a way that would be harmful to the stack
	 */
	private int stck[] = new int[10];
	private int tos;

	// Initialze top-of-stack
	Stack() {
		tos = -1;
	}

	// Push an item onto the stack
	void push(int item) {
		if(tos == 9) 
			System.out.println("Stack us full.");
		else
			stck[++tos] = item;
	}

	// Pop an item from the stack
	int pop() {
		if(tos < 0) {
			System.out.println("Stack underflow");
			return 0;
		}
		else
			return stck[tos--];
	}
}

class TestStack {
	public static void main(String args[]) {
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();

		// push some numbers onto the stack
		for(int i=0; i<10; i++) mystack1.push(i);
		for(int i=10; i<20; i++) mystack2.push(i);

		// pop those numbers off the stack
		System.out.println("Stack in mystack1: ");
		for(int i=0; i<10; i++)
			System.out.println(mystack1.pop());

		System.out.println("Stack in mystack2: ");
		for(int i=0; i<10; i++)
			System.out.println(mystack2.pop());

		// these statements are not legal
		// mystack1.tos = -2;
		// mystack.stk[3] = 100;
		}
}




