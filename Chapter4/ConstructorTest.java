package Chapter4;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args){
        ConstructorEmployee[] staff = new ConstructorEmployee[3];
        staff[0] = new ConstructorEmployee("Harry",40000);
        staff[1] = new ConstructorEmployee(60000);
        staff[2] = new ConstructorEmployee();

        for(ConstructorEmployee e:staff){
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }
    }

}
class ConstructorEmployee{
    private static int nextId;

    private int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    private String name;
    private double salary;

    static{
        Random generator = new Random();
        nextId = generator.nextInt(10000);
        System.out.println("static code block");
    }

    {
        id = nextId;
        nextId++;
        System.out.println("code block");
    }

    public ConstructorEmployee(String n,double s){
        name = n;
        salary = s;
    }

    public ConstructorEmployee(double s){
        this("ConstrutorEmployee"+nextId,s);
    }

    public ConstructorEmployee(){

    }

}
