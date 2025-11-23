import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TP3 {

    public static void main(String[] args) {
//        bogosort
//        int[] tab = {3, 1, 5};
//        orderTab(tab);
//        System.out.println(Arrays.toString(tab));

//        divisors
        System.out.println(getDivisors(9));
    }


//    bogosort
    private static void orderTab(int[] tab){
        Random rand = new Random();
        while (!isSorted(tab)) {
            shuffleArray(tab, rand);
        }
    }

    private static boolean isSorted(int[] tab) {
        for (int i = 1; i < tab.length; i++) {
            if (tab[i-1] > tab[i]) {
                return false;
            }
        }
        return true;
    }

    public static void shuffleArray(int[] tab, Random random) {
        for (int i = tab.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = tab[i];
            tab[i] = tab[index];
            tab[index] = temp;
        }
    }
//    ---


//    divisors
    public static List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }

        return divisors;
    }
//    ---



}
