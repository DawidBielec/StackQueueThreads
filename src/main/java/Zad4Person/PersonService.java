package Zad4Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService implements IPersonService {
    private List<Osoba> list = new ArrayList<Osoba>();

    public void displayMen(){
        System.out.println("Men are:");
        for (Osoba person: list) {
            if (person.getSex() == Gender.Man){
                System.out.println(person);
            }
        }
    }

    public void displayWomen(){
        System.out.println("Women are:");
        for (Osoba person: list) {
            if (person.getSex() == Gender.Woman){
                System.out.println(person);
            }
        }
    }

    public void displayOfAge(){
        System.out.println("Of age are:");
        for (Osoba person: list) {
            if (person.getAge() >= 18){
                System.out.println(person);
            }
        }
    }

    public void displayAgeIsDividableBy10(){
        System.out.println("People with age dividable by 10 are:");
        for (Osoba person: list) {
            if (person.getAge() % 10 == 0){
                System.out.println(person);
            }
        }
    }

    public void displaySumOfAllPeoplesAge(){
        System.out.println("Sum of all people's age:");
        int sum = 0;
        for (Osoba person: list) {
            sum += person.getAge();
        }
        System.out.println(sum);
    }

    public void displayPeopleWithSiInName(){
        System.out.println("People with 'si' in name are:");
        int sum = 0;
        for (Osoba person: list) {
            if (person.getName().contains("si")){
                System.out.println(person.toString());
            }
        }
    }

    public void addPersonToList(Osoba person){
        list.add(person);
    }
}
