import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxInt(1,2));

        displayAllLess(7);

        System.out.println(tabMinIterative(new int[]{6, 2, 3}));

        System.out.println(tabMinRecursive(new int[]{6, 7, 2, 3, 1}, 4));

    }

    private static int maxInt(int first, int second) {
        if (first > second) {
            return first;
        } else  {
            return second;
        }
    }

    private static void displayAllLess(int num) {
        if (num < 1) return;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(i);
        }
        System.out.println(list);
    }

    private static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static int tabMinIterative(int[] tab) {
        int minValue = tab[0];

        for(int index = 1; index < tab.length; index++) {
            if(tab[index] < minValue) {
                minValue = tab[index];
            }
        }

        return minValue;
    }

    public static int tabMinRecursive(int[] tab, int index) {
        if(index == 0) {
            return tab[0];
        }

        int minValue = tabMinRecursive(tab, index - 1);

        if(minValue < tab[index]) {
            return minValue;
        }
        else {
            return tab[index];
        }
    }

    public static int sumIterative(int n) {
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static int sumRecursive(int n) {
        if (n <= 0) {
            return 0;
        }

        return n + sumRecursive(n - 1);
    }

    public static String invertIterative(String str) {
        StringBuilder reversed = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    public static String invertRecursive(String str) {
        if(str == null || str.length() <= 1) {
            return str;
        }

        return invertRecursive(str.substring(1)) + str.charAt(0);
    }


}