import java.sql.PreparedStatement;
import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
         int arr[] = {1,3,-1,-3,5,3,6,7};

        Deque<Integer> queue = new ArrayDeque<>();
        int totalEle = arr.length;
        int windowSize = 3;
        int totalWindows = totalEle - windowSize + 1;
        int maxEle[] = new int [totalWindows];

        // First win --> 0,1,2
        int i = 0;
        while(i < windowSize){
            while(!queue.isEmpty() && arr[i]>=arr[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offerLast(i);
            i++;
        }
        maxEle[0] = arr[queue.peekFirst()];

        // Now Next all win -->1,2,3 && 2,3,1 till n-k+1;
        for(int j=1;j<totalEle-windowSize+1;j++){
            while(!queue.isEmpty() && queue.peekFirst()<=j-1){
                queue.pollFirst();
            }
            // Now new win become --> 1,2 --> prev its was 0,1,2 --> for first iteration
            // before adding new index in window make sure the new ele in index is smaller than previous element
            // else remove the all previous small elements
            // arr[j+windowSize+1] --> give new index ele;
            while(!queue.isEmpty() && arr[j+windowSize-1]>=arr[queue.peekLast()]){
                queue.pollLast();
            }

            // Now add new Indx to window
            queue.offerLast(j+windowSize-1);
            maxEle[j] = arr[queue.peekFirst()];
        }


        // print the max Element Win
        for(int j=0;j<maxEle.length;j++){
            System.out.print(maxEle[j]+" ");
        }
    }
}
