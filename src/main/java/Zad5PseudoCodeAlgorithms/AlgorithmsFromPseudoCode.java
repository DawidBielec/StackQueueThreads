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

    /**
     * Time complexity: O(n)
     * Memory complexity: O(1)
     * @param n
     * @return
     */
    public static int factorial(int n){
        int result = 1; // O(1)
        if (n < 2){ // O(1)
            return result;
        }

        for (int i = 2; i <= n; i++){ // O(n)
            result *= i; // O(1)
        }

        return result;
    }

    /**
     * Method returns fibonacci sequence for a nmber
     * Time complexity: O(n)
     * Memory / space complexity: O(1)
     * @param n number of sequence elements
     */
    public static void fibonacci(int n){
        System.out.print("Fibonacci for number " + n + ": "); // O(1)
        int n1 = 0; // O(1)
        int n2 = 1; // O(1)

        if (n < 2){ // O(1)
            System.out.println(n1); // O(1)
            return;
        }

        System.out.print(n1 + " "); // O(1)
        System.out.print(n2 + " "); // O(1)
        if (n == 2){ // O(1)
            System.out.println(); // O(1)
            return;
        }

        int n3 = 0; // O(1)

        for (int i = 2; i <= n; i++){ // O(n)
            n3 = n1 + n2; // O(1)
            System.out.print(n3 + " "); // O(1)

            n1 = n2; // O(1)
            n2 = n3; // O(1)
        }

        System.out.println(); // O(1)
    }

    public static boolean isSumDividableBy3(int a, int b){
        long sum = AlgorithmsFromPseudoCode.sum(a,b);
        return (sum % 3) == 0;
    }

    /**
     * Time complexity: O(sqrt(n))
     * Memory complexity: O(1)
     * @param n
     * @return
     */
    public static boolean isPrimeNumber(int n){
        for (int i = 2; i < Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }

    /**
     * Time complexity: O(n)
     * Memory complexity: O(1)
     * @param n
     * @return
     */
    public static boolean isPrimeNumberNaive(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}