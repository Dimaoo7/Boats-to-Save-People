import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] prices = new int[]{1, 2, 2};
        int money = 3;
        System.out.println(buyChoco(prices, money));

    }
//    You are given an integer array prices representing the prices of various chocolates
//     in a store. You are also given a single integer money, which represents your initial amount of money.
//
//    You must buy exactly two chocolates in such a way that you still have some
//     non-negative leftover money. You would like to minimize the sum of the prices of the two chocolates you buy.
//
//    Return the amount of money you will have leftover after buying the two chocolates.
//     If there is no way for you to buy two chocolates without ending up in debt, return money.
//     Note that the leftover must be non-negative.


    public static int buyChoco(int[] prices, int money) {
        int minCost = Integer.MAX_VALUE;

        int n = prices.length;

        for (int firstChoco = 0; firstChoco < n; firstChoco++) {
            for (int secondChoco = firstChoco + 1; secondChoco < n; secondChoco++) {

                int cost = prices[firstChoco] + prices[secondChoco];

                if (cost < minCost) {
                    minCost = cost;
                }
            }
        }
        if (minCost <= money) {
            return money - minCost;
        } else {
            return money;
        }
    }
}

