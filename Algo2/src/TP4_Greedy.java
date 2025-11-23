public class TP4_Greedy {

    public static void main(String[] args) {

        int[] coins = {20, 10, 5, 2, 1};
        System.out.println(minimalCoins(coins, 36));


    }

    private static int minimalCoins(int[] coins, int value) {
        if (value < 1) return 0;

        int coinsCount = 0;

        for (int coin : coins) {
            while (value - coin >= 0) {
                coinsCount++;
                value -= coin;
            }
        }

        return coinsCount;
    }

    private static int maxCakes(int[] cakes, int maxBagWeight) {
        return 0;
    }

}
