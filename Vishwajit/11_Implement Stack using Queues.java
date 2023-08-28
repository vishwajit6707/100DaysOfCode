// Implement Stack using Queues
// Problem link - https://leetcode.com/problems/implement-stack-using-queues/
class MyStack {
    List<Integer> list;
    public MyStack() {
        list = new ArrayList<>();
    }
    
    public void push(int x) {
        list.add(x);
    }
    
    public int pop() {
        int x = list.get(list.size()-1);
        list.remove(list.size()-1);
        return x;
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public boolean empty() {
        return list.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
