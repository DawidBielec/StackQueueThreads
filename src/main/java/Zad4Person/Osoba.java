package Zad4Person;

public class Osoba {
    private String _name;
    private int _age;
    private Gender _sex;

    public Osoba(String name, int age, Gender sex){
        _name = name;
        _age = age;
        _sex = sex;
    }

    public String getName(){
        return _name;
    }

    public int getAge(){
        return _age;
    }

    public Gender getSex(){
        return _sex;
    }

    @Override
    public String toString(){
        return this._name + ", wiek " + this._age;
    }
}
