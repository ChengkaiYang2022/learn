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
        //;
        setBonusZero(staff[1]);

    }
    // 注意一个类中变量在自身的函数中修改值是会改变变量值的,也就是类指向同一内存地址
    public static void setBonusZero(Employee e){
        e.setSalary(0);
        setBonusOne(e);
    }
    public static void setBonusOne(Employee e){
        e.setSalary(1);
    }
}
class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;
    private static int nextId = 1;
    private int id;
    public Employee(String name){
        this.name = name;

    }
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
    public Employee(String n,double s){
        name = n;
        salary = s;
    }

    public String getName(){
        return name;
    }
    public void setSalary(double salary){
        this.salary = salary;
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