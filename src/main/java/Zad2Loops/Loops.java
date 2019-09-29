package Zad2Loops;

public class Loops {
    public void drawHalfTriangle(int n){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void drawDiagonalLine(int n){
        String spaces = "";
        for(int i = 0; i < n; i++) {
            System.out.println(spaces + "*");
            spaces += " ";
        }
    }

    public void drawZero(int n){
        for (int i = 0; i < n; i++ ) {
            if(i == 0 || i == n -1){
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for (int j = 1; j < n - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Time complexity: O(n^2), because nested loops
     * Memory complexity: O(1)
     * @param n
     */
    public void drawX(int n){
        for (int i = 0; i < n; i++) { // O(n)
            for (int j = 0; j < n; j++) { // O(n)
                if (i == j || i + j == n - 1) { // O(1)
                    System.out.print("* "); // O(1)
                } else {
                    System.out.print(" "); // O(1)
                }
            }
            System.out.println(); // O(1)
        }
    }
}
