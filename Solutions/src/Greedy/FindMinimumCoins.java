package Greedy;
import java.util.*;

// https://www.codingninjas.com/studio/problems/find-minimum-number-of-coins_8230766?challengeSlug=striver-sde-challenge&leftPanelTab=1
public class FindMinimumCoins {
    public static void main(String[] args) {

    }

    public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 1000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;

        for (int i = 0; i < coins.length; i++) {
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoins++;
                    amount -= coins[i];
                }
            }
        }
        return countOfCoins;
    }

}
