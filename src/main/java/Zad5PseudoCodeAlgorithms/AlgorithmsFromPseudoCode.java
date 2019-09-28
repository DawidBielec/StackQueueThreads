package Zad5PseudoCodeAlgorithms;

/***
 * Method returns fibonacci sequence for a nmber
 *
 * @param n number of sequence elements
 */
public class AlgorithmsFromPseudoCode {
    public static long sum(int a, int b){
        return a + b;
    }

    public static int factorial(int n){
        int result = 1;
        if (n < 2){
            return result;
        }

        for (int i = 2; i <= n; i++){
            result *= i;
        }

        return result;
    }

    /***
     * Method returns fibonacci sequence for a nmber
     *
     * @param n number of sequence elements
     */
    public static void fibonacci(int n){
        System.out.print("Fibonacci for number " + n + ": ");
        int n1 = 0;
        int n2 = 1;

        if (n < 2){
            System.out.println(n1);
            return;
        }

        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        if (n == 2){
            System.out.println();
            return;
        }

        int n3 = 0;

        for (int i = 2; i <= n; i++){
            n3 = n1 + n2;
            System.out.print(n3 + " ");

            n1 = n2;
            n2 = n3;
        }

        System.out.println();
    }

    public static boolean isSumDividableBy3(int a, int b){
        long sum = AlgorithmsFromPseudoCode.sum(a,b);
        return (sum % 3) == 0;
    }

    public static boolean isPrimeNumber(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}