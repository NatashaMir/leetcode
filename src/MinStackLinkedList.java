import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class MinStackLinkedList {

    /** initialize your data structure here. */

    LinkedList<Integer> stack = new LinkedList<Integer>();
    LinkedList<Integer> min = new LinkedList<Integer>();

    public MinStackLinkedList() {
    }

    public void push(int val) {
        stack.add(val);
        if (min.isEmpty()){
            min.add(val);
        }
        else {
            min.add(Math.min(min.getLast(), val));
        }
    }

    public void pop() {
        stack.removeLast();
        min.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return min.getLast();
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