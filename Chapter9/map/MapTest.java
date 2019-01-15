package Chapter9.map;

import Chapter5.inhertance.Employee;

import java.util.HashMap;
import java.util.Map;

/* *
 * this programme demonstrates the use of a map with key type String and value type Employee.
 * @author yangchengkai
 */
public class MapTest
{
    public static void main(String[] args)
    {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5664",new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hakcer"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Franceca Cruz"));

        System.out.println(staff);
        staff.remove("567-24-2546");

        staff.put("456-62-5527", new Employee("Framcesca Miller"));
        System.out.println(staff.get("157-62-7935").getName());

        staff.forEach((k,v) -> System.out.println("key=" + k + ", value=" + v.getName()));
    }
}

