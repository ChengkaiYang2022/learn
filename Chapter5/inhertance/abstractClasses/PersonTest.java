package Chapter5.inhertance.abstractClasses;

public class PersonTest {
    public static void main(){
        Person[] people = new Person[2];
        people[0] = new Employee("Harry Hacker",5000,1989,10,1);
        people[1] = new Student("Maria Morris","computer sciencs");

        for (Person p:people){
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
