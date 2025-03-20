import java.util.HashMap;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        int ans[] = new int[2];

        boolean isPairExist = false;
        for(int i=0;i<ans.length;i++){
            if(map.containsKey(target-arr[i])){
                isPairExist = true;
                break;
            }
        }
        System.out.println(isPairExist ? "true" : "false");
    }
}
