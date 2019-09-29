import Zad1Engine.*;
import Zad2Loops.Loops;
import Zad3Arrays.ArraysExercise;
import Zad4Person.*;
import Zad5PseudoCodeAlgorithms.AlgorithmsFromPseudoCode;
import Zad6Interfaces.StringCustom;
import Zad7Arrays.ArrayTasks;
import Zad8Stack_and_Queue.Stack;
import Zad8Stack_and_Queue.StackArray;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

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

        // Class with properties
        IPersonService personService = new PersonService();
        personService.addPersonToList(new Osoba("Artur", 15, Gender.Man));
        personService.addPersonToList(new Osoba("Basia", 30, Gender.Woman));
        personService.addPersonToList(new Osoba("Paweł", 20, Gender.Man));
        personService.addPersonToList(new Osoba("Kasia", 25, Gender.Woman));
        personService.addPersonToList(new Osoba("Marcin", 101, Gender.Man));

        personService.displayMen();
        personService.displayWomen();
        personService.displayOfAge();
        personService.displayAgeIsDividableBy10();
        personService.displaySumOfAllPeoplesAge();
        personService.displayPeopleWithSiInName();

        // Algorithms from pseudoCode
        System.out.println("Sum 2 + 3: " + AlgorithmsFromPseudoCode.sum(2,3));
        System.out.println(AlgorithmsFromPseudoCode.sum(Integer.MAX_VALUE, Integer.MAX_VALUE));

        System.out.println("Factorial 5!: " + AlgorithmsFromPseudoCode.factorial(5));

        AlgorithmsFromPseudoCode.fibonacci(2);

        System.out.println("Is sum of two numbers dividable by 3: a = 1, b = 5: " + AlgorithmsFromPseudoCode.isSumDividableBy3(1,5));
        System.out.println("Is sum of two numbers dividable by 3: a = 2, b = 3: " + AlgorithmsFromPseudoCode.isSumDividableBy3(2,3));

        System.out.println("Is 31 prime number: " + AlgorithmsFromPseudoCode.isPrimeNumber(17));
        System.out.println("Is 100 prime number: " + AlgorithmsFromPseudoCode.isPrimeNumber(100));

        // StringCustom - interfejsy i ich implementacje
        StringCustom sc1 = new StringCustom("alA mA kOta");
        StringCustom sc2 = new StringCustom("atoK aM ala");
        int areEqual = sc1.compareTo(sc2);
        System.out.println(areEqual);
        System.out.println(sc1.toString());
        System.out.println(sc2.toString());
        System.out.println(sc1.subSequence(5,11));
        System.out.println(sc1.charAt(0));

        // Array tasks - collections
        // uncomment below code to test these methods!
        for (long item : ArrayTasks.fibonacci(10)){
            System.out.print(item + " ");
        }

//        int[] arr1 = ArrayTasks.readArrayFromIo();
//        int[] arr2 = ArrayTasks.readArrayFromIo();
//        long[] sumOfArrays = ArrayTasks.addArrays(arr1, arr2);
//        for (long item : sumOfArrays){
//            System.out.print(item + " ");
//        }
        System.out.println();

        // Stack & Queue
        System.out.println("---STACK---");
        Stack<Osoba> stck = new Stack<Osoba>();
        stck.push(new Osoba("Joanna", 23, Gender.Woman));
        stck.push(new Osoba("Marek", 35, Gender.Man));
        stck.push(new Osoba("Krzysztof", 33, Gender.Man));

        System.out.println("Last element when peek: " + stck.peek());
        System.out.println("Last element when peek again: " + stck.peek());
        System.out.println("Calling pop: " + stck.pop());
        System.out.println("Last element after pop: " + stck.peek());

        System.out.println("---STACK array---");
        StackArray<Osoba> stck2 = new StackArray<Osoba>();
        stck2.push(new Osoba("Joanna", 23, Gender.Woman));
        stck2.push(new Osoba("Marek", 35, Gender.Man));
        stck2.push(new Osoba("Krzysztof", 33, Gender.Man));

        System.out.println("Last element when peek: " + stck2.peek());
        System.out.println("Last element when peek again: " + stck2.peek());
        System.out.println("Calling pop: " + stck2.pop());
        System.out.println("Last element after pop: " + stck2.peek());

        StackArray<Integer> stck3 = new StackArray<Integer>();
        stck3.push(3);
        stck3.push(8);
        stck3.push(5);

        System.out.println("Last element when peek: " + stck3.peek());
        System.out.println("Last element when peek again: " + stck3.peek());
        System.out.println("Calling pop: " + stck3.pop());
        System.out.println("Last element after pop: " + stck3.peek());

    }
}