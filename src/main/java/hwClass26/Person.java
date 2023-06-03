package hwClass26;

import java.util.Map;
import java.util.TreeMap;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
class PersonTest {
    public static void main(String[] args) {
Person person1= new Person("John","Smith",25,50000);
Person person2= new Person("Jane","Smith",20,50000);
        TreeMap<Integer, Object> person = new TreeMap<>();
        person.put(2555,person1);
        person.put(2556,person2);
        for(Map.Entry<Integer,Object> pers : person.entrySet()){
            System.out.println(pers.getKey()+" "+pers.getValue());
        }
    }
}