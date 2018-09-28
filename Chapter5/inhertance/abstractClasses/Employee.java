package Chapter5.inhertance.abstractClasses;

import java.time.LocalDate;

public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String name,double salary,int year,int month,int day){
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    @Override
    public String getDescription() {
        return String.format("an employee with salary of $%.2f",salary);
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
