package Chapter9.treeSet;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/* *
 *
 * This programme sorts a set of item by comparing their description.
 * @version 1.0.0
 * @author yanchengkai
 *
 */
public class TreeSetTest
{
    public static void main(String[] args){
        SortedSet<Item> parts = new TreeSet<>();

        parts.add(new Item("Toaster",1234));
        parts.add(new Item("Widget",4562));
        parts.add(new Item("Modem",9912));

        System.out.println(parts);

        NavigableSet<Item> sortByDescription = new TreeSet<>(
                Comparator.comparing(Item::getDescription)
        );

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}