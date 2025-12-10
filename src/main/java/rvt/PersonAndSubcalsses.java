package rvt;

import java.util.ArrayList;

public class PersonAndSubcalsses {
    
    public static void main(String[] args) {
        // Šeit vari testēt savu kodu, piemēram:

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }
    
    // 5. daļa
    public static void printPersons(ArrayList<Person> persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}

// 1. daļa
class Person {
    private String name;
    private String address;
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    @Override
    public String toString() {
        return name + " " + address;
    }
}

// 2. un 3. daļa
class Student extends Person {
    private int credits;
    
    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }
    
    public void study() {
        credits++;
    }
    
    public int credits() {
        return credits;
    }
    
    // 3. daļa – pārdefinējam toString
    @Override
    public String toString() {
        return super.toString() + " Study credits " + credits;
    }
}

// 4. daļa
class Teacher extends Person {
    private int salary;
    
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + " salary " + salary + " euro/month";
    }
}