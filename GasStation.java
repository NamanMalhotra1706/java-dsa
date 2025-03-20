import java.util.*;

public class GasStation {
    public static void main(String[] args) {
        int gas[] = {1,2,3,4,5};
        int cost[] = {3,4,5,1,2};

        int totalGasConsume = Arrays.stream(gas).sum();
        int totalCost = Arrays.stream(cost).sum();

        System.out.println("Total Gas: " + totalGasConsume);
        System.out.println("Total Cost: " + totalCost);

        if (totalGasConsume < totalCost) {
            System.out.println("Cannot make a circular path as cost is more than fuel available.");
        } else {
            int ansIx = 0;
            int totalCos = 0;

            for (int i = 0; i < gas.length; i++) {
                totalCos += gas[i] - cost[i];
                if (totalCos < 0) {
                    totalCos = 0;
                    ansIx = i + 1;
                }
            }

            System.out.println("Starting index: " + ansIx);
        }
    }
}
