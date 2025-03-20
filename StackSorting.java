import java.util.Stack;

public class StackSorting {
    Stack<Integer> st = new Stack<>();

    public void push(int ele){
        st.push(ele);
    }

    public void insertInSortedOrder(int ele){
        if(st.isEmpty() || st.peek()<=ele){
            st.push(ele);
        }
        else{
            int topEle = st.peek();
            st.pop();
            insertInSortedOrder(ele);
            st.push(topEle);
        }
    }

    public void sortStack(){
        if(st.size()<=1){
            return;
        }
        int top = st.peek();
        st.pop();
        sortStack();
        insertInSortedOrder(top);
    }
    public void displayStack(){
        for(int i=st.size()-1;i>=0;i--){
            System.out.print(st.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        StackSorting stack = new StackSorting();
//        stack.insertInSortedOrder(3);
//        stack.insertInSortedOrder(8);
//        stack.insertInSortedOrder(1);
//        stack.insertInSortedOrder(2);
        stack.push(10);
        stack.push(2);
        stack.push(1);
        stack.push(8);
        stack.sortStack();
        stack.displayStack();
    }
}
