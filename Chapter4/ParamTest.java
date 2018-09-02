package Chapter4;

public class ParamTest {
    public static void main(String[] args){
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        System.out.println("\nTesting tripleSalary:");
        Employee harry = new Employee("Harry",5000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleValue(harry);
        System.out.println("After: salary=" + harry.getSalary());

        Employee a = new Employee("Alice",70000);
        Employee b = new Employee("Bob",60000);
        System.out.println("Before: a="+a.getName());
        System.out.println("Before: b="+b.getName());

        swap(a,b);
        System.out.println("After: a="+a.getName());
        System.out.println("After: b="+b.getName());
    }
    public static void swap(Employee x,Employee y){
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x="+x.getName());
        System.out.println("End of method: y="+y.getName());
    }
    public static void tripleValue(double x){
        x = x * 3;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleValue(Employee x){
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }


}