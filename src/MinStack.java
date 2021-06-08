import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MinStack {

    /** initialize your data structure here. */

    List<Integer> stack = new ArrayList<Integer>();

    public MinStack() {

    }

    public void push(int val) {
        stack.add(val);
    }

    public void pop() {
        stack.remove(stack.size()-1);
    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int getMin() {
        return Collections.max(stack);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */