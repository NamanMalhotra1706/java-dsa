import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> st1 = new Stack<>();
    private Stack<Integer> st2 = new Stack<>();

    public void push(int ele){
        if(st1.isEmpty()){
            st1.push(ele);
        }
        else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            st1.push(ele);
            while(!st2.isEmpty()) {
                st1.push(st2.pop());
            }
        }
    }

    public int pop(){
        if(st1.isEmpty()){
            System.out.println("Queue is Empty.");
            return -1;
        }
        return st1.pop();
    }

    public int top(){
        if(st1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return st1.peek();
    }

    public boolean isEmpty(){
        return st1.isEmpty();
    }

    public void display(){
        while(!st1.isEmpty()){
            int ele = st1.pop();
            System.out.println(ele);
            st2.push(ele);
        }
        while(!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.push(5);
        queue.push(6);
        queue.push(7);
        queue.push(8);
        queue.display();
        queue.pop();
        System.out.println("Top element: "+ queue.top());
    }
}
