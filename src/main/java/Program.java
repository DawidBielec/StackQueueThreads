import Zad1Engine.*;
import Zad2Loops.Loops;
import Zad3Arrays.ArraysExercise;

public class Program {
    public static void main(String[] args){
        // Inheritance
        Engine car1 = new Car1();
        Engine car2 = new Car2();

        car1.drive();
        car2.drive();

        // Loops
        Loops loops = new Loops();
        loops.drawHalfTriangle(6);
        loops.drawDiagonalLine(6);
        loops.drawZero(6);
        loops.drawX(6);

        // Arrays
        ArraysExercise arrays = new ArraysExercise();
        arrays.InitializeAndFillArray(10);
        arrays.InitializeAndFillArrayWithPreviousMemberSum(10);
        arrays.InitializeAndFillArrayWithRandomNumbers(10, 15, 99);
        arrays.PrintArrayValues();
    }
}