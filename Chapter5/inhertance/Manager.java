package Chapter5.inhertance;

public class Manager extends Employee{
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    private double bonus;
    public Manager(String name,double salary,int year,int month ,int day){
        super(name,salary,year,month,day);
        bonus = 0;
    }

//    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
}
