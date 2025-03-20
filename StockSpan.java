import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,75,85};

        Stack<Integer> st = new Stack<>();

        int spanCount[] = new int[arr.length];

//        for(int i=0;i<arr.length;i++){
//            st.push(arr[i]);
//        }

//        while(!st.isEmpty()){
//            int count=0;
//            for(int i=0;i<st.size();i++){
//                if(arr[i]>st.peek()){
//                    continue;
//                }
//                else{
//                    count++;
//                }
//            }
//            spanCount[st.size()-1] = count;
//            st.pop();
//        }


        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()){
                spanCount[i] = 1;
            }
            else if(arr[st.peek()]>arr[i]){
                spanCount[i]=1;
            }
            else{
                spanCount[i]=1;
                while(arr[i]>=arr[st.peek()]){
                    int top = st.pop();
                    spanCount[i] = spanCount[i] + spanCount[top];
                }
            }
            st.push(i);
        }

        for(int i=0;i<spanCount.length;i++){
            System.out.print(spanCount[i]+" ");
        }
    }
}
