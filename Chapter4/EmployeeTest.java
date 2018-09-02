package Chapter4;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker",75000,1987,12,15);
        staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
        staff[2] = new Employee("Tony Tester",40000,1993,3,15);

        for(Employee e:staff){
            e.raiseSalary(5);
        }

        for(Employee e:staff){
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
        staff[1].setId();
        staff[2].setId();
        System.out.println(Employee.getNextId());

    }

}
class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;
    private static int nextId = 1;
    private int id;
    public void setId(){
        id = nextId;
        nextId++;
    }
    public static int getNextId(){
        return nextId;
    }
    public Employee(String n,double s,int year,int month,int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }


}